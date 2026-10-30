package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the game score: ");
        String gameScore = input.nextLine();

        String[] gameScoreSplit = gameScore.split("\\|");
        String name = gameScoreSplit[0];
        String score = gameScoreSplit[1];

        String[] teamName = gameScoreSplit[0].split(":");
        String[] teamScore = gameScoreSplit[1].split(":");

        String teamName1 =  teamName[0];
        String teamName2 =  teamName[1];

        int score1 = Integer.parseInt(teamScore[0]);
        int score2 = Integer.parseInt(teamScore[1]);


        if(score1 > score2){
            System.out.println("Winner: " + teamName1);
        } else if (score1 == score2)  {
            System.out.println("Winner: Tie!");
        } else {
            System.out.println("Winner: " + teamName2);
        }
    }
}
