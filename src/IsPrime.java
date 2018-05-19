import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        int value;
        boolean isPrime;

        value = getValue(user);

        isPrime = testPrime(value);

        printResults(isPrime, value);
    }

    private static int getValue(Scanner user) {
        System.out.println("Please enter a value");
        int value = user.nextInt();

        return value;
    }

    private static boolean testPrime(int value){
        if(value == 2)
            return true;
        for(int i = 2; i < value/2; i++){
            if(value % i == 0)
                return false;
        }
        return true;
    }

    private static void printResults(boolean isPrime, int value){
        if(isPrime)
            System.out.println(value + " is Prime");
        else{
            System.out.println(value + " is not Prime");
        }
    }
}
