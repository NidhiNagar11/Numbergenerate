import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
   public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    Random random = new Random();
    int totalscore = 0;
      System.out.println("welcome to the no guessing game");
      boolean playagain = true;
      
      while(playagain){
        System.out.println("enter the number of rounds you want to play");
        int rounds = obj.nextInt();
        int score = 0;
        for(int i =0 ;i<rounds;i++){
         int generatno = random.nextInt(100) +1;
         int attempts=0;
         int maxattempts= 10;
         boolean roundwon = false;
      
         System.out.println("System has generated a number could you guess the number you have used  " + (i+1)+ "out of"+ rounds+"rounds" );
        
        while(attempts<maxattempts){
         System.out.println("Guesss the number ");
         int guessno = obj.nextInt();
         attempts++;
         if(guessno>generatno){
            System.out.println("You had guessed very high number");
         }
         else if(guessno<generatno){
            System.out.println("You had guessed very low number");
         }
         else
         {
            System.out.println("CONGO!!!!");
            System.out.println("You had guessed right answer");
            score += maxattempts-attempts+1;
            roundwon = true;
            break;
         }
        }
        if(!roundwon)
        {System.out.println("The generated number is "+ generatno);
       }}
       totalscore += score;
       System.out.println("score for this round is"+score);
    
       System.out.println("Do you want to play again?");
       String response = obj.next();
       playagain = response.equalsIgnoreCase("yes");
      }
      System.out.println("You score is " + totalscore);
      obj.close();

   }
    
}

