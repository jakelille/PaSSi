package passi;
import java.util.Scanner;
/**
 *
 * @author Jake Lille, 2015.
 * //All code, algorithms and ideas within this text belongs to Jake Lille for the Intel 2015-2016 Science Fair project,
//PaSSi. All Rights Reserved. The Java programming language belongs and is credited to it's rightful owner, Oracle
 */
//Also include my rough notes code to provide proof of learning
public class PaSSi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //If/Else statement for password checker or builder
        System.out.println("Please note, this program is Case Senstive! If you would like to build a password, please navigate to"
                + "the other directory and run that program instead.");
        Scanner user_input1 = new Scanner(System.in);
        System.out.print("Would you like to 'Check' or 'Build' a password? ");
        String beggining_checker = user_input1.next();
   
        
        if (beggining_checker == "Build"){
            System.out.println("This function is currently not developed, try later!");
            return;
        }   
        
        
        
//Phase 1 Code Block - Asking for Password
        System.out.println("Enter your password for testing: ");
        Scanner user_input2 = new Scanner(System.in);
        String user_password = user_input2.next();
        
//Phase 2 Code Block - Verifying Password
        System.out.println("Verify Password (Case Sensative, No Spaces!): " + "You entered, '" + user_password + "'. Is this correct?");
            //Possibly add info about case sensative on website for newbie users.
            System.out.println("Type 'Yes' or 'No'");
            Scanner user_input3 = new Scanner(System.in);
            String verify_answer = user_input3.next();
            if (verify_answer == "No") {
                System.out.println("Restarting program...");
                return;
            }
            
        //Phase 1 Password Type
        if(user_password.length() <= 6){
            System.out.println("Your password is way too weak! Try adding more characters and numbers + characters!");
        }
        else if (user_password.length() >= 10){
            System.out.println("Your password is a decent length, nice. Try adding more with characters and numbers.");
        }
        else if (user_password.length() >= 16){
            System.out.println("Your password is strong, great work!");
        }
        
        //int phase1 = user_password.indexOf("@" + "1");
        if(user_password.contains("@")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
        else if (user_password.contains("1")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("2")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("0")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("3")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("4")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("5")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("6")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("7")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("8")){
            System.out.println("Your password contains at least one number, great job!");
        }
        else if (user_password.contains("9")){
            System.out.println("Your password contains at least one number, great job!");
        }
         else if(user_password.contains("*")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("#")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("%")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("&")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("^")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("$")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("!")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("+")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("=")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("_")){
            System.out.println("Your password contains at least one symbol, great job!");
        }
         else if(user_password.contains("-")){
            System.out.println("WARNING - Most services do not support certain characters (maybe including this one).");
        }
    }   

    }
            //else{
         // System.out.println("Welcome to the Password Builder!");
        //}

    

