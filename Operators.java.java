package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1+2=" + result);
        int previousresult = result;
        System.out.println("1+2=" + previousresult);
        result = result - 1;
        System.out.println("3 - 1 =" + result);
        System.out.println("previous result: " + previousresult);

        result = result * 10;
        System.out.println("2*10=" + result);

        result = result / 5;
        System.out.println("20/5=" + result);

        //modulos or reminder operator
        result = result % 3;
        System.out.println("4%3=" + result);

        //Abbreviatig operators
        result++;//1+1=2
        System.out.println("1 + 1=" + result);

        result--;//2-1=1
        System.out.println("2-1=" + result);

        result += 2;
        System.out.println("1+2=" + result);

        result *= 10;
        System.out.println("3*10=" + result);

        result /= 3;
        System.out.println("30 / 3 =" + result);

        result -= 2;
        System.out.println("10 - 2 =" + result);

        //if and then

        boolean isalien = false;
        if (isalien == false)// if i add ';' it will run no matter what
            System.out.println("It is not an alien!");//i dont need to add code blocks if i just want to print only one sout

        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the high score!");
        }

        int secondscore = 70;
        if ((topscore > secondscore) && (topscore < 100)) {//parenteses deixa mais facil de ler
            // colocar "!=" dar certo se no for o numero
            System.out.println("greater than second top score and less than 100");
        }

        if ((topscore > 90) || (secondscore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newvalue = 50;
        if (newvalue == 50) {
            System.out.println("it is true");
        }

        boolean iscar = false;
        if (iscar) {// se colocar somente "=" vai dar bug pq o boolean funciona com um "=" e se colocar o ponte de exclamacao("!") antes da variavel quer dizer que (nao e o iscar)
            System.out.println("this is not supposed to happen");
        }

        //trtnary operator
        boolean wascar = iscar ? true : false;
        if(wascar) {
             System.out.println("wascar is true");
        }

        //boolean (eighteenorover=ageofclient == 20) ? true : false; "fica mais facil de ler com parenteses"

        //search on google about summery of operators java and search on google about java operator precendence table
        }


        }

