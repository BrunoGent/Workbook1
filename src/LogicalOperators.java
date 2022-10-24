import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Input a number");
        int x = reader.nextInt();

        System.out.println("is "+ x + " higher than 3 AND lower than 10? " + (x>3 &&x <10));
        System.out.println("is "+ x + " a pair number OR lower than 10?" + ((x % 2 == 0 ) || x<10));
        System.out.println("is "+ x + " NOT a prime number? " + (!isPrime(x)));
    }

    //Function copied from Stackoverflow
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
