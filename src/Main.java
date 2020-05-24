import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(0,"Hello");
        list.add(0,"First");
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove("First");
        System.out.println(list.get(0));
    }
}
