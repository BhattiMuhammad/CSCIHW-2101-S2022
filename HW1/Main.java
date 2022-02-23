package HW1;

public class Main { 
// Create an object that will make a Pyramid
// Create an object that implements a method which will take an name, age, and favorite color and will return a story 
// Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer 
     
public static void main(String[] args) {
        System.out.println("Start of Main Class");
       
        testclass sw = new testclass();
        sw.printfuntion();
        System.out.println();

        testclass2 ad = new testclass2();
        ad.printfuntion();
        System.out.println();
        
        testclass3 RP = new testclass3();
        RP.printfuntion();
     }
    }

class testclass{
    public void printfuntion(){

        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
     for(int i = 4; i > 0; i--) {
        for(int j = 0; j < i; j++) {
            System.out.print("#");
        }
       System.out.println();
    }
    }
}
    class testclass2{
        public void printfuntion(){

            final String name = "Muhammad"; 
            final String favoritecolor = "Snugglepuss"; 

        System.out.println("Hello! my name is" + " " + name);
        System.out.println("My favorite color is" + " " + favoritecolor);

        int age = 25;
        int year = 1;
        System.out.println("And I am " + age);
        age += year; 
        System.out.println(year + " years has gone by...");
        System.out.println("My age is " + age + " and my favorite food is " + favoritecolor);
 }
}
class testclass3{
    public void printfuntion(){
        
        String s  = "Make";
        System.out.println("I Make Bread");
        String replace = s.replace('M', 'T');
        System.out.println("I " + replace + " Bread");

    }
}

