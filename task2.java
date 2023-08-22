import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int max=100;
       int total=600;
        System.out.println("Enter your th1 mark : ");
        int th1=sc.nextInt();
        System.out.println("Enter your th2 mark : ");
        int th2=sc.nextInt();
        System.out.println("Enter your th3 mark :");
        int th3=sc.nextInt();
        System.out.println("Enter your th4 mark : ");
        int th4=sc.nextInt();
        System.out.println("Enter your th5 mark : ");
        int th5=sc.nextInt();
        System.out.println("Enter your th6 mark : ");
        int th6=sc.nextInt();
        char Grade;
        int tm=th1+th2+th3+th4+th5+th6;
        System.out.println("Your total mark is "+tm);
        int percentage=(tm*max/total);
        System.out.println("Your percentage is  "+percentage);
        if(percentage > 80) {
            System.out.println("Your grade is A");
        } 
        else if (percentage > 60) {
            System.out.println("Your grade is B");
        } 
        else if (percentage > 50) {
            System.out.println("Your grade is C");
        } 
        else if (percentage > 30) {
            System.out.println("Your grade is D");
        } 
        else if (percentage > 10) {
            System.out.println("Your grade is F");

        }


    }

}

