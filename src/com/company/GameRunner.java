package com.company;

import com.sun.webkit.ContextMenu;

/**
 * Created by 46995932d on 20/01/2017.
 */
public class GameRunner {

    private GameState game;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    public GameRunner() {
        this.game = new GameState();
        this.humanPlayer = new HumanPlayer();
        this.computerPlayer = new ComputerPlayer();
    }

    public void run(){

        while (!game.isOver()){

            Move computerMove = computerPlayer.play();
            Move humanMove = humanPlayer.play();


            GamePrinter.printHumanMove(humanMove);
            GamePrinter.printComputerMove(computerMove);


            Result result = game.winnerMove(humanMove, computerMove);

            if (result.equals(Result.COMPUTER)){
                game.increasecomputerScore();
            }
            else if (result.equals(Result.HUMAN)){
                game.increasehumanScore();
            }

            GamePrinter.printResult(result);
        }

        GamePrinter.printWinner(game.getWinner());

    }
}
