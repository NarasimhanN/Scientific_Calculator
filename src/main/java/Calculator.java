import java.util.Scanner;

import jdk.jfr.Experimental;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    //To Find the Square root
    static double findSquareRoot(double a){
        logger.info("Exec : Square Root Function ");
        double sqrt = Math.sqrt(a);
//        logger.info("Square Root Calculated : "+sqrt);
        return sqrt;
    }
    static double findFactorial(double a){
        logger.info("Exec : Factorial Function ");
        double fact=1;
        for(int i=1;i<=a;i++)
            fact=fact*i;
//        logger.info("Factorial Computed : "+fact);
        return fact;
    }
    static double findNaturalLog(double a){
        logger.info("Exec : Natural Log Function ");
        double natlog=Math.log(a);
//        logger.info("Natural Log Computed : "+natlog);
        return natlog;
    }
    static double findPower(double a,double b){
        logger.info("Exec : Power Function ");

        double pow=Math.pow(a,b);
//        logger.info("Power Computed : "+pow);
        return pow;
    }
    static int takeIntInput(){
        Scanner sc = new Scanner(System.in);
        try{
            int inp = sc.nextInt();
            return inp;
        }
        catch (Exception e){
            System.out.println("\n\t Enter A INTEGER :( not some nonsense ");
            return -1111111;
        }
    }
    static double takeDoubleInput(){
        Scanner sc = new Scanner(System.in);
        try{
            double inp;
            inp = sc.nextDouble();
            return inp;
        }
        catch (Exception e){
            System.out.println("\n\t Enter a DOUBLE/INT , Not some nonsense :(");
            return -1111111.0;
        }
    }
    public static void main(String[] args) {
        int  choice=1;
        //Menu driven code that runs till choice is 5
        while(choice!=5){
            System.out.println("\n\n\t\t----------------WELCOME TO CALCULATOR ---------------------\n\n");
            System.out.println("\n Press 1 : Square root");
            System.out.println("\n Press 2 : Factorial");
            System.out.println("\n Press 3 : Natural Log");
            System.out.println("\n Press 4 : Power function");
            System.out.println("\n Press 5 : to Exit");
            System.out.print("\n Your Choice : ");
            Scanner sc = new Scanner(System.in);
            while((choice=takeIntInput())== -1111111);
            double a,b;
            switch (choice){
                case 1:
                    System.out.println("\n\t******* Welcome to Square root Section *************\n\n");
                    System.out.print("\n Enter number to find Square Root : ");
                    while((a=takeDoubleInput())== -1111111.0);
                   // a = sc.nextInt();
                    System.out.print("\n Square Root of "+a+" = "+findSquareRoot(a));
                    break;
                case 2:
                    System.out.println("\n\t******* Welcome to Factorial Section *************\n\n");
                    System.out.print("\n Enter  numbers to find Factorial : ");
                    while((a=takeDoubleInput())== -1111111.0);

//                    a = sc.nextInt();
                    System.out.println("\n Factorial of "+a+ " = " + findFactorial(a));
                    break;
                case 3:
                    System.out.println("\n\t******* Welcome to Natural Log Section *************\n\n");
                    System.out.print("\n Enter number to find Natural Log : ");
//                    double d = sc.nextDouble();
                    while((a=takeDoubleInput())== -1111111.0);
                    System.out.println("\n Natural Log of "+a+ " = " + findNaturalLog(a));
                    break;
                case 4:
                    System.out.println("\n\t******* Welcome to Power Section *************\n\n");
                    int x,p;
//                    a = sc.nextInt();
//                    b = sc.nextInt();
                    System.out.print("\n Enter the Base number :  ");
                    while((x=takeIntInput())== -1111111);
                    System.out.print("\n Enter the power to be raised :  ");
                    while((p=takeIntInput())== -1111111);

                    System.out.println("\n  "+ x+ " to the power " + p+ " = " +findPower(x,p));
                    break;
                case 5:
                    System.out.println("\n\t\tBYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!\n\n");
                    break;
                default:
                    System.out.println("\n\n\t Invalid Choice!!!!!!\n\n\t\tTry Again :)");

            }


        }
    }
}
