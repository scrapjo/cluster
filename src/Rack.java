public class Rack {
    private Node[]  nodes;
    private static final int MAX_NODES = 12;

    public Rack() {
        nodes = new Node[MAX_NODES];
    }

   public boolean addNode(Node node) {
       for (int i = 0; i < MAX_NODES; i++) {
           if (nodes[i] == null) {
               nodes[i] = node;
               return true;
           }
       }
       System.out.println("The rack is full, no room for more nodes");
       return false;
   }

   public int nodesWithEnoughMemory(int requiredMemory) {
       int number = 0;
       for (Node n : nodes) {
           if (n !=null && n.getMemory() >= requiredMemory){
               number++;
           }
       }
       return number;
       }

   public int getTotalProcessors() {
        int totalProcessors = 0;
        for (Node node : nodes) {
            if (node !=null) {
                totalProcessors += node.getProcessors();
            }
        }
        return totalProcessors;
   }

    //TODO method for removing nodes
    //TODO method for fetching node based on index
    //TODO methid for display number of nodes in the rack
}
