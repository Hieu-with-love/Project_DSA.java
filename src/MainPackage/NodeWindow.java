package MainPackage;
// WindowNode.
public class NodeWindow {
    private static int number = 0; // Đếm số lượng window hiện có.
    public TabList data;
    public NodeWindow prev;
    public NodeWindow next;
    public static int getNumber(){
        return number;
    }
    public static void increase(){
        number += 1;
    }
    public static void reduce(){
        if (number > 0){
            number -= 1;
        }
    }
    public NodeWindow(TabList data){
        number += 1;
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
