import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

       
        int i2;
        double d2;
        String s2;

        i2 = scan.nextInt();
        d2 = scan.nextDouble();

        scan.nextLine();
        s2 = scan.nextLine();

       
        System.out.println(i + i2);

        System.out.println(d + d2);
      
        System.out.println(s.concat(s2));

        scan.close();
    }
}
