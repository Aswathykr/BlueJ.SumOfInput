import java.util.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        try{
            int number = scanner.nextInt();
            for(int i = 1; i <= number; i++)
            {
                sum += i;
            }
            System.out.printf("The sum of numbers upto %d is %d\n", number, sum);
        }
        catch(Exception e)
        {
            System.out.printf("This works only on numbers!!");
        }
    }
}
