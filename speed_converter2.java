import com.company.Main;

public class main2 {
    public static void main(String[] args) {

          long Miles = Main.toMilesPerHour(10.5);//Se digitar double vai converter para double
          System.out.println("Miles: "+Miles);

          Main.printConversion(10.5);
    }
}
