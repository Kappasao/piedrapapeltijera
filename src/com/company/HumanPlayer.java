package com.company;

import java.util.Scanner;

/**
 * Created by 46995932D on 19/01/2017.
 */
public class HumanPlayer {

    public Scanner scanner = new Scanner(System.in);
    public Move play() {

        GamePrinter.printInstructions();
        int num = scanner.nextInt();

        switch (num) {
            case 0:
                return Move.PIEDRA;
            case 1:
                return Move.PAPEL;
            case 2:
                return Move.LAGARTO;
            case 3:
                return Move.TIJERA;
            case 4:
                return Move.SPOCK;
        }

        return null;
    }

}
