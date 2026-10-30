package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the game score: ");
        String gameScore = input.nextLine();

        String[] gameScoreSplit = gameScore.split("\\|");
        String score1 = gameScoreSplit[0];
        String score2 = gameScoreSplit[1];

        String[] gameNumberSplit = gameScore.split("\\:");
        String gameNumber1 = gameNumberSplit[0];
        String gameNumber2 = gameNumberSplit[1];



        if(gameNumber1 > gameNumber2){
            System.out.println(score1);
        } else {
            System.out.println(score2);
        }

       // System.out.println("Winner: " + );
    }
}
