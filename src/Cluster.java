import java.util.List;
import java.util.ArrayList;

public class Cluster {
    private List<Rack> racks;
    private static final int MAX_NODES_PER_RACK = 12;

    public Cluster() {
        racks = new ArrayList<>();
    }
        public void addNode (Node node){
            boolean nodeAdded = false;
            for (Rack rack : racks) {
                if (rack.addNode(node)) {
                    nodeAdded = true;
                    break;
                }
            }

            if (!nodeAdded) {
                Rack newRack = new Rack();
                newRack.addNode(node);
                racks.add(newRack);
            }
        }

        public int nodesWithEnoughMemory ( int requiredMemory){
            int number = 0;
            for (Rack rack : racks) {
                number += rack.nodesWithEnoughMemory(requiredMemory);
            }
            return number;
        }

        public List<Rack> getRacks () {
            return racks;
        }

        //TODO Method for dispaling num of nodes in cluster
        //TODO method for fetching node based on index
        //TODO method to remove node

    }

