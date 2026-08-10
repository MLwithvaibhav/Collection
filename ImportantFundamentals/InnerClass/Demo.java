public class Demo {

    public static void main(String[] args){

        InnerClass A = new InnerClass();
        A.show();

        InnerClass.B obj = A.new B();
        obj.config();
    }
    
}
