package HW4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	// CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // If you want to use an ArrayList for the inputs to be dynamic that is okay
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
	
    public static void Arraysums()
    {
    	// scanner for reading input from the user
    	Scanner s = new Scanner(System.in);
    	// sum for storing the sum and number for storing data entred by the user
    	int sum = 0,number;
    	// ArrayList of Integers (dynamic array)
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	
    	System.out.println("I will add up the numbers you give me....");
    	
    	// reading data until the user enters 0
    	do
    	{
    		// reading data
    		System.out.print("Number: ");
    		number = s.nextInt();
    		
    		// checking if it's valid
    		if (number != 0)
    		{
    			// adding to the sum
    			sum += number;
    			// adding the number to the arrayList
    			numbers.add(number);
    			
    			// printing the current sum
    			System.out.println("The total so far is "+sum+".");
    		}
    		else
    		{
    			// printing the result
    			System.out.println("Total: "+ sum);
    			
    			// printing all the array elements/numbers
    			System.out.print("Array: {");
    			for(int i = 0 ; i < numbers.size(); i++)
    			{
    				if (i != numbers.size() - 1)
    				{
    					System.out.print(numbers.get(i)+",");
    				}
    				else
    				{
    					System.out.print(numbers.get(i));
    				}
    			}
    		}

    	}while (number != 0);
    	
    	System.out.println("}");

    }

    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to
    // a char array as well
    // From there creating for and while loops to compare the values is trivial

    public static String bruteForce(String password)
    {
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
        
        // storing all password characters in arr
        char[] arr = password.toCharArray();
        // counter in order to keep track of how many characters we found
        int counter = 0;
        
        // looping until we find the correct answer
        while(answer.equals(password) == false)
        {
        	// looping through the array of alphabets we have
        	for (int j = 0; j < alphabet.length; j++)
        	{
        		// checking if we found the desired character
        		if (arr[counter] == alphabet[j])
        		{
        			// concatenating the character to the answer and incrementing the counter
        			answer += alphabet[j];
        			counter++;
        			
        			// printing the current answer
        			System.out.println(answer);
        			
        			// breaking out of the loop
        			break;
        		}
        	}
        }
        
        // returning the answer
        return answer; 
    }

    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Array.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums)
    {
        int [] sortedArray = new int[nums.length];
        // min in order to store the index of the smallest value each time and tmp for storing some temporary values
        int min,tmp;
        
        // looping through all the elements
        for (int i = 0; i<nums.length; i++)
        {
        	// initializing min with the index
        	min = i;
        	
        	// looping again but starting from the index i and trying to find the smallest value
        	for(int j = i; j<nums.length; j++)
        	{
        		// we found a smaller valu
        		if (nums[j] < nums[min])
        		{
        			// changing the index value for min
        			min = j;
        		}
        	}
        	
        	// switching betwen the value of the index and the min value that we found
        	tmp = nums[i];
        	nums[i] = nums[min];
        	nums[min] = tmp;
        	
        	// storing the min value in the sortedArray 
        	sortedArray[i] = nums[i];
        }

        return sortedArray;
    }


    public static void main(String[] args) 
    {
    	// Arraysums execution
    	System.out.println("=============================================");
    	System.out.println("Arraysums() execution: ");
    	Arraysums();
    	System.out.println("=============================================");
    	
    	
    	
    	// bruteForce execution
    	System.out.println("=============================================");
    	System.out.println("bruteForce('ZZZZ') execution: ");
    	bruteForce("ZZZZ");
    	System.out.println("=============================================");
    	
    	
    	
    	//sorter execution
    	System.out.println("=============================================");
    	System.out.println("sorter([9,10,2,5,3,4,7,8]) execution: ");
    	
    	int[] numbers = {9,10,2,5,3,4,7,8};
    	
    	int[] result = sorter(numbers);
    	
    	System.out.print("The array sorted: ");
    	for(int i = 0; i < result.length; i++)
    	{
    		System.out.print(result[i]+" ");
    	}
    	
    	System.out.println();
    	System.out.println("=============================================");
    }

    
}