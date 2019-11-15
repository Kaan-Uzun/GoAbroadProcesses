
public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Istanbul Airport");
        String conditions = "To go Abroad Conditions\n" +
                            "Criminal record Check\n" +
                            "15Euro payment for taxes\n" +
                            "Visa control";
        String message = "You must provide all of conditions to go abroad...";  
        
        while(true) {
            
            System.out.println("**********************************************");
            System.out.println(conditions);
            System.out.println("**********************************************");
            
            
            passenger passenger1 = new passenger();
            
            System.out.println("Checking Taxes condition.....");
            Thread.sleep(3000);
            if(passenger1.taxPaymentControl() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Checking criminal record of the passenger...");
            Thread.sleep(3000);
            if(passenger1.criminalControl() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Checking visa existing...");
            Thread.sleep(3000);
            if(passenger1.visaControl() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("There is no issues to go abroad for you. Everything is ready to go...");
            break;
        }
    }
}
