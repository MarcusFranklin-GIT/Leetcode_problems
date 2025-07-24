public class String_compress {
    public static void main(String []args){
        String S = "aaabbbcccdde";
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for(int i=0;i<S.length();i++){
            if(i < S.length() - 1 && S.charAt(i) == S.charAt(i+1)) {
                count++;
            } else {
                compressed.append(S.charAt(i));
                if(count >= 1) {
                    compressed.append(count);
                }
                count = 1; 
            }
        }
        System.out.println(compressed.toString());
    }
    
}
