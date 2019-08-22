package com.company;

public class Main {

    public static void main(String[] args) {

         boolean gameover = true;
         int score = 800;
         int levelcompleted = 5;
         int bonus = 100;

 //        if(score < 5000 && score > 1000) {
 //            System.out.println("your score is 5000");
 //        }else if(score < 1000) {
 //            System.out.println("Your score was less than 1000");
 //        }else{
 //            System.out.println("Nope");
 //        }

         if(gameover == true) {//pode escrever somente gameover que vai ser a mesma coisa que gameover == true.

             int finalscore = score+(levelcompleted * bonus);//A variavel finalscore só pode ser usada em dentro desse if e não funciona fora desse if.
             finalscore += 1000;
             System.out.println("Your final score was: "+finalscore);
         }

         //O de cima vai funcionar de qualquer jeito.

         //challenge

         score = 10000;
         levelcompleted = 8;
         bonus = 200;

         if(gameover) {
             int secondscore = score+(levelcompleted * bonus);
             System.out.println("Your second score was: "+secondscore);
         }





    }
}
