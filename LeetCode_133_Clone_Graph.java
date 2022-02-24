public class LeetCode_133_Clone_Graph {
    /* Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

class Node {
    public int val;
    public List<Node> neighbors;

} */

    //SOLUTION-->
    class Solution {
        public Node cloneGraph(Node node) {
            if (node == null)
                return node;
            Map<Node, Node> map = new HashMap<>();
            Queue<Node> queue = new LinkedList<>();
            queue.offer(node); //adding the value in queue
            map.put(node, new Node(node.val)); //adding the value in map
            while (!queue.isEmpty()) {
                Node curr = queue.poll(); //it will return and remove the front-end element in queue
                for (Node neigh : curr.neighbors) {
                    if (!map.containsKey(neigh)) {
                        map.put(neigh, new Node(neigh.val));
                        queue.offer(neigh);
                    }
                    map.get(curr).neighbors.add(map.get(neigh));//adding the neighbour element in map
                }
            }
            return map.get(node);       // return the head
        }
    }
}
