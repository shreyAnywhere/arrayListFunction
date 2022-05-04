public class Main {

    public static void main(String[] args) {

        ArrayListFunction obj = new ArrayListFunction();

        obj.add(5);
        obj.add(6);
        obj.add(10);

        obj.printArray();
        System.out.println();
        obj.remove(2);
        obj.printArray();
        obj.add(15);
        obj.add(35);
        System.out.println();
        obj.printArray();
        obj.remove(3);
        System.out.println();
        obj.printArray();
    }
}
