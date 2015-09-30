package com.example.administrator.fantasysoccer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by Ian Bingham on 9/26/2015.
 */
public class PlayerScreen extends Activity implements View.OnClickListener{

    //instance variables
    public HashMap<String, SoccerPlayer> database;
    //create variables for soccer player objects
    public SoccerPlayer p1;
    public SoccerPlayer p2;
    public SoccerPlayer p3;
    public SoccerPlayer p4;
    public SoccerPlayer p5;
    public SoccerPlayer p6;
    public SoccerPlayer p7;
    public SoccerPlayer p8;
    public SoccerPlayer p9;
    public SoccerPlayer p10;
    public SoccerPlayer p11;
    public SoccerPlayer p12;
    public SoccerPlayer p13;
    public SoccerPlayer p14;
    public SoccerPlayer p15;

    //create variables for buttons
    public Button player1Button;
    public Button player2Button;
    public Button player3Button;
    public Button player4Button;
    public Button player5Button;
    public Button player6Button;
    public Button player7Button;
    public Button player8Button;
    public Button player9Button;
    public Button player10Button;
    public Button player11Button;
    public Button player12Button;
    public Button player13Button;
    public Button player14Button;
    public Button player15Button;
    public Button UpdatePlayerButton;
    public Button TeamDetails;

    //create variables for text views
    public TextView NameTxt2;
    public TextView TeamNameTxt2;
    public TextView PositionTxt2;
    public TextView GoalsScoredTxt2;
    public TextView ShotsTxt2;
    public TextView AssistsTxt2;
    public TextView FoulsTxt2;
    public TextView SavesTxt2;
    public TextView YellowCardsTxt2;
    public TextView RedCardsTxt2;

    //create variables for edit text
    public EditText iName3;
    public EditText iTeam3;
    public EditText iPosition3;
    public EditText iGoalsScored3;
    public EditText iShots3;
    public EditText iAssists3;
    public EditText iFouls3;
    public EditText iSaves3;
    public EditText iYellowCards3;
    public EditText iRedCards3;

    //create variables for image view
    public ImageView playerPic;

    //keeps track of the current player pic
    public int lastResourceId;


    //Intent intent = this.getIntent();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_details);

        database = new HashMap<String, SoccerPlayer>();
        //create soccer players
        p1 = new SoccerPlayer("Sora", "Kingdom Hearts", "Goal Keeper");
        p2 = new SoccerPlayer("Riku", "Kingdom Hearts", "Defender");
        p3 = new SoccerPlayer("Roxas", "Kingdom Hearts", "Mid Fielder");
        p4 = new SoccerPlayer("Tera", "Kingdom Hearts", "Forward");
        p5 = new SoccerPlayer("Axel", "Kingdom Hearts", "Defender");
        p6 = new SoccerPlayer("Layton", "Professor Layton", "Forward");
        p7 = new SoccerPlayer("Luke", "Professor Layton", "Mid Fielder");
        p8 = new SoccerPlayer("Chelmey", "Professor Layton", "Forward");
        p9 = new SoccerPlayer("Anthony", "Professor Layton", "Goal Keeper");
        p10 = new SoccerPlayer("Descole", "Professor Layton", "Defender");
        p11 = new SoccerPlayer("Lloyd", "Custom Team", "Defender");
        p12 = new SoccerPlayer("Kratos", "Custom Team", "Goal Keeper");
        p13 = new SoccerPlayer("Zelos", "Custom Team", "Mid Fielder");
        p14 = new SoccerPlayer("Regal", "Custom Team", "Defender");
        p15 = new SoccerPlayer("Genis", "Custom Team", "Forward");

        //put players in hashmap
        database.put(p1.name, p1);
        database.put(p2.name, p2);
        database.put(p3.name, p3);
        database.put(p4.name, p4);
        database.put(p5.name, p5);
        database.put(p6.name, p6);
        database.put(p7.name, p7);
        database.put(p8.name, p8);
        database.put(p9.name, p9);
        database.put(p10.name, p10);
        database.put(p11.name, p11);
        database.put(p12.name, p12);
        database.put(p13.name, p13);
        database.put(p14.name, p14);
        database.put(p15.name, p15);

        //reference things by id
        player1Button = (Button)findViewById(R.id.player1Button);
        player2Button = (Button)findViewById(R.id.player2Button);
        player3Button = (Button)findViewById(R.id.player3Button);
        player4Button = (Button)findViewById(R.id.player4Button);
        player5Button = (Button)findViewById(R.id.player5Button);
        player6Button = (Button)findViewById(R.id.player6Button);
        player7Button = (Button)findViewById(R.id.player7Button);
        player8Button = (Button)findViewById(R.id.player8Button);
        player9Button = (Button)findViewById(R.id.player9Button);
        player10Button = (Button)findViewById(R.id.player10Button);
        player11Button = (Button)findViewById(R.id.player11Button);
        player12Button = (Button)findViewById(R.id.player12Button);
        player13Button = (Button)findViewById(R.id.player13Button);
        player14Button = (Button)findViewById(R.id.player14Button);
        player15Button = (Button)findViewById(R.id.player15Button);
        UpdatePlayerButton = (Button)findViewById(R.id.UpdatePlayerButton);
        TeamDetails = (Button)findViewById(R.id.TeamDetailsButton);
        TeamDetails.setOnClickListener(this);

        NameTxt2 = (TextView)findViewById(R.id.NameTxt2);
        TeamNameTxt2 = (TextView)findViewById(R.id.TeamNameTxt2);
        PositionTxt2 = (TextView)findViewById(R.id.PostionTxt2);
        GoalsScoredTxt2 = (TextView)findViewById(R.id.GoalsScoredTxt2);
        ShotsTxt2 = (TextView)findViewById(R.id.ShotsTxt2);
        AssistsTxt2 = (TextView)findViewById(R.id.AssistsTxt2);
        FoulsTxt2 = (TextView)findViewById(R.id.FoulsTxt2);
        SavesTxt2 = (TextView)findViewById(R.id.SavesTxt2);
        YellowCardsTxt2 = (TextView)findViewById(R.id.YellowCardsTxt2);
        RedCardsTxt2 = (TextView)findViewById(R.id.RedCardsTxt2);

        iName3 = (EditText)findViewById(R.id.iName3);
        iTeam3 = (EditText)findViewById(R.id.iTeam3);
        iPosition3 = (EditText)findViewById(R.id.iPosition3);
        iGoalsScored3 = (EditText)findViewById(R.id.iGoalsScored3);
        iShots3 = (EditText)findViewById(R.id.iShots3);
        iAssists3 = (EditText)findViewById(R.id.iAssists3);
        iFouls3 = (EditText)findViewById(R.id.iFouls3);
        iSaves3 = (EditText)findViewById(R.id.iSaves3);
        iYellowCards3 = (EditText)findViewById(R.id.iYellowCards3);
        iRedCards3 = (EditText)findViewById(R.id.iRedCards3);

