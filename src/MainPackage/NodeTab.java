package MainPackage;

public class NodeTab {
    private static int number = 0;
    public String data;
    public NodeTab prev;
    public NodeTab next;
    public static int getNumber(){
        return number;
    }

    public NodeTab(String url){
        number += 1;
        this.data = url;
        this.prev = null;
        this.next = null;
    }
}
