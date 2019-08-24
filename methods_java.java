package com.company;

public class Main {

    public static void main(String[] args) {

        //Com o method nao precisa criar variaveis aqui pr eu ja criei no method.
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;


        //calculatescore(true,800,5,100);//pode usar o nome para passar a variavel para o method.

        int highscore = calculatescore(gameover, score, levelcompleted, bonus);
        System.out.println("Your final score was: " + highscore);

        score = 10000;
        levelcompleted = 8;
        bonus = 200;
        //calculatescore(true,10000,8,200); para usar pela segunda vez.

        highscore = calculatescore(gameover, score, levelcompleted, bonus);
        System.out.println("Your final score was: " + highscore);

        int highscoreposition = calculatehighscoreposition(1500);
         displayhighscoreposition("Tim ",highscoreposition);

        highscoreposition = calculatehighscoreposition(900);
         displayhighscoreposition("Bob ",highscoreposition);

        highscoreposition = calculatehighscoreposition(400);
         displayhighscoreposition("Percy ",highscoreposition);

        highscoreposition = calculatehighscoreposition(50);
         displayhighscoreposition("Gilbert ",highscoreposition);




    }

    public static int calculatescore(boolean gameover, int score, int levelcompleted, int bonus) {//pode usar void para retorna nada, pode usar double e char tb.

        if (gameover == true) {

            int finalscore = score + (levelcompleted * bonus);
            finalscore += 2000;
//            System.out.println("Your final score was: "+finalscore);//O System.out.println vai funcionar para as duas declaracoes do metodo a cima.
            return finalscore;
        }//else{
        //return -1;//pode retornar assim se gameover for false
//         }

        return -1;

    }

    public static void displayhighscoreposition(String playername,int highscoreposition) {

        System.out.println(playername+"Managed to get into position"+" "+highscoreposition+" "+"on the high score table");

    }

    public static int calculatehighscoreposition(int playerscore) {

        if(playerscore > 1000) {
            return 1;
        }

        if(playerscore >= 500 && playerscore < 1000) {
            return 2;
        }

        if(playerscore >= 100 && playerscore <500) {
            return 3;
        }

        else {
            return 4;
        }
    }
}