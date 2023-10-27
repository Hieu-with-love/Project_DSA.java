//package TempPackage;
//
//class Tab {
//    String url;
//
//    public Tab(String url) {
//        this.url = url;
//    }
//}
//
//class Window {
//    String title;
//    TabList tabs;
//    Window next;
//    Window previous;
//
//    public Window(String title) {
//        this.title = title;
//        this.tabs = new TabList();
//        this.next = null;
//        this.previous = null;
//    }
//}
//
//class TabList {
//    TabNode head;
//    TabNode tail;
//
//    public void addTab(String url) {
//        TabNode newNode = new TabNode(url);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            tail.next = newNode;
//            newNode.previous = tail;
//            tail = newNode;
//        }
//    }
//}
//
//class TabNode {
//    String url;
//    TabNode previous;
//    TabNode next;
//
//    public TabNode(String url) {
//        this.url = url;
//        this.previous = null;
//        this.next = null;
//    }
//}
//
//public class SimpleBrowser {
//    Window currentWindow;
//
//    public SimpleBrowser() {
//        this.currentWindow = null;
//    }
//
//    public void openNewWindow(String title) {
//        Window newWindow = new Window(title);
//        if (currentWindow == null) {
//            currentWindow = newWindow;
//        } else {
//            newWindow.previous = currentWindow;
//            currentWindow.next = newWindow;
//            currentWindow = newWindow;
//        }
//    }
//
//    public void addTabToCurrentWindow(String url) {
//        if (currentWindow != null) {
//            currentWindow.tabs.addTab(url);
//        }
//    }
//
//    public void display() {
//        Window current = currentWindow;
//        while (current != null) {
//            System.out.println("Window: " + current.title);
//            TabNode tab = current.tabs.head;
//            while (tab != null) {
//                System.out.println("  Tab: " + tab.url);
//                tab = tab.next;
//            }
//            current = current.previous;
//        }
//    }
//
//    public static void main(String[] args) {
//        SimpleBrowser browser = new SimpleBrowser();
//
//        browser.openNewWindow("Window 1");
//        browser.addTabToCurrentWindow("https://www.example.com");
//        browser.addTabToCurrentWindow("https://www.openai.com");
//
//        browser.openNewWindow("Window 2");
//        browser.addTabToCurrentWindow("https://www.github.com");
//
//        browser.display();
//    }
//}