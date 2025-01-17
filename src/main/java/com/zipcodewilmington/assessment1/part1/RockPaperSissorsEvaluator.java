package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        switch (handSign) {
            case ROCK: winningMove = PAPER;
                        break;
            case PAPER: winningMove = SCISSOR;
                        break;
            case SCISSOR: winningMove = ROCK;
                        break;
        }
        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove = "";
        switch(handSign) {
            case ROCK : losingMove = SCISSOR;
                        break;
            case PAPER : losingMove = ROCK;
                        break;
            case SCISSOR : losingMove = PAPER;
                        break;
        }
        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winningMove1 = getWinningMove(handSignOfPlayer1);
        String losingMove1 = getLosingMove(handSignOfPlayer1);
        if (winningMove1.equals(handSignOfPlayer2)) {
            return handSignOfPlayer2;
        } else if (losingMove1.equals(handSignOfPlayer2)) {
            return handSignOfPlayer1;
        }
        return "";
    }
}
