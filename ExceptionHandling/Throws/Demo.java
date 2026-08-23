public class Demo {

    public static void main(String[] args) {
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}