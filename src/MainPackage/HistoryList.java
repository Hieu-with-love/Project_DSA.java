package MainPackage;

public class HistoryList {
    private NodeHistory head;
    private NodeHistory tail;
    public HistoryList(){
        this.head = null;
        this.tail = null;
    }
    public void addHistory(String thongbao){
        NodeHistory newNodeHistory = new NodeHistory(thongbao);
        if (head == null){
            head = tail = newNodeHistory;
        }
        else{
            newNodeHistory.next = head;
            head.prev = newNodeHistory;
            head = newNodeHistory;
        }
    }
    public void seeLatestHistory(){
        try{
            System.out.println("Thao tac moi nhat ma ban thuc hien la: " + head.getThongbao());
        }
        catch(NullPointerException ex){
            System.out.println("Current exception is: " + ex.getMessage());
        }
    }
    public void seeOldestHistory(){
        try{
            System.out.println("Thao tac cu nhat ma ban thuc hien la: " + tail.getThongbao());
        }
        catch(NullPointerException ex){
            System.out.println("Current exception is: " + ex.getMessage());
        }
    }
    public void seeFullHistory(){
        NodeHistory curr = head;
        while(curr != null){
            System.out.println("Toan bo thao tac ban vua thuc hien tu moi nhat den cu nhat" +
                    " la: " + curr.getThongbao());
            curr = curr.next;
        }
    }
}
