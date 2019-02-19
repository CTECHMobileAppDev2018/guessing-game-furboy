import java.util.Scanner;
public class GuessGame{
  public static void main(String[] args){
    Scanner guesser = new Scanner (System.in);
    int number = (int) (Math.random()*99 + 1), times = 0, guess = 0;
    System.out.println("Time to guess a number UwU");
    do{
      guess = guesser.nextInt();
      if (guess > number){
        System.out.println("too high");
      }
      if (guess < number){
        System.out.println("Too Low M8");
      }
    times++;
    }
    while(number != guess);
    System.out.println(" YOU WIN!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
    System.out.println("It took you "+ times +" guesses");
  }
}

    
    