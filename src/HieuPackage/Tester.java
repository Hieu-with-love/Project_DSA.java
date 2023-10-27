package HieuPackage;
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
//class WindowList {
//    Window head;
//    Window tail;
//
//    public void addWindow(String title) {
//        Window newWindow = new Window(title);
//        if (head == null) {
//            head = newWindow;
//            tail = newWindow;
//        } else {
//            tail.next = newWindow;
//            newWindow.previous = tail;
//            tail = newWindow;
//        }
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
//    public class SimpleBrowser {
//    WindowList windows;
//    Window currentWindow;
//
//    public SimpleBrowser() {
//        this.windows = new WindowList();
//        this.currentWindow = null;
//    }
//
//    public void openNewWindow(String title) {
//        Window newWindow = new Window(title);
//        if (currentWindow == null) {
//            currentWindow = newWindow;
//            windows.head = newWindow;
//        } else {
//            currentWindow.next = newWindow;
//            newWindow.previous = currentWindow;
//            currentWindow = newWindow;
//        }
//    }
//
//    public void switchWindow(Window window) {
//        currentWindow = window;
//    }
//
//    public void addTabToCurrentWindow(String url) {
//        if (currentWindow != null) {
//            currentWindow.tabs.addTab(url);
//        }
//    }
//
//    public void display() {
//        Window current = windows.head;
//        while (current != null) {
//            System.out.println("Window: " + current.title);
//            TabNode tab = current.tabs.head;
//            while (tab != null) {
//                System.out.println("  Tab: " + tab.url);
//                tab = tab.next;
//            }
//            current = current.next;
//        }
//    }
//public class Tester {
//    public static void main(String[] args) {
//
//    }
//}

