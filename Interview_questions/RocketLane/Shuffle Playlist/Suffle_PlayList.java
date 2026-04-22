import java.util.*;

class Solution{

    List<List<String>> suffulePlayList(List<List<String>> playList){
        List<List<String>> res = new ArrayList<>();

        HashMap<String ,Artist> map = new LinkedHashMap<>();

        PriorityQueue<Artist> pq = new PriorityQueue<>((a ,b) -> (a.noOfSongs == b.noOfSongs) 
                                    ? Integer.compare(a.songs.peek().index ,b.songs.peek().index) : Integer.compare(b.noOfSongs, a.noOfSongs));

        for(int i = 0; i < playList.size(); i++){
            List<String> song = playList.get(i);

            Artist artist = map.getOrDefault(song.get(1), new Artist(song.get(1)));
            artist.addSongs(song.get(0) , i);

            if(map.get(song.get(1)) == null){
                map.put(song.get(1) ,artist);
            }
        }

        for(String name : map.keySet()){
            pq.offer(map.get(name));
        }

        String prev = "-1";

        while(!pq.isEmpty()){
            Artist artist = pq.poll();
            if(artist.name.equals(prev) && !pq.isEmpty()){
                Artist secondArtist = pq.poll();
                prev = secondArtist.name;

                res.add(new ArrayList<>(Arrays.asList(secondArtist.getSong() ,secondArtist.name)));

                if(secondArtist.noOfSongs != 0){
                    pq.offer(secondArtist);
                }
                pq.offer(artist);
            }else{
                prev = artist.name;
                res.add(new ArrayList<>(Arrays.asList(artist.getSong() ,artist.name)));

                if(artist.noOfSongs != 0){
                    pq.offer(artist);
                }
            }
        }

        return res;
    }

}

class Artist{
    String name;
    Queue<Song> songs;
    int noOfSongs;
    Artist(String name){
        this.name = name;
        songs = new LinkedList<>();
        noOfSongs = 0;
    }

    void addSongs(String song ,int index){
        songs.offer(new Song(song, index));
        noOfSongs++;
    }

    String getSong(){
        noOfSongs--;
        return songs.poll().name;
    }
}

class Song{
    String name;
    int index;
    Song(String name ,int index){
        this.name = name;
        this.index = index;
    }
}

public class Suffle_PlayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        List<List<String>> playList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String song = sc.next();
            String artist = sc.next();
            playList.add(new ArrayList<>(Arrays.asList(song ,artist)));
        }

        Solution sol = new Solution();

        List<List<String>> suffuledPlayList = sol.suffulePlayList(playList);

        for(List<String> song : suffuledPlayList){
            System.out.println(song);
        }

        sc.close();  
    }
}