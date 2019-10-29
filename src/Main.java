import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(oddNumer(5));
        System.out.println(twoAsOne(4,4,8));
    }

    static int oddNumer ( int number){
        System.out.println("PROGRAM IS CHECKING IF NUMBER CAN BE DIVIDE BY 3 and 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {  //we check if the rest of the dividing is equal 0
            System.out.println("this number can be divide by 3 and 5!");
        } else {
            System.out.println("this numer cannot be divide by 3 and 5");
        }
        return number;
    }

    static boolean twoAsOne(int a, int b, int c){
        System.out.println("PROGRAM IS CHECKING IS SUM OF 2 NUMBERS WILL BE THIS SAME LIKE THIRD NUMBER");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of a: ");
        a = scanner.nextInt();
        System.out.println("Give the number of b: ");
        b = scanner.nextInt();
        System.out.println("Give the number of c: ");
        c = scanner.nextInt();
        boolean twoAsOne = true;
        if ((a + b) == c || (a + c) == b || (b + c) == a) { //we are checking every possibility if sum of 2 numbers is this same like third number
            System.out.println("SUM OF 2 NUMBERS IS THIS SAME LIKE THIRD ONE");
        }
        else {
            System.out.println("SUM OF 2 NUMBERS IS NOT THIS SAME LIKE THIRD ONE");
        }

        return twoAsOne;
    }

}

