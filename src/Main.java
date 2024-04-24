public class Main {
    public static void main(String[] args) {
        Cluster saga = new Cluster();

        //TODO implementasjon som gjør at brukeren kan velge minne og antallet prossessorer(nodefilen)
        for (int i = 0; i < 450; i++) {
            saga.addNode(new Node(4, 512));
    }
        for (int i = 0; i < 16; i++) {
            saga.addNode(new Node(8, 1024));
    }

        //number of nodes with atleast 128GB, 512GB and 1024GB ov memory
        System.out.println("Nodes with atleast 128GB of memory "+ saga.nodesWithEnoughMemory(128));
        System.out.println("Nodes with atleast 512GB of memory "+ saga.nodesWithEnoughMemory(512));
        System.out.println("Nodes with atleast 1024GB of memory "+ saga.nodesWithEnoughMemory(1024));

        //numbers of cpu
        int totalProcessors = 0;
        for (Rack rack : saga.getRacks())    {
        totalProcessors += rack.getTotalProcessors();
    }

        System.out.println("Numbers of processors: " + totalProcessors);

        System.out.println("Number of racks: " + saga.getRacks().size());

    }

}

//TODO Change code so that the program dont run in a loop
