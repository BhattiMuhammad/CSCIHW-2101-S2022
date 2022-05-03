package HW5 ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground 
{
    public static void main(String[] args) 
    {
	    
        // Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type int.
        // b) Output the value of the tenth element of the array nums.
        // c) Set the value of the 5th element of the array nums to 99.
        // d) set the value of the 13th element to 15
        // d) set the value of the 2nd element to 6
        // d) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
        
             
        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
        // b) output each of the days of the week
        // c) output the days of the week that we have class 
        // d) change the arrayList to start on Sunday


        // Question 3 
        // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
        // b) return the largest and smallest number
        // c) return the ArrayList sorted smallest to largest
        // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
        // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
        // EX. ArrayList [1,2,3,4,5,6,7,8,9]
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
        // ArrayList Size: 7
        // Please enter 2 more numbers to create the matrix...
        // 
        // Hint 1: use collections sort to sort the numbers 
        // Hint 2: you can see if the size of the array list is divisible by 3 by running:
        //  numbers.size()%3==0
        // Hint 3: You can use this logic to print the array list in a 3x3 pattern once its created:
        // for(int i=0;i<numbers.size();i++)
        //     {
        //         System.out.print(numbers.get(i)+" ");
        //         if((i+1)%3==0)
        //         {
        //             System.out.println();
        //         }
        //     }
            
    	//==================================================================================================================
	    
    	// Question 1
    	System.out.println("Question 1: ");
    	
    	// a) Declare an arrayList nums of 15 elements of type int.
    	ArrayList<Integer> q1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
    	
    	// b) Output the value of the tenth element of the array nums.
    	System.out.println("The 10th element value: " + q1.get(9));
    	
    	// c) Set the value of the 5th element of the array nums to 99.
    	q1.set(4, 99);
    	
    	// d) set the value of the 13th element to 15
    	q1.set(12, 15);
    	
    	// e) set the value of the 2nd element to 6
    	q1.set(1, 6);
    	
    	// f) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
    	q1.set(8, q1.get(12) + q1.get(1));
	
	    //==================================================================================================================
    	
    	// Question 2
    	System.out.println("Question 2: ");
    	
    	// a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    	ArrayList<String> q2 = new ArrayList<String>(7);
    	
    	q2.add("Monday");
    	q2.add("Tuesday");
    	q2.add("Wednesday");
    	q2.add("Thursday");
    	q2.add("Friday");
    	q2.add("Saturday");
    	q2.add("Sunday");
    	
        // b) output each of the days of the week
    	System.out.println("The days of the week:");
    	for(int i = 0; i<7; i++)
    	{
    		System.out.println("\t" + q2.get(i));
    	}
    	
        // c) output the days of the week that we have class 
    	System.out.println("The days of the week where we have class are "+q2.get(1)+" and "+q2.get(3));
    	
        // d) change the arrayList to start on Sunday
	    q2.remove(6);
	    q2.add(0,"Sunday");
	    
	    System.out.println("The days of the week starting from Sunday: ");
	    for(int i = 0; i<7; i++)
    	{
    		System.out.println("\t" + q2.get(i));
    	}
	    
	    //==================================================================================================================
	    
	    // Question 3 
	    System.out.println("Question 3: ");
	    
        // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
	    ArrayList<Integer> q3 = new ArrayList<Integer>();
	    
	    // scanner to read input from the user
	    Scanner s = new Scanner(System.in);
	    
	    // number variable to read numbers from the users
	    int number = 0;
	    
	    // looping until the user enter 0
	    do
	    {
	    	System.out.print("Enter a number (0 to stop): ");
	    	number = s.nextInt();
	    	
	    	// checking if the number is valid
	    	if (number != 0)
	    	{
	    		q3.add(number);
	    	}
	    	
	    }while(number != 0);
	    
        // b) return the largest and smallest number
	    
	    // max and min to store values
	    int max = 0,min = 0;
	    
	    // checking if the arrayList is not empty
	    if (q3.size() != 0)
	    {
	    	// getting the value of the element
	    	max = q3.get(0);
	    	min = q3.get(0);
	    }
	    
	    // looping through each element in the arrayList
	    for (int i = 1; i < q3.size(); i++)
	    {
	    	// checking if we found a smaller value
	    	if (q3.get(i) < min)
	    	{
	    		min = q3.get(i);
	    	}
	    	
	    	// checking if we found a larger value
	    	if (q3.get(i) > max)
	    	{
	    		max = q3.get(i);
	    	}
	    }
	    
	    System.out.println("The largest number: " + max);
	    System.out.println("The smallest number: " + min);
	    
        // c) return the ArrayList sorted smallest to largest
	    Collections.sort(q3);
	    
	    System.out.println("The sorted ArrayList: ");
	    for (int i = 0; i < q3.size(); i++)
	    {
	    	System.out.println("\t" + q3.get(i));
	    }
	    
        // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
	    
	    // asking the user for input until the ArrayList size is divisable by 3
	    while (q3.size()%3 != 0)
	    {
	    	System.out.print("Enter a number: ");
	    	q3.add(s.nextInt());
	    }
	    
	    // printing the arrayList in a matrix format
	    System.out.println("The arrayList in a matrix format: ");
	    for(int i=0;i<q3.size();i++)
	    {
	    	System.out.print("\t"+ q3.get(i));
	    	
	    	if((i+1)%3==0)
	    	{
	   			System.out.println();
	   		}
	    }	    
    }
}