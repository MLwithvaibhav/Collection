public class Demo {

    public static void main(String[] args) {
        
        AnInnerClass obj = new AnInnerClass()
        {
            public void show(){
                System.out.println("not in process");
            }
        };
        obj.show();
    }
    
}
