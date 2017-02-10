package com.company;

/**
 * Created by 46995932D on 19/01/2017.
 */
public class GamePrinter {

    public static void printInstructions(){

        System.out.println("Escoje un numero");
    }

    public static void optionNotValid(){
        System.out.println("Introduce a number between 0 and 4");
    }

    public static void printResult (Result result){
        if (result.equals(Result.HUMAN) || result.equals(Result.COMPUTER)){
            System.out.println(result.name() + " has won");
        }
        else {
            System.out.println("DRAW");
        }
    }

    public static void printWinner(Result winner){
        System.out.println(winner.name() +" has won the game");
    }

    public static void printHumanMove (Move move){
        System.out.println("You choosed " +move.name());
    }

    public static void printComputerMove (Move move){
        System.out.println("The computer choosed " +move.name());
    }



}
