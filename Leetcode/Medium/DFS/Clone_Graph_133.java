import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Clone_Graph_133 {
    public Node cloneGraph(Node node) {
        if(node==null)return node;

        HashMap<Node,Node> map = new HashMap<>();
        map.put(node,new Node(node.val));

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            Node curr = q.poll();

            for(Node neighbor : curr.neighbors){
                if(map.get(neighbor)==null){
                    map.put(neighbor,new Node(neighbor.val));
                    q.add(neighbor);
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }    
        return map.get(node);    
    }
}