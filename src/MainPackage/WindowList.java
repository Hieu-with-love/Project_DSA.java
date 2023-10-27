package MainPackage;

// Danh sach cac window. Moi phan tu window la mot node

public class WindowList {
    private static int count = 1;
    private NodeWindow head;
    private NodeWindow tail;
    private NodeWindow currentWindow;
    public WindowList(){
        head = null;
        tail = null;
        currentWindow = null;
        count++;
    }

    public void addWindow(TabList data){
        NodeWindow newNodeWindow = new NodeWindow(data);
        if (head == null){
            head = tail = newNodeWindow;
        }
        else{
            tail.next = newNodeWindow;
            newNodeWindow.prev = tail;
            tail = newNodeWindow;
        }
        currentWindow = newNodeWindow;
        //System.out.println("====     WINDOW 0" + NodeWindow.getNumber() + "   ====");
    }
    public void printCurrentWindow(){

        try{
            System.out.println("Thong tin window so 0"+ count + " " + currentWindow.data.tail.data);
        }
        catch(NullPointerException ex){
            System.out.println("Current exception is: " + ex.getMessage());
        }
    }
    public void printWindowList(){
        NodeWindow curr = head;
        int count = 1;
        while (curr != null){
            System.out.println("Thong tin window thu " + count + " la : " + curr.data.head.data);
            count += 1;
            curr = curr.next;
        }
    }
    public void deleteWindow(){
        if (head == null){
            System.out.println("Danh sach hien tai dang rong.");
            return ;
        }
        else if (head == tail){
            System.out.println("Danh sach chi co mot phan tu. Danh sach rong sau khi xoa");
            head = tail = null;
            currentWindow = null;
            return ;
        }
        else{
            NodeWindow.reduce();
            tail = tail.prev;
            tail.next = null;
            currentWindow = tail;
        }
    }
    public void nextWindow(NodeWindow curr){
        if (head == null){
            System.out.println("Danh sach window rong");
            return ;
        } else if (head == tail) {
            System.out.println("Danh sach chi co mot window. Khong co window khac de di chuyen.");
        }
        else{

        }
    }
    public void backWindow(){
        if (head == null){
            System.out.println("Danh sach window rong");
            return ;
        } else if (head == tail) {
            System.out.println("Danh sach chi co mot window. Khong co window khac de di chuyen.");
        } else if (head == currentWindow) {
            System.out.println("Ban dang o window dau tien, khong co window truoc do de tro ve.");
        } else{
            currentWindow = currentWindow.prev;
            System.out.println("Ban da chuyen den window truoc do.");
        }
        NodeWindow.reduce();
    }
    public void nextWindow(){
        if (head == null){
            System.out.println("Danh sach window rong");
            return ;
        } else if (head == tail) {
            System.out.println("Danh sach chi co mot window. Khong co window khac de di chuyen.");
        } else if (tail == currentWindow) {
            System.out.println("Ban dang o window cuoi cung, khong co window sau do de di chuyen.");
        }else{
            currentWindow = currentWindow.next;
            System.out.println("Ban da chuyen den window sau do.");
        }
        NodeWindow.increase();
    }
}
