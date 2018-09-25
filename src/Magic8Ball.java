import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){
        //declare
        Scanner board;
        int question;


        //initializing
        board = new Scanner(System.in);


        System.out.println("Welcome to the Magic 8 ball program think of a question about a");
        System.out.println("and go ahead and type how many times you will shake the Magic 8 Ball (1-100)");
        question = board.nextInt();
        if (question<1){
            System.out.println("ERROR 404 8 BALL HAS DIED Tracking IP...... Location detected nuke inbound");
        }
        else if (question<=10){
            System.out.println("I could see that happening");
        }
        else if (question<=20){
            System.out.println("Not anytime soon.");
        }
        else if (question<=30){
            System.out.println("It's looking promising");
        }
        else if (question<=40){
            System.out.println("N-0 which spells NO");
        }
        else if (question<=50){
            System.out.println("Results say yes");
        }
        else if (question<=60){
            System.out.println("Not good not good at all");
        }
        else if (question<=70){
            System.out.println("It's looking in your favor");
        }
        else if (question<=80){
            System.out.println("You're usually lucky but not today");
        }
        else if (question<=90){
            System.out.println("Indeed it will");
        }
        else if (question<=100){
            System.out.println(" I checked in the back but couldn't see that happening soon.");
        }
        else if (question>100){
            System.out.println("ERROR 404 8 BALL HAS DIED Tracking IP...... Location detected nuke inbound");
        }
        //possible answers
       /* I could see that happening, It's looking promising, Results say yes, It's looking in your favor,
        Indeed it will, Not anytime soon, N-O which spells NO, Not good not good at all, You're lucky but not today,
        I checked in the back but couldn't see that happening soon.*/


    }
}
