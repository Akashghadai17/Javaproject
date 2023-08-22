import java.util.Scanner;
public class Task1 {
    public static void guessingnum(){
        Scanner sc = new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int guess;
        System.out.println("A number chosen "+"between 1 to 100"+"Guess the number ");
        while (true){
            System.out.println("Guess the number : ");
            guess=sc.nextInt();
            if(number == guess){
                System.out.println("Congratulation your guessed the number");
                break;
            } else if (number < guess) {
                System.out.println("The number is less than "+guess);

            }
            else if (number > guess) {
                System.out.println("The number is greater than " + guess);
            }
        }
    }

    public static void main(String[] args) {
        guessingnum();
    }
}
