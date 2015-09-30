package com.example.administrator.fantasysoccer;

import java.util.Random;

/**
 * Created by Ian Bingham on 9/27/2015.
 */
public class SoccerTeam {

    // instance variables
    public String teamName; // name of team
    public int gamesWon; // games won
    public int gamesLost; // games lost
    public int gamesDrawn; // games drawn


    //soccer team constructor
    public SoccerTeam(String team) {

        //set random numbers to team stats
        Random rand = new Random();
        int randInt1 = rand.nextInt(15);
        int randInt2 = rand.nextInt(15);
        int randInt3 = rand.nextInt(15);

        teamName = team;
        gamesWon = randInt1;
        gamesLost = randInt2;
        gamesDrawn = randInt3;

    }

}//end of SoccerTeam class
