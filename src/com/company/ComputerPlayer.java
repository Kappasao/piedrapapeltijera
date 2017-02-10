package com.company;


import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by 46995932D on 19/01/2017.
 */
public class ComputerPlayer {

    public Move play(){
        int randomNum = ThreadLocalRandom.current().nextInt( 0, Move.values().length);

        switch (randomNum){
            case 0: return Move.PIEDRA;
            case 1: return Move.PAPEL;
            case 2: return Move.LAGARTO;
            case 3: return Move.TIJERA;
            case 4: return Move.SPOCK;
        }
        return null;

    }

}
