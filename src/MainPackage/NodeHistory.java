package MainPackage;

public class NodeHistory {
    private static int number;
    private String thongbao;
    public NodeHistory prev;
    public NodeHistory next;
    public static int getNumber() {
        return number;
    }
    public String getThongbao(){
        return thongbao;
    }
    public NodeHistory(String thongbao){
        number += 1;
        this.thongbao = thongbao;
        this.prev = null;
        this.next = null;
    }
    public NodeHistory(){

    }
}
