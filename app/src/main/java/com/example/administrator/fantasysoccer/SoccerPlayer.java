package com.example.administrator.fantasysoccer;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Ian Bingham on 9/26/2015.
 */
public class SoccerPlayer {
    // instance variables
    public String name;
    public String teamName; // name of team
    public String position; //position of player
    public int goalsScored; // goals scored
    public int shots; // shots
    public int assists; // assists
    public int fouls; // fouls committed
    public int saves; // saves made
    public int yellowCards; // yellow cards shown
    public int redCards; // red cards shown


    //soccer player constructor
    public SoccerPlayer(String name1, String team, String myPosition) {

        //set random numbers to player stats
        Random rand = new Random();
        int randInt1 = rand.nextInt(15);
        int randInt2 = rand.nextInt(15);
        int randInt3 = rand.nextInt(15);
        int randInt4 = rand.nextInt(15);
        int randInt5 = rand.nextInt(15);
        int randInt6 = rand.nextInt(15);
        int randInt7 = rand.nextInt(15);

        name = name1;
        teamName = team;
        goalsScored = randInt1;
        shots = randInt3;
        assists = randInt2;
        fouls = randInt4;
        saves = randInt5;
        yellowCards = randInt6;
        redCards = randInt7;
        position = myPosition;
    }

}//end SoccerPlayer class
