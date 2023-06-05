import java.util.*;

public class upperlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        // trim is used to remove the extra space while we are entering the value
        // charAt(0); it want the index of the value at 0;

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        } else {
            System.out.println("upper case");
        }
    }
}
