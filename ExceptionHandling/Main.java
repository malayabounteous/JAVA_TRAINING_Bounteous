package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//throw->we can catch exception in the called method itself
//thorows->we can propagete the exception to the callinbg method

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        try {
            m.canVote(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            throw new ArithmeticException("from the main method catch");
        } finally {
            // used to clear memory and resources
            System.out.println("finally block called ");
        }

        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader("a.txt"));
        } catch (Exception e) {

        } finally {
            try {
                if (bf != null)
                    bf.close();
            } catch (IOException e) {
                System.out.println("checked");
            }
        }

        try {
            throw new CostomException("this is costumeexception");
        } catch (CostomException e) {
            System.out.println("catching production exception");
        }

    }

    public void canVote(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("you can not vote");
        }
        System.out.println("you can vote ");
    }
}
