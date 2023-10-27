package MainPackage;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        WindowList windowList = new WindowList();
        TabList tabList = new TabList();
        HistoryList historyList = new HistoryList();
        Scanner sc = new Scanner(System.in);
        char choose;
        do {

            System.out.println("=======================   WINDOW 0" + NodeWindow.getNumber() + "  =========================");
            System.out.println("||       ============   MENU TABLE  ============            ||");
            System.out.println("||          Press W: Tao ra mot window moi.                 ||");
            System.out.println("||          Press H: Xem lich su.                           ||");
            System.out.println("||          Press I: Xem thong tin window hien tai.         ||");
            System.out.println("||          Press B: Back window                            ||");
            System.out.println("||          Press N: Next window.                           ||");
            System.out.println("||          Press T: New tab(Tab dau tien)                  ||");
            System.out.println("||          Press D: Huy window hien tai.                   ||");
            System.out.println("||          Press X. Thoat chuong trinh.                    ||");
            System.out.println("==============================================================");
            System.out.println("Moi nhap lua chon:");
            choose = sc.next().charAt(0);

            switch (choose) {
                case 'W': {
//                    System.out.println("================================================================");
//                    System.out.println("||                                                            ||");
//                    System.out.println("||                                                            ||");
//                    System.out.println("||                                                            ||");
//                    System.out.println("||                                                            ||");
//                    System.out.println("||                                                            ||");
//                    System.out.println("||                                                            ||");
//                    System.out.println("================================================================");
                    historyList.addHistory("Ban vua them mot window moi");
                    windowList.addWindow(tabList);
                    break;
                }
                case 'D': {
                    historyList.addHistory("Ban vua xoa mot window");
                    windowList.deleteWindow();
                    break;
                }

                case 'I':{
                    historyList.addHistory("Ban vua xem thong tin window hien tai");
                    windowList.printCurrentWindow();
                    break;
                }
                case 'H':{
                    historyList.addHistory("Ban vua xem lich su");
                    int option = 0;
                    do{
                        System.out.println("-----------HISTORY-------------");
                        System.out.println("|  Cac lua chon xem lich su:  |");
                        System.out.println("|  1: Xem thao tac moi nhat.  |");
                        System.out.println("|  2: Xem thao tac cu nhat.   |");
                        System.out.println("|  3: Xem toan bo thao tac.   |");
                        System.out.println("|  0: Thoat khoi xem lich su. |");
                        System.out.println("-------------------------------");
                        System.out.print("Moi ban nhap option:");
                        try {
                            option = sc.nextInt();
                        }
                        catch(Exception ex){
                            System.out.println("Current exception is: " + ex.getMessage());
                        }
                        switch (option){
                            case 1:{
                                historyList.seeLatestHistory();
                                break;
                            }
                            case 2:{
                                historyList.seeOldestHistory();
                                break;
                            }
                            case 3:{
                                historyList.seeFullHistory();
                                break;
                            }
                        }

                    }while (option != 0);
                    break;
                }
                case 'B':{
                    windowList.backWindow();

                    break;
                }
                case 'N':{
                    windowList.nextWindow();
                    break;
                }
                case 'T':{

                    historyList.addHistory("Ban vua tao ra mot tab tu window.");
                    char feature = 'X';
                    do{

                        System.out.println(".........................    TAB 0" + NodeTab.getNumber() +  "  ........................");
                        System.out.println(".        ============   MENU TABLE  ============             .");
                        System.out.println(".           Press T: Tao ra mot tab moi.                     .");
                        System.out.println(".           Press H: Xem lich su.                            .");
                        System.out.println(".           Press I: Xem thong tin tab hien tai.             .");
                        System.out.println(".           Press B: Back tab                                .");
                        System.out.println(".           Press N: Next tab.                               .");
                        System.out.println(".           Press D: Huy tab hien tai.                       .");
                        System.out.println(".           Press L: Tu dien Anh-Viet.                       .");
                        System.out.println(".           Press C: Code mon DSA.                           .");
                        System.out.println(".           Press D: Huy tab hien tai.                       .");
                        System.out.println(".           Press X. Thoat chuong trinh.                     .");
                        System.out.println("..............................................................");
                        System.out.println("Moi nhap lua chon:");
                        feature = sc.next().charAt(0);

                        switch (feature){
                            case 'T':{
                                historyList.addHistory("Ban vua them mot tab moi.");
                                int option = '0';
                                do{
                                    System.out.println("---------------------------------------");
                                    System.out.println("|           Mot so ulr co san:         |");
                                    System.out.println("|   Press 1. https://www.example.com   |");
                                    System.out.println("|   Press 2. https://www.openai.com    |");
                                    System.out.println("|   Press 3. https://www.google.com    |");
                                    System.out.println("|   Press 4. https://www.facebook.com  |");
                                    System.out.println("|   Press 5. https://www.github.com    |");
                                    System.out.println("|   Press 6. https://www.mysql.com     |");
                                    System.out.println("|   Press 0. Thoat chuc nang chon url. |");
                                    System.out.println("---------------------------------------");
                                    System.out.print("Moi nhap url ban muon: ");
                                    try {
                                        option = sc.nextInt();
                                    }
                                    catch(Exception ex){
                                        System.out.println("Current exception is: " + ex.getMessage());
                                    }
                                    switch (option){
                                        case 1:{
                                            tabList.addTab("https://www.example.com");
                                            break;
                                        }
                                        case 2:{
                                            tabList.addTab("https://www.openai.com");
                                            break;
                                        }
                                        case 3:{
                                            tabList.addTab("https://www.google.com");
                                            break;
                                        }
                                        case 4:{
                                            tabList.addTab("https://www.facebook.com");
                                            break;
                                        }
                                        case 5:{
                                            tabList.addTab("https://www.github.com");
                                            break;
                                        }
                                        case 6:{
                                            tabList.addTab("https://www.mysql.com");
                                            break;
                                        }
                                    }
                                }while (option != 0);
                                break;
                            }
                            case 'I':{
                                historyList.addHistory("Ban vua xem thong tin tab hien tai");
                                tabList.seeCurrentTab();
                                break;
                            }
                        }

                    }while (feature != 'X');

                    break;
                }
                default:{
                    System.out.println("Ky tu khong co trong cu phap. Moi nhap lai");
                }
            }

            }while (choose != 'X') ;

    }
}
