import java.util.Scanner;

public class Node {
    private int memory;
    private int processors;

    public Node(int processors, int memory) {
        this.memory = memory;
        this.processors = processors;
        askForProcessors();
    }

    private void askForProcessors() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange prossesorer ønsker du å bruke? ");
        System.out.println("Du bruker " + processors + "prosessorer");
    }


    public int getMemory() {
        return memory;
    }

    public int getProcessors() {
        return processors;
    }

//    public int nodesWithEnoughMemory(int requiredMemory) {
//        return (int numberOfNodes, int GByte)
//    }
}