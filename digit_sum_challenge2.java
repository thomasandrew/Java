import com.company.digit_sum_challenge;

public class digit_sum_challenge2 {

    public static void main(String[] args) {

        int plus = digit_sum_challenge.sumDigits(125);
        int plus2 = digit_sum_challenge.sumDigits(-125);
        int plus3 = digit_sum_challenge.sumDigits(4);
        int plus4 = digit_sum_challenge.sumDigits(32123);

        System.out.println("The sum of the digits in number 125: "+plus);
        System.out.println("The sum of the digits in number -125: "+plus2);
        System.out.println("The sum of the digits in number 4: "+plus3);
        System.out.println("The sum of the digits in number 32123: "+plus4);
    }
}
