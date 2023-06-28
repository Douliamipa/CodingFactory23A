package gr.uaeb.cf.ch19;

public class NodeGenericApp {
    public static void main(String[] args) {
        NodeGeneric<Integer> nodeInt = new NodeGeneric<Integer>();

        //mporoume kai
        //var nodeInt1 = new NodeGeneric<Integer>();

        NodeGeneric<String> nodeStr = new NodeGeneric<>();

        nodeInt.setValue(3);
        nodeStr.setValue("COding");

        //compile time safety

    }
}
