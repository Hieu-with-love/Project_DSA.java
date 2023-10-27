package MainPackage;

public class TabList {
    public NodeTab head;
    public NodeTab tail;
    public TabList (){
        this.head = null;
        this.tail = null;
    }
    public void addTab(String url){
        NodeTab newNodeTab = new NodeTab(url);
        System.out.println("Page current is 0"+ newNodeTab.getNumber());
        if (head == null){
            head = tail = newNodeTab;
        }
        else{
            tail.next = newNodeTab;
            newNodeTab.prev = tail;
            tail = newNodeTab;
        }
    }
    public void deleteHeadTab(){
        if (head == null){
            System.out.println("Danh sach tab rong.");
            return ;
        }
        else if (head == tail){
            System.out.println("Danh sach chi co mot phan tu. Sau khi xoa xong danh sach rong.");
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
            System.out.println("Xoa thanh cong tab dau tien.");
        }
    }
    public void deleteTailTab(){
        if (head == null){
            System.out.println("Danh sach tab rong.");
            return ;
        }
        else if (head == tail){
            System.out.println("Danh sach chi co mot phan tu. Sau khi xoa xong danh sach rong.");
            head = tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
            System.out.println("Xoa thanh cong tab cuoi cung.");
        }
    }
    public void seeCurrentTab(){
        try {
            System.out.println("Thong tin cua tab hien tai " + this.tail.data);
        }
        catch(NullPointerException ex){
            System.out.println("Current exception is " + ex.getMessage());
        }
    }
}
