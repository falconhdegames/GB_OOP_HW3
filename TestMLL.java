package HW_3;

public class TestMLL {
    public static void main(String args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.addElement("Value 0");
        mll.addElement("Value 1");
        mll.addElement("Value 2");
        mll.addElement("Value 3");
        System.out.println(mll.getAllElements());

        mll.removeElement(1);
        System.out.println(mll.getAllElements());

        var iterator = mll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
