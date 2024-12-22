import java.util.Scanner;
import java.util.Random;
public class numbergame
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        Random r=new Random();
        int lowerbound=1,upperbound=100;
        int rounds=3,score=0;
        System.out.println("Welcome to Number Game!");
        System.out.println("A number has been chosen between " + lowerbound + " and " + upperbound);
        System.out.println("Guess the number within 10 attempts for each round");
        for(int round=1;round<=rounds;round++)
        {
            int number=r.nextInt(upperbound-lowerbound+1)+lowerbound;
            int guess,attempts=0,maxattempts=10;
            System.out.println("\n---Round "+round+" ---");
            while(attempts<maxattempts)
            {
              System.out.println("Attempt "+(attempts+1)+" Enter your guess");
                guess=s.nextInt();
                attempts++;
                if(guess<number)
                {
                    System.out.println("Your guess is too low!");
                }
                else if(guess>number)
                {
                    System.out.println("Your guess is too high!");
                }
                else
                {
                    System.out.println("Congratulations! You guessed the number "+number+" in "+attempts+" attempts");
                    switch(attempts)
                    {
                        case 1:score=score+10;
                        break;
                        case 2:score=score+9;
                        break;
                        case 3:score=score+8;
                        break;
                        case 4:score=score+7;
                        break;
                        case 5:score=score+6;
                        break;
                        case 6:score=score+5;
                        break;
                        case 7:score=score+4;
                        break;
                        case 8:score=score+3;
                        break;
                        case 9:score=score+2;
                        break;
                        case 10:score=score+1;
                        break;
                    }
                    break;
                }
           }
            if(attempts==maxattempts)
            {
                System.out.println("Sorry! You've reached the maximum attempts. The correct number was: "+number);
            }
            System.out.println("Your score after round "+round+": "+score);
        }
        System.out.println("\nGame Over! Your total score is: "+score);
        s.close();
    }
}