import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    static  int addition(int a,int b){
        logger.info("In Addition");
        return a+b;
    }
    static int subtraction(int a,int b){
        logger.info("In Subtraction");
        return a-b;
    }

    public static void main(String[] args) {
        int  choice=1;
        while(choice!=3){
            System.out.println("\n\n\t\t----------------WELCOME TO CALCULATOR ---------------------\n\n");
            System.out.println("\n Press 1 : for Addition");
            System.out.println("\n Press 2 : for Subtraction");
            System.out.println("\n Press 3 : to Exit");
            System.out.print("\n Your Choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            int a,b;
            switch (choice){
                case 1:
                    System.out.println("\n\t******* Welcome to Addition Section *************\n\n");
                    System.out.println("\n Enter 2 numbers to add");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.print("\n Addition Result : "+addition(a,b));
                    break;
                case 2:
                    System.out.println("\n\t******* Welcome to Addition Section *************\n\n");
                    System.out.println("\n Enter 2 numbers to subtract");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("\n Addition Result : "+subtraction(a,b));
                    break;
                case 3:
                    System.out.println("\n\t\tBYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!\n\n");
                    break;
                case 4:
                    System.out.println("\n\n\t Invalid Inputtttttt!!!!!!\n\n\t\tTry Again :)");

            }


        }
    }
}
