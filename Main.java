import java.util.Scanner;
/**
 * This program asks the user how many heights they would like to enter, in cm. It then reads in that many heights. Once the heights are entered, the average height of the list is determined and then all heights above average are printed to the screen.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how many grades they would like to enter
    System.out.println("How many heights would you like to enter");

    // create a variable for user input
    int heights_Num = input.nextInt();
    
    // create an array with heights_Num spots
    int[] heights = new int[heights_Num];

    // ask the user the enter in grade
    System.out.println("Please enter the heights on separate lines");

    // put something into the array using a loop
    for(int i = 0; i < heights_Num; i++){

      heights[i] = input.nextInt();
      
    }

    // create a variable to store the sum
    int sum = 0;

    // use a loop to go through the array and add sum
    for(int i = 0; i < heights_Num; i++){

      // add the heights to sum
      sum = sum + heights[i];
    }

    // determine the average 
    int average = sum / heights_Num;

    // let the user know
    System.out.println("The average height is "+ average + " cm");

    // tell the user what heights are above the average
    System.out.println("The heights above average are");

    // use a for loop to determine what heights are abpve average
    for  (int i = 0; i < heights_Num; i++){

      if(heights[i] > average){
        
        // print out the height
        System.out.println(heights[i]);
      }
    }
  }
}
