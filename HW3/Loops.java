package HW3;
import java.util.Scanner;
public class Loops {
    // QUESTION 1
    
    public static boolean loopE(String str){
        char[] letters = str.toCharArray();
        int count = 0;
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == 'e') {
				count++;
			}
		}
		if (count == 1 || count== 2 || count == 3) {
			return true;
		}
		return false; //<- this should be changed
	}
    // QUESTION 2
  
    public static String stringTimes(String str, int n) {
        String s = "";
        for ( int i = 0; i < n; i++ )
        {
            s = s + str;
        }
        return s; // <- this should be changed 
    } 
    // QUESTION 3
   
    public static String stringZ(String str){
        for (int i = 0 ;i < str.length();){
            if (str.substring(0,1).equals("z") && str.substring(str.length()-1).equals("z"))
            {
                return str = "z"+ str.replace("z", "")+"z";
            }
            else if (str.substring(0,1).equals("z"))
            {
                return str ="z"+ str.replace("z", "");
            }
            else if(str.substring(str.length()-1).equals("z"))
            {
                return str =str.replace("z", "") +"z";
            }
            else{
               return str= str.replace("z", "");
            }
        }
        return str;      
    }
    // QUESTION 4
   
    public static void sums(){
        System.out.println("I will add up the numbers you give me....");
        Scanner enter = new Scanner(System.in);
        System.out.println("Number:");
        int data = enter.nextInt();
        int sum = 0;
        while (data!=0) {
            sum += data;
            System.out.println("The total so far is:");
            System.out.println(sum);
            System.out.println("Number:");
            data = enter.nextInt();
        }
        System.out.println("TOTAL ENDED --- ");
        System.out.println("The total is "+ sum);
    {   
        enter.close();
    }
}
    public static void main(String[] args) {
        // Add code to help test your methods here
        // Question 1 
        System.out.println(Loops.loopE("eat"));
		System.out.println(Loops.loopE("eeat"));
        System.out.println(Loops.loopE("eeeat"));
		System.out.println(Loops.loopE("eeeeat"));
        // Question 2 
        System.out.println(stringTimes("Code", 2));
        System.out.println(stringTimes("Code", 4));
        // Question 3
        System.out.println(stringZ("zHelloz"));
        System.out.println(stringZ("nozthaznks"));
        System.out.println(stringZ("xksiazdjaasldzsajzasdz"));
        // Question 4 
        sums();
    }

}