/*1) Escreva um método (função) em Java chamado 'zenitPolar' ( public static String zenitPolar(String str)  ) que receba uma String como parâmetro e devolva uma nova String contendo a codificação ZENIT-POLAR dessa String. Essa codificação consiste em trocar Z por P, E por O, N por L, I por A, T por R, e vice-versa; mas as letras que não fazem parte desse conjuntos são preservadas na criptografia.

EXEMPLOS:
A String 'PROGRAMA JAVA' na Criptografia ZENIT-POLAR seria 'ZTEGTIMI JIVI'
A String 'UNILASALLE' na Criptografia ZENIT-POLAR seria 'ULANISINNO'

Algumas dicas ============
a) Crie uma variável String chamada 'resultado' inicializada com "".
b) A cada vez que você processar uma letra da String original, concatene em 'resultado' o novo caracter com a codificação ZENIT-POLAR (se estiver entre essas letras) ou o caracter original, caso não pertença a esse conjunto de letras.
c) Para concatenar uma String com um caracter, você poderá usar o operador +=
ex:
     String  resultado = "";
     char  c = 'X';
     char  k = 'Y';
     resultado += c; // resultado passará a referenciar uma String com conteúdo "X"
     resultado += k; // resultado passará a referenciar uma String com conteúdo "XY"

2) Escreva um método (função) em Java chamado 'ehPrimo' (public static boolean ehPrimo(int num) )  que receba um número e informe se ele é um número primo ou não. 

3) Por fim, escreva um método main que leia uma String e apresente a sua codificação em ZenitPolar e que leia um número e informe se ele é primo ou não.*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(zenitPolar("PROGRAMA JAVA"));
    System.out.println(zenitPolar("UNILASALLE"));

    System.out.println();
    System.out.println(ehPrimo(3));
  }

  public static String zenitPolar(String str) {
    String resultado = "";
    
    for (int i=0; i<str.length(); i++) {
      char c = str.charAt(i);

      switch(c) {
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
        break;  

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

  public static boolean ehPrimo(int num) {

    if (num <= 1) {
      return false;
    }
    
    for (int i=2; i<=num/2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
