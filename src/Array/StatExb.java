package Array;

//import java.util.Arrays;
import java.util.Scanner;

public class StatExb {
    public static void main(String[] args) {

        String[] questions = new String[5];
        questions[0] = "Is Charles is the king of England?";
        questions[1] = "Is Lagos is the capital of Nigeria?";
        questions[2] = "Is Canada is made up of provinces?";
        questions[3] = "Is Finland is in Scandinavia?";
        questions[4] = "Is Hilary Clinton is the president of the usa?";

        Boolean[] userAns = new Boolean[5];

        Boolean[] isTrueFalse = new Boolean[5];
        isTrueFalse[0] = true;
        isTrueFalse[1] = false;
        isTrueFalse[2] = true;
        isTrueFalse[3] = true;
        isTrueFalse[4] = false;

        Scanner scan = new Scanner(System.in);

        int i;
        int x = 0;

        for( i=0; i<questions.length; i++)
        {
           System.out.print(questions[i] +"\n" );
           System.out.print("true or false: ");
           userAns[i]=scan.nextBoolean();
           //System.out.println("the answer is " +isTrueFalse[i]+"\n");

             if (userAns[i] == isTrueFalse[i])
                 x = x + 1;
        }

        System.out.print("Your score is : " + x +"/5");



    }
}
