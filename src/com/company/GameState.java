package com.company;

/**
 * Created by 46995932D on 19/01/2017.
 */
public class GameState {

    private int humanScore = 0;
    private int computerScore = 0;

    public int getHumanScore() {
        return humanScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int increasehumanScore (){
        humanScore++;
        return humanScore;
    }

    public int increasecomputerScore(){
        computerScore++;
        return computerScore;
    }

    public boolean isOver(){
        if (humanScore==3 || computerScore==3){
            return true;
        }
        else {
            return false;
        }
    }

    public Result winnerMove (Move human, Move computer){
        if (human.equals(Move.PIEDRA)  && computer.equals(Move.PAPEL)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.PIEDRA)  && computer.equals(Move.TIJERA)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.PIEDRA)  && computer.equals(Move.LAGARTO)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.PIEDRA)  && computer.equals(Move.SPOCK)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.PAPEL)  && computer.equals(Move.PIEDRA)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.PAPEL)  && computer.equals(Move.TIJERA)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.PAPEL)  && computer.equals(Move.LAGARTO)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.PAPEL)  && computer.equals(Move.SPOCK)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.TIJERA)  && computer.equals(Move.PIEDRA)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.TIJERA)  && computer.equals(Move.PAPEL)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.TIJERA)  && computer.equals(Move.LAGARTO)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.TIJERA)  && computer.equals(Move.SPOCK)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.LAGARTO)  && computer.equals(Move.PIEDRA)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.LAGARTO)  && computer.equals(Move.PAPEL)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.LAGARTO)  && computer.equals(Move.TIJERA)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.LAGARTO)  && computer.equals(Move.SPOCK)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.SPOCK)  && computer.equals(Move.PIEDRA)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.SPOCK)  && computer.equals(Move.PAPEL)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.SPOCK)  && computer.equals(Move.TIJERA)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.SPOCK)  && computer.equals(Move.LAGARTO)){
            return Result.COMPUTER;
        }
        else {
            return Result.DRAW;
        }

    }

    public Result getWinner(){
        if (humanScore==3){
            return Result.HUMAN;
        }
        else if (computerScore==3){
            return Result.COMPUTER;
        }
        return null;
    }
}
