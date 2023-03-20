import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    static double findSquareRoot(double a){
        logger.info("Exec : Square Root Function | Input : "+a);
        double sqrt = Math.sqrt(a);
        logger.info("Square Root Calculated : "+sqrt);
        return sqrt;
    }
    static double findFactorial(double a){
        logger.info("Exec : Factorial Function | Input : "+a);
        double fact=1;
        for(int i=1;i<=a;i++)
            fact=fact*i;
        logger.info("Factorial Computed : "+fact);
        return fact;
    }
    static double findNaturalLog(double a){
        logger.info("Exec : Natural Log Function | Input : "+a);
        double natlog=Math.log(a);
        logger.info("Natural Log Computed : "+natlog);
        return natlog;
    }
    static double findPower(double a,double b){
        logger.info("Exec : Power Function | Input : "+a+" "+b);

        double pow=Math.pow(a,b);
        logger.info("Power Computed : "+pow);
        return pow;
    }

    public static void main(String[] args) {
        int  choice=1;
        while(choice!=5){
            System.out.println("\n\n\t\t----------------WELCOME TO CALCULATOR ---------------------\n\n");
            System.out.println("\n Press 1 : Square root");
            System.out.println("\n Press 2 : Factorial");
            System.out.println("\n Press 3 : Natural Log");
            System.out.println("\n Press 4 : Power function");
            System.out.println("\n Press 5 : to Exit");
            System.out.print("\n Your Choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            double a,b;
            switch (choice){
                case 1:
                    System.out.println("\n\t******* Welcome to Square root Section *************\n\n");
                    System.out.print("\n Enter number to find Square Root : ");
                    a = sc.nextInt();
                    System.out.print("\n Square Root of "+a+" = "+findSquareRoot(a));
                    break;
                case 2:
                    System.out.println("\n\t******* Welcome to Factorial Section *************\n\n");
                    System.out.print("\n Enter  numbers to find Factorial : ");
                    a = sc.nextInt();
                    System.out.println("\n Factorial of "+a+ " = " + findFactorial(a));
                    break;
                case 3:
                    System.out.println("\n\t******* Welcome to Natural Log Section *************\n\n");
                    System.out.print("\n Enter number to find Natural Log : ");
                    double d = sc.nextDouble();
                    System.out.println("\n Natural Log of "+d+ " = " + findNaturalLog(d));
                    break;
                case 4:
                    System.out.println("\n\t******* Welcome to Power Section *************\n\n");
                    System.out.print("\n Enter the a and b where a^b is tobe calculated : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("\n  "+ a+ " to the power " + b+ " = " +findPower(a,b));
                    break;
                case 5:
                    System.out.println("\n\t\tBYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!\n\n");
                    break;
                default:
                    System.out.println("\n\n\t Invalid Inputtttttt!!!!!!\n\n\t\tTry Again :)");

            }


        }
    }
}
