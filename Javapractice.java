import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class Javapractice {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        //Fibonacci
        int[] fib = new int[100];
        fib[1] = 1;
        for (int i = 2; i < 100; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        logger.info("First 100 number: ");
        for (int num : fib) {
            logger.info("number: " + num);
        }

        Scanner scanner = new Scanner(System.in);
        logger.info("input number: ");
        int n = scanner.nextInt();
        logger.info("the " + n + " th Fibonacci number is " + fib[n - 1]);

        //Fibonacci with while loop

        logger.info("input number: ");
        int num = scanner.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;

        while (count < num) {
            b = b + a;
            a = b - a;
            count++;
        }

        logger.info("the " + num + " th fibonacci number is " + a);


        //Magic numbers
        while (true) {
            Random random = new Random();
            int magicnumber = random.nextInt(1574) + 14;
            int guess = 0;
            int count1 = 0;

            while (guess != magicnumber) {
                logger.info("input your magic number: ");
                guess = scanner.nextInt();
                count++;

                if (guess < magicnumber) logger.info("too low");
                if (guess > magicnumber) logger.info("too high");
            }

            logger.info("right guess!! your attemt number is: " + guess);
            logger.info("would u like to play again y/n?");
            String answer = scanner.next().toLowerCase();
            if (answer.equals("y") || answer.equals("yes")) continue;
            if (answer.equals("n") || answer.equals("no")) {
                logger.info("goodbye!!");
            } else {
                logger.info("inccorect text");

            }

            break;
        }


    }
}
