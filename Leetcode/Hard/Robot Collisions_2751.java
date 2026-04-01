import java.util.*;
class RobotCollisions {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        
        int len=positions.length;
        List<Element> robots = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<len;i++){
            robots.add(new Element(positions[i],i));
        }

        Collections.sort(robots,(a,b)-> a.position-b.position);

        Stack<Element> stk= new Stack<>();

        for(Element robot:robots){
            if(directions.charAt(robot.index)=='R'){
                stk.push(robot);
            }else{
                while(!stk.isEmpty()){
                    if(healths[robot.index]==healths[stk.peek().index]){
                        healths[robot.index]=0;
                        healths[stk.peek().index]=0;
                        stk.pop();
                        break;
                    }else if(healths[robot.index]>healths[stk.peek().index]){
                        healths[robot.index]-=1;
                        healths[stk.peek().index]=0;
                        stk.pop();
                    }else{
                        healths[robot.index]=0;
                        healths[stk.peek().index]-=1;
                        break;
                    }
                }
            }
        }

        for(int life : healths){
            if(life!=0)result.add(life);
        }


        return result;
    }
}

class Element{
    int position;
    int index;

    Element(int pos,int ind){
        this.position = pos;
        this.index = ind;
    }
}