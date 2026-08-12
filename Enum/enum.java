public class enum {

enum Laptop{
            Macbook(2000), Dell(1500), HP(1000), Lenovo(1200)

            private int price;

            private Laptop(){
                price = 500;
            }

            private Laptop(int price){
                this.price = price;
                sout("Price of " + this.name() + " is: " + price);
            }

            public int getPrice(){
                return price;
            }

            public void setPrice(int price){
                this.price = price;
            }
        }
        
}
