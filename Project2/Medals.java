package Project2;

import java.util.ArrayList;

public class Medals {

    /*
    Create a program that will print a table of medal winner counts with row totals
    I have provided the initial values needed, all you need to do is put the logic for printing the table
    The table should look like this:

         Country   Gold    Silver    Bronze  Total
         Canada       1       0       1       2
          China       1       1       0       2
        Germany       0       0       1       1
          Korea       1       0       0       1
          Japan       0       1       1       2
         Russia       0       1       1       2
  United States       1       1       0       2

    After that create an ARRAYLIST that is the total of each medal awarded (IE 4 gold, 4 silver, 5 bronze)
    print the total of each medal 
    Hints:
        int rows = counts.length; (get the rows)
        int cols = counts[0].length; (gets the columns)   
        counts[j][i] in a nested for loop would get you the totals of the column  
        Gold    Silver    Bronze
        4       4         5



    FINAL TABLE SHOULD LOOK LIKE THIS:

        Country    Gold    Silver    Bronze  Total
         Canada       1       0       1       2
          China       1       1       0       2
        Germany       0       0       1       1
          Korea       1       0       0       1
          Japan       0       1       1       2
         Russia       0       1       1       2
  United States       1       1       0       2
          Total    Gold    Silver    Bronze   X
                      4       4       5
    */

    public static void main(String[] args) {
       
        final int COUNTRIES = 7;
        final int MEDALS = 3;
        int goldMedals = 0;
        int silverMecals = 0;
        int bronzeMedals = 0;

        int[][] test = new int[COUNTRIES][MEDALS];
        String[] countries = {
            "Canada",
            "China",
            "Germany",
            "Korea",
            "Japan",
            "Russia",
            "United States"
        };

        int[][] counts = 
        { 
            { 1, 0, 1 },
            { 1, 1, 0 }, 
            { 0, 0, 1 }, 
            { 1, 0, 1 }, 
            { 0, 1, 1 }, 
            { 0, 1, 1 },
            { 1, 1, 0 }
        };
        System.out.println("           Country    Gold    Silver  Bronze  Total");

        for (int i = 0; i < COUNTRIES; i++){
            System.out.printf("%15s", countries[i] );
            int total = 0; 

            for (int j = 0; j < MEDALS; j++){
                System.out.printf("%8d", counts[i][j]);
                total = total + counts [i][j];
            }
            System.out.printf("%8d\n", total);
        }


ArrayList<Integer> medalcount = new ArrayList<Integer>();
System.out.println("           Total    Gold    Silver  Bronze  ");        

        
          
        int rows = counts[0].length; 
            int coloumns = counts[0].length; 
                for(int i = 0; i<coloumns; i++){
                    int sum = 0;
                    for (int j = 0; j< rows; j++){
                        sum = sum + counts[j][i]; 
                    }
                    medalcount.add(sum);
                     }
  System.out.println(medalcount.get    (0) + "      " + "       " + "       ");
  System.out.println(medalcount.get    (1) + "      " + "       " + "       ");
  System.out.println(medalcount.get    (2) + "      " + "       " + "       ");
      
}
}
        

    





