package com.company;

public class while_and_dowhile_statements {

    public static void main(String[] args) {
	   int count = 1;
	   while(count != 6) {
	       System.out.println("Count value is: "+count);
	       count++;
       }

	   //For loop below is not identical to the above while loop
 //      for (int i=1;i<7;i++) {
 //         System.out.println("Count value is: "+count);
 //      }

      // The for loop below is the correct one.
 //     for (count=1;count!=6;count++) {
//          System.out.println("Count value is: "+count);
//      }

//       count = 1;//Again because the count variable changed because of the while loop above.
//	   while(true) {
//	       if (count == 6) {
//	           break;
//     }
//           System.out.println("Count value is: "+count);
//	       count++;
//       }

        count = 6;
        do {
            System.out.println("Count value is: "+count);
            count++;// Need to do this

            if (count > 100) {
                break;
            }// It will break the loop even if while is != 6.

        } while(count != 6);

        System.out.println();

//        int number = 4;
//        int finishnumber = 20;
//        while (number <= finishnumber) {
//            number++;
//            if (!isevennumber(number)) {
//                  continue;//It will continue even when the number is not even and it will not show the even numbers but it will continue it is kinda diferrent than break;
//            }
//            System.out.println("Even number: "+number);
//        }

       int number = 4;
       int finishnumber = 20;
       long cont = 0;
       while (number <= finishnumber) {
          number++;
          if (!isevennumber(number)) {
                continue;//Skipping numbers
           }

          System.out.println("even numbers: "+number);

          cont++;

          if (cont == 5) {
              break;
          }

       }

        System.out.println("the total of even numbers: "+cont);
    }

    public static boolean isevennumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
