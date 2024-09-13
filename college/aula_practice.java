import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println(zenitPolar("PROGRAMA JAVA"));
    System.out.println(zenitPolar("UNILASALLE"));
    
    System.out.println("Digite um numero: ");
    int numPar = scan.nextInt();
    System.out.println(ehPar(numPar));

    System.out.println("Digite o segundo numero: ");
    int numImpar = scan.nextInt();
    System.out.println(ehImpar(numImpar));
  }

  public static String zenitPolar(String str) {
    String resultado = "";

    for (int i=0; i< str.length(); i++) {
      char c = str.charAt(i);

      switch (c) {
        case 'Z': 
          c = 'P';
          break;
        case 'E':
          c = 'O';
          break;
        case 'N':
          c = 'L';
          break;
        case 'I':
          c = 'A';
          break;
        case 'T':
          c = 'R';
        case 'P':
          c = 'Z';
          break;
        case 'O':
          c = 'E';
          break;
        case 'L':
          c = 'N';
          break;
        case 'A':
          c = 'I';
          break;
        case 'R':
          c = 'T';
          break;  
      }
      resultado += c;
    }
    
    return resultado;
  }

  public static boolean ehPar(int num) {
    if (num % 2 == 0) {
      return true;
    }
    return false;
  }

  public static String ehImpar(int num) {
    if (num % 2 == 1) {
      return "Impar";
    }
    return "Nao e impar";
  }
}
