public class Demo {

    public static void main(String[] args) {
        
        A obj = new A()
        {
            public void show(){
                System.out.println("not in process");
            }
        };
        obj.show();
    }
    
}
