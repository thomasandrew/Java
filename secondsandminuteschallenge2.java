import com.company.Main;

public class secondsandminuteschallenge2 {

    public static void main(String[] args) {

        String time = Main.getdurationstring(65,45);
        System.out.println(time);

        String time2 = Main.getdurationstring(3945L);
        System.out.println(time2);

    }
}
