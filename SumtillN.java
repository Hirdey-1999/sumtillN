import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input The Number Till You Want To Add And As Soon As You Want To receive result enter 0" );
        int n = 1;
        int sum = 0 ;
        while (n!=0){
            n = input.nextInt();
            sum+=n;
            }
        System.out.println(sum);}

    }

