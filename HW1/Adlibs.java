package HW1;
// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favoriteColor all in strings
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"
public class Adlibs {
        // 2 STRINGS 
    static String name = "Muhammad"; 
    static String favoritecolor = "Snugglepuss"; 
    public static void main(String[] args) {
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

//I followed how you showed us in class,i was confused with public string story...

    // public  String story(String name, int age, String favoriteColor) {
    //     String color = "Snugglepuss"; 
    //     System.out.println("My favorite color is" + " " + favoritecolor);

    //     return null;
    //  String color = "Snugglepuss"; 


    // public static void main(String[] args) {
    //    System.out.println("Hello my name is" + " " + name);
    // }
//}
