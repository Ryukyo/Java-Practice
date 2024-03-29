package com.flo;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        //    calculateScore(true, 800, 5, 100);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        //  calculateScore(true, 10000, 8, 200);




    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Flo", highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Bob", highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Tim", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Cid", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