        playerPic = (ImageView)findViewById(R.id.playerPic);


    }


    //shows player stats
    public void showInfo(View v){

        //if this button is pressed, show player1 stats
        if(v == player1Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p1.name;
            teamName = p1.teamName;
            position = p1.position;
            goalsScored = p1.goalsScored;
            shots = p1.shots;
            assists = p1.assists;
            fouls = p1.fouls;
            saves = p1.saves;
            yellowCards = p1.yellowCards;
            redCards = p1.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.sora);
            lastResourceId = R.mipmap.sora;

        }

        //if this button is pressed, show player2 stats
        if(v == player2Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p2.name;
            teamName = p2.teamName;
            position = p2.position;
            goalsScored = p2.goalsScored;
            shots = p2.shots;
            assists = p2.assists;
            fouls = p2.fouls;
            saves = p2.saves;
            yellowCards = p2.yellowCards;
            redCards = p2.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.riku);
            lastResourceId = R.mipmap.riku;

        }

        //if this button is pressed, show player3 stats
        if(v == player3Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p3.name;
            teamName = p3.teamName;
            position = p3.position;
            goalsScored = p3.goalsScored;
            shots = p3.shots;
            assists = p3.assists;
            fouls = p3.fouls;
            saves = p3.saves;
            yellowCards = p3.yellowCards;
            redCards = p3.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.roxas);
            lastResourceId = R.mipmap.roxas;

        }

        //if this button is pressed, show player4 stats
        if(v == player4Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p4.name;
            teamName = p4.teamName;
            position = p4.position;
            goalsScored = p4.goalsScored;
            shots = p4.shots;
            assists = p4.assists;
            fouls = p4.fouls;
            saves = p4.saves;
            yellowCards = p4.yellowCards;
            redCards = p4.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.tera);
            lastResourceId = R.mipmap.tera;

        }

        //if this button is pressed, show player5 stats
        if(v == player5Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p5.name;
            teamName = p5.teamName;
            position = p5.position;
            goalsScored = p5.goalsScored;
            shots = p5.shots;
            assists = p5.assists;
            fouls = p5.fouls;
            saves = p5.saves;
            yellowCards = p5.yellowCards;
            redCards = p5.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.axel);
            lastResourceId = R.mipmap.axel;

        }

        //if this button is pressed, show player6 stats
        if(v == player6Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p6.name;
            teamName = p6.teamName;
            position = p6.position;
            goalsScored = p6.goalsScored;
            shots = p6.shots;
            assists = p6.assists;
            fouls = p6.fouls;
            saves = p6.saves;
            yellowCards = p6.yellowCards;
            redCards = p6.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.layton);
            lastResourceId = R.mipmap.layton;


        }

        //if this button is pressed, show player7 stats
        if(v == player7Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p7.name;
            teamName = p7.teamName;
            position = p7.position;
            goalsScored = p7.goalsScored;
            shots = p7.shots;
            assists = p7.assists;
            fouls = p7.fouls;
            saves = p7.saves;
            yellowCards = p7.yellowCards;
            redCards = p7.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.luke);
            lastResourceId = R.mipmap.luke;

        }

        //if this button is pressed, show player8 stats
        if(v == player8Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p8.name;
            teamName = p8.teamName;
            position = p8.position;
            goalsScored = p8.goalsScored;
            shots = p8.shots;
            assists = p8.assists;
            fouls = p8.fouls;
            saves = p8.saves;
            yellowCards = p8.yellowCards;
            redCards = p8.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.chelmey);
            lastResourceId = R.mipmap.chelmey;


        }

        //if this button is pressed, show player9 stats
        if(v == player9Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p9.name;
            teamName = p9.teamName;
            position = p9.position;
            goalsScored = p9.goalsScored;
            shots = p9.shots;
            assists = p9.assists;
            fouls = p9.fouls;
            saves = p9.saves;
            yellowCards = p9.yellowCards;
            redCards = p9.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.anthony);
            lastResourceId = R.mipmap.anthony;


        }

        //if this button is pressed, show player10 stats
        if(v == player10Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p10.name;
            teamName = p10.teamName;
            position = p10.position;
            goalsScored = p10.goalsScored;
            shots = p10.shots;
            assists = p10.assists;
            fouls = p10.fouls;
            saves = p10.saves;
            yellowCards = p10.yellowCards;
            redCards = p10.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.descole);
            lastResourceId = R.mipmap.descole;


        }

        //if this button is pressed, show player11 stats
        if(v == player11Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p11.name;
            teamName = p11.teamName;
            position = p11.position;
            goalsScored = p11.goalsScored;
            shots = p11.shots;
            assists = p11.assists;
            fouls = p11.fouls;
            saves = p11.saves;
            yellowCards = p11.yellowCards;
            redCards = p11.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.lloyd);
            lastResourceId = R.mipmap.lloyd;


        }

        //if this button is pressed, show player12 stats
        if(v == player12Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p12.name;
            teamName = p12.teamName;
            position = p12.position;
            goalsScored = p12.goalsScored;
            shots = p12.shots;
            assists = p12.assists;
            fouls = p12.fouls;
            saves = p12.saves;
            yellowCards = p12.yellowCards;
            redCards = p12.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.kratos);
            lastResourceId = R.mipmap.kratos;


        }

        //if this button is pressed, show player13 stats
        if(v == player13Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p13.name;
            teamName = p13.teamName;
            position = p13.position;
            goalsScored = p13.goalsScored;
            shots = p13.shots;
            assists = p13.assists;
            fouls = p13.fouls;
            saves = p13.saves;
            yellowCards = p13.yellowCards;
            redCards = p13.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.zelos);
            lastResourceId = R.mipmap.zelos;


        }

        //if this button is pressed, show player14 stats
        if(v == player14Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p14.name;
            teamName = p14.teamName;
            position = p14.position;
            goalsScored = p14.goalsScored;
            shots = p14.shots;
            assists = p14.assists;
            fouls = p14.fouls;
            saves = p14.saves;
            yellowCards = p14.yellowCards;
            redCards = p14.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.regal);
            lastResourceId = R.mipmap.regal;


        }

        //if this button is pressed, show player15 stats
        if(v == player15Button)
        {

            String name, teamName, position;
            int goalsScored, shots, assists, fouls,
                    saves, yellowCards, redCards;

            name = p15.name;
            teamName = p15.teamName;
            position = p15.position;
            goalsScored = p15.goalsScored;
            shots = p15.shots;
            assists = p15.assists;
            fouls = p15.fouls;
            saves = p15.saves;
            yellowCards = p15.yellowCards;
            redCards = p15.redCards;

            NameTxt2.setText("Name: " + name);
            TeamNameTxt2.setText("Team: " + teamName);
            PositionTxt2.setText("Postion: " + position);
            GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
            ShotsTxt2.setText("Shots: " + shots);
            AssistsTxt2.setText("Assists: " + assists);
            FoulsTxt2.setText("Fouls: " + fouls);
            SavesTxt2.setText("Saves: " + saves);
            YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
            RedCardsTxt2.setText("Red Cards: " + redCards);
            playerPic.setImageResource(R.mipmap.genis);
            lastResourceId = R.mipmap.genis;

        }

    }//end of showInfo



    //updates players
    public void UpdatePlayer(View v) {

        //if the update button is pressed, check to see which player to update
        if (v == UpdatePlayerButton) {

            //if at least one input field is empty, display error message
            if (iName3.getText().toString().equals("") || iTeam3.getText().toString().equals("") ||
                    iPosition3.getText().toString().equals("") || iGoalsScored3.getText().toString().equals("") ||
                    iShots3.getText().toString().equals("") || iAssists3.getText().toString().equals("") ||
                    iFouls3.getText().toString().equals("") || iSaves3.getText().toString().equals("") ||
                    iYellowCards3.getText().toString().equals("") || iRedCards3.getText().toString().equals(""))
            {

                Toast.makeText(getBaseContext(), "Update Player does not work if at least one input field is empty.",
                        Toast.LENGTH_LONG).show();
                return;

            }

            //else, check which player to update
            else {

                //if the selected player has this pic => this is player1, so update player1
                if(lastResourceId == R.mipmap.sora)
                {

                    p1.name = iName3.getText().toString();
                    p1.teamName = iTeam3.getText().toString();
                    p1.position = iPosition3.getText().toString();
                    p1.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p1.shots = Integer.parseInt(iShots3.getText().toString());
                    p1.assists = Integer.parseInt(iAssists3.getText().toString());
                    p1.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p1.saves = Integer.parseInt(iSaves3.getText().toString());
                    p1.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p1.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player2, so update player2
                if(lastResourceId == R.mipmap.riku)
                {

                    p2.name = iName3.getText().toString();
                    p2.teamName = iTeam3.getText().toString();
                    p2.position = iPosition3.getText().toString();
                    p2.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p2.shots = Integer.parseInt(iShots3.getText().toString());
                    p2.assists = Integer.parseInt(iAssists3.getText().toString());
                    p2.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p2.saves = Integer.parseInt(iSaves3.getText().toString());
                    p2.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p2.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player3, so update player3
                if(lastResourceId == R.mipmap.roxas)
                {

                    p3.name = iName3.getText().toString();
                    p3.teamName = iTeam3.getText().toString();
                    p3.position = iPosition3.getText().toString();
                    p3.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p3.shots = Integer.parseInt(iShots3.getText().toString());
                    p3.assists = Integer.parseInt(iAssists3.getText().toString());
                    p3.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p3.saves = Integer.parseInt(iSaves3.getText().toString());
                    p3.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p3.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player4, so update player4
                if(lastResourceId == R.mipmap.tera)
                {

                    p4.name = iName3.getText().toString();
                    p4.teamName = iTeam3.getText().toString();
                    p4.position = iPosition3.getText().toString();
                    p4.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p4.shots = Integer.parseInt(iShots3.getText().toString());
                    p4.assists = Integer.parseInt(iAssists3.getText().toString());
                    p4.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p4.saves = Integer.parseInt(iSaves3.getText().toString());
                    p4.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p4.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player5, so update player5
                if(lastResourceId == R.mipmap.axel)
                {

                    p5.name = iName3.getText().toString();
                    p5.teamName = iTeam3.getText().toString();
                    p5.position = iPosition3.getText().toString();
                    p5.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p5.shots = Integer.parseInt(iShots3.getText().toString());
                    p5.assists = Integer.parseInt(iAssists3.getText().toString());
                    p5.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p5.saves = Integer.parseInt(iSaves3.getText().toString());
                    p5.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p5.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player6, so update player6
                if(lastResourceId == R.mipmap.layton)
                {

                    p6.name = iName3.getText().toString();
                    p6.teamName = iTeam3.getText().toString();
                    p6.position = iPosition3.getText().toString();
                    p6.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p6.shots = Integer.parseInt(iShots3.getText().toString());
                    p6.assists = Integer.parseInt(iAssists3.getText().toString());
                    p6.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p6.saves = Integer.parseInt(iSaves3.getText().toString());
                    p6.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p6.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player7, so update player7
                if(lastResourceId == R.mipmap.luke)
                {

                    p7.name = iName3.getText().toString();
                    p7.teamName = iTeam3.getText().toString();
                    p7.position = iPosition3.getText().toString();
                    p7.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p7.shots = Integer.parseInt(iShots3.getText().toString());
                    p7.assists = Integer.parseInt(iAssists3.getText().toString());
                    p7.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p7.saves = Integer.parseInt(iSaves3.getText().toString());
                    p7.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p7.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player8, so update player8
                if(lastResourceId == R.mipmap.chelmey)
                {

                    p8.name = iName3.getText().toString();
                    p8.teamName = iTeam3.getText().toString();
                    p8.position = iPosition3.getText().toString();
                    p8.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p8.shots = Integer.parseInt(iShots3.getText().toString());
                    p8.assists = Integer.parseInt(iAssists3.getText().toString());
                    p8.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p8.saves = Integer.parseInt(iSaves3.getText().toString());
                    p8.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p8.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player9, so update player9
                if(lastResourceId == R.mipmap.anthony)
                {

                    p9.name = iName3.getText().toString();
                    p9.teamName = iTeam3.getText().toString();
                    p9.position = iPosition3.getText().toString();
                    p9.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p9.shots = Integer.parseInt(iShots3.getText().toString());
                    p9.assists = Integer.parseInt(iAssists3.getText().toString());
                    p9.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p9.saves = Integer.parseInt(iSaves3.getText().toString());
                    p9.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p9.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player10, so update player10
                if(lastResourceId == R.mipmap.descole)
                {

                    p10.name = iName3.getText().toString();
                    p10.teamName = iTeam3.getText().toString();
                    p10.position = iPosition3.getText().toString();
                    p10.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p10.shots = Integer.parseInt(iShots3.getText().toString());
                    p10.assists = Integer.parseInt(iAssists3.getText().toString());
                    p10.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p10.saves = Integer.parseInt(iSaves3.getText().toString());
                    p10.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p10.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player11, so update player11
                if(lastResourceId == R.mipmap.lloyd)
                {

                    p11.name = iName3.getText().toString();
                    p11.teamName = iTeam3.getText().toString();
                    p11.position = iPosition3.getText().toString();
                    p11.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p11.shots = Integer.parseInt(iShots3.getText().toString());
                    p11.assists = Integer.parseInt(iAssists3.getText().toString());
                    p11.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p11.saves = Integer.parseInt(iSaves3.getText().toString());
                    p11.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p11.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player12, so update player12
                if(lastResourceId == R.mipmap.kratos)
                {

                    p12.name = iName3.getText().toString();
                    p12.teamName = iTeam3.getText().toString();
                    p12.position = iPosition3.getText().toString();
                    p12.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p12.shots = Integer.parseInt(iShots3.getText().toString());
                    p12.assists = Integer.parseInt(iAssists3.getText().toString());
                    p12.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p12.saves = Integer.parseInt(iSaves3.getText().toString());
                    p12.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p12.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player13, so update player13
                if(lastResourceId == R.mipmap.zelos)
                {

                    p13.name = iName3.getText().toString();
                    p13.teamName = iTeam3.getText().toString();
                    p13.position = iPosition3.getText().toString();
                    p13.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p13.shots = Integer.parseInt(iShots3.getText().toString());
                    p13.assists = Integer.parseInt(iAssists3.getText().toString());
                    p13.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p13.saves = Integer.parseInt(iSaves3.getText().toString());
                    p13.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p13.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player14, so update player14
                if(lastResourceId == R.mipmap.regal)
                {

                    p14.name = iName3.getText().toString();
                    p14.teamName = iTeam3.getText().toString();
                    p14.position = iPosition3.getText().toString();
                    p14.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p14.shots = Integer.parseInt(iShots3.getText().toString());
                    p14.assists = Integer.parseInt(iAssists3.getText().toString());
                    p14.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p14.saves = Integer.parseInt(iSaves3.getText().toString());
                    p14.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p14.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //if the selected player has this pic => this is player15, so update player15
                if(lastResourceId == R.mipmap.genis)
                {

                    p15.name = iName3.getText().toString();
                    p15.teamName = iTeam3.getText().toString();
                    p15.position = iPosition3.getText().toString();
                    p15.goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                    p15.shots = Integer.parseInt(iShots3.getText().toString());
                    p15.assists = Integer.parseInt(iAssists3.getText().toString());
                    p15.fouls = Integer.parseInt(iFouls3.getText().toString());
                    p15.saves = Integer.parseInt(iSaves3.getText().toString());
                    p15.yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                    p15.redCards = Integer.parseInt(iRedCards3.getText().toString());

                }

                //display the updated information
                String name, teamName, position;
                int goalsScored, shots, assists, fouls,
                        saves, yellowCards, redCards;

                name = iName3.getText().toString();
                teamName = iTeam3.getText().toString();
                position = iPosition3.getText().toString();
                goalsScored = Integer.parseInt(iGoalsScored3.getText().toString());
                shots = Integer.parseInt(iShots3.getText().toString());
                assists = Integer.parseInt(iAssists3.getText().toString());
                fouls = Integer.parseInt(iFouls3.getText().toString());
                saves = Integer.parseInt(iSaves3.getText().toString());
                yellowCards = Integer.parseInt(iYellowCards3.getText().toString());
                redCards = Integer.parseInt(iRedCards3.getText().toString());

                NameTxt2.setText("Name: " + name);
                TeamNameTxt2.setText("Team: " + teamName);
                PositionTxt2.setText("Postion: " + position);
                GoalsScoredTxt2.setText("Goals scored: " + goalsScored);
                ShotsTxt2.setText("Shots: " + shots);
                AssistsTxt2.setText("Assists: " + assists);
                FoulsTxt2.setText("Fouls: " + fouls);
                SavesTxt2.setText("Saves: " + saves);
                YellowCardsTxt2.setText("Yellow Cards: " + yellowCards);
                RedCardsTxt2.setText("Red Cards: " + redCards);

            }

        }

    }//end UpdatePlayer



    //go back to the first activity
    public void onClick(View v) {

        finish();

    }


}//end PlayerScreen
