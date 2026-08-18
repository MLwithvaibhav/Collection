package ExceptionHandling.Throw;


public class throw {

    public static void main(String [] args){

        int i = 10;
        int j = 0;

        try{
            j=18/i;
            if(j==0)
                throw new VaibhavException("I don't want zero")

        }
        catch(VaibhavException e){
            j=18/1;
            System.out.println("default value" + e)
        }
        catch(Exception e){
            System.out.println("something went wrong")
        }
    }

    // savinng streak
    // savinng streak
    // savinng streak
    // savinng streak
    // savinng streak
    // savinng streak
    // savinng streak
    
}
