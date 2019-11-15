
import java.util.Scanner;


public class passenger implements rules{
    private int payment;
    private boolean criminal;
    private boolean visa;

    public passenger () {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Did you pay for tax to go abroad? If yes; How many? : ");
        this.payment = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Do you have any criminal record? (yes or no answer) : ");
        String answer = scanner.nextLine();
        
        if (answer.equals("yes")){
            this.criminal = true;
        }
        else {
            this.criminal = false;
        }
        
        System.out.print("Do you have a Visa to go abroad? (yes or no answer) : ");
        String answer2 = scanner.nextLine();
        if (answer2.equals("yes")){
            this.visa = true;
        }
        else {
            this.visa = false;
        }
        
    }
    
    @Override
    public boolean taxPaymentControl() {
        if(this.payment < 15){
            System.out.println("Please pay for taxes COMPLETELY!!");
            return false;
        }
        else {
            System.out.println("Payment completed");
            return true;
        }
    }

    @Override
    public boolean criminalControl() {
        if(this.criminal == true){
            System.out.println("You have got a criminal record... You must not go abroad...");
            return false;       
        }
        else {
            System.out.println("No criminal record found...");
            return true;
        }
    }

    @Override
    public boolean visaControl() {
        if (this.visa == true){
            System.out.println("Visa has been accepted");
            return true;
        }
        else {
            System.out.println("You can not go abroad without visa");
            return false;
        }
    }
}

