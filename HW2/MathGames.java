package HW2;
import java.util.Scanner;


public class MathGames {
    public static Scanner sc = new Scanner (System.in);

    
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("Which side are you solving for?");
        System.out.println("Press 1 for Perpendicular");
        System.out.println("Press 2 for Base");
        System.out.println("Press 3 for Hypotenuese");
        int m =0;
        // Scanner sc = HW2.MathGames.main(String[]);
         m= sc.nextInt();
            

        if(m ==1)
        {
            System.out.println("Input Base:");
            b= sc.nextDouble();
            System.out.println("Input Hypotenuese:");
            c= sc.nextDouble();
            a = Math.sqrt(Math.pow(c,2)- Math.pow(b,2));
            System.out.println("Perpendicular =");
            System.out.println(a);

        }
        else if (m == 2)
        {
            System.out.println("Input Perpendicular:");
            a= sc.nextDouble();
            System.out.println("Input Hypotenuese:");
            c= sc.nextDouble();
            b = Math.sqrt(Math.pow(c,2)- Math.pow(a,2));
            System.out.println("Base =");
            System.out.println(b);
        }
        else if (m==3)
        {
            System.out.println("Pythagorean Theorm Solver");
            System.out.println("Input Perpendicular:");
            a= sc.nextDouble();
            System.out.println("Input Base:");
            b= sc.nextDouble();
            c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
            System.out.println("Hypotenuese=");
            System.out.println(c);
        }
        else{
            System.out.println("Enter the valid number");
        }
        System.out.println("---------------------------------------------------------------------------------------------");

// Question 2
// Grade Calculator from marks

        System.out.println("Enter the marks of the student (0-100)");
        double marks =sc.nextDouble();
        if (marks<= 100 && marks > 89){
            System.out.println("Your Grade is A");
        }
        else if (marks <= 89 && marks > 79){
            System.out.println("Your Grade is B");
        }
        else if (marks <= 79 && marks > 69){
            System.out.println("Your Grade is C");
        }
        else if (marks <= 69 && marks > 59){
            System.out.println("Your Grade is D");
        }
        else if (marks <= 59 && marks >= 0){
            System.out.println("Your Grade is F");
        }
        else {
            System.out.println("Enter Valid Marks");
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        
// Question 3
// Caclulating tip per person on the total bill

        System.out.println("Enter the total bill for calculating the share of the tip ");
        double totalbill = sc.nextDouble();
        totalbill = Math.ceil(totalbill);
        int t = (int) totalbill;
        System.out.println("The total Bill is (roundoff)");
        System.out.println(t);
        System.out.println("Enter the percentage of tip you want to give");
        double tip = sc.nextDouble();
        double tipamount = t * tip;
        double ab = tipamount* 1 /100 ;
        System.out.println("The total tip amount is");
        System.out.println(ab);
        System.out.println("Enter the number of persons sharing the tip");
        int noofpersons = sc.nextInt();
        double tipperperson;
        tipperperson = ab / noofpersons ;
        System.out.println("The tip per person:");
        System.out.println(tipperperson);
        System.out.println("---------------------------------------------------------------------------------------------");

    }
}


