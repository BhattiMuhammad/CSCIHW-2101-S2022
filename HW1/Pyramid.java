package HW1;

// import javax.swing.text.StyledEditorKit.ForegroundAction;

// import apple.laf.JRSUIConstants.FrameOnly;

/*
Make the output look like this:
#
##
###
####
#####
####
###
##
#
Hint: the object is created for you (Pyramid) a qwnd so is the method (Output)
Hint2: Also notice the method is void meaning you will not be returning anything
*/
public class Pyramid {
        public static void main(String[] args) {
        // For loop for pyramid 1-5 
            for(int i = 1; i <= 5; i++){
                for(int j = 0; j < i; j++) {
                    System.out.print("#");
                }
                System.out.println();
         }

         // Second part of code sartting from 4 going down to 1
         for(int i = 4; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
     }
     }
}
