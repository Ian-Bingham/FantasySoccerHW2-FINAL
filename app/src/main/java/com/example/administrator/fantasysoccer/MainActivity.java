package com.example.administrator.fantasysoccer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Ian Bingham on 9/26/2015.
 */
public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    //instance variables
    public HashMap<String, SoccerTeam> teamDatabase;
    public SoccerTeam t1;
    public SoccerTeam t2;
    public SoccerTeam t3;
    public TextView GamesWonTxt;
    public TextView GamesLostTxt;
    public TextView GamesDrawnTxt;
    public EditText inputTeamName;
    public ImageView teamPic;
    public Button PlayerDetailsButton;
    public Button ChangeCustomTeamNameButton;
    public Button team1Button;
    public Button team2Button;
    public Button CustomTeamButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create the database of soccer teams
        teamDatabase = new HashMap<String, SoccerTeam>();
        t1 = new SoccerTeam("Kingdom Hearts");
        t2 = new SoccerTeam("Professor Layton");
        t3 = new SoccerTeam("Custom Team");

        //reference these things by id
        GamesWonTxt = (TextView)findViewById(R.id.GamesWonTxt);
        GamesLostTxt = (TextView)findViewById(R.id.GamesLostTxt);
        GamesDrawnTxt = (TextView)findViewById(R.id.GamesDrawnTxt);
        inputTeamName = (EditText)findViewById(R.id.inputTeamName);

        team1Button = (Button)findViewById(R.id.team1Button);
        team2Button = (Button)findViewById(R.id.team2Button);
        CustomTeamButton = (Button)findViewById(R.id.CustomTeamButton);

        teamPic = (ImageView)findViewById(R.id.teamPic);

        ChangeCustomTeamNameButton = (Button)findViewById(R.id.ChangeCustomTeamNameButton);
        ChangeCustomTeamNameButton.setOnClickListener(this);

        PlayerDetailsButton = (Button) findViewById(R.id.PlayerDetailsButton);
        PlayerDetailsButton.setOnClickListener(this);


    }



    //shows the stats of each team
    public void showInfo(View v){


        //if this button is pressed
        if(v == team1Button)
        {

            //show the team1 stats
            int gamesWon, gamesLost, gamesDrawn;
            gamesWon = t1.gamesWon;
            gamesLost = t1.gamesLost;
            gamesDrawn = t1.gamesDrawn;
            GamesWonTxt.setText("Games Won: " + gamesWon);
            GamesLostTxt.setText("Games Lost: " + gamesLost);
            GamesDrawnTxt.setText("Games Drawn: " + gamesDrawn);
            teamPic.setImageResource(R.mipmap.kingdom_hearts);

        }

        //if this button is pressed
        if(v == team2Button)
        {

            //show the team2 stats
            int gamesWon, gamesLost, gamesDrawn;
            gamesWon = t2.gamesWon;
            gamesLost = t2.gamesLost;
            gamesDrawn = t2.gamesDrawn;
            GamesWonTxt.setText("Games Won: " + gamesWon);
            GamesLostTxt.setText("Games Lost: " + gamesLost);
            GamesDrawnTxt.setText("Games Drawn: " + gamesDrawn);
            teamPic.setImageResource(R.mipmap.professor_layton);


        }

        //if this button is pressed
        if(v == CustomTeamButton)
        {

            //show the custom team stats
            int gamesWon, gamesLost, gamesDrawn;
            gamesWon = t3.gamesWon;
            gamesLost = t3.gamesLost;
            gamesDrawn = t3.gamesDrawn;
            GamesWonTxt.setText("Games Won: " + gamesWon);
            GamesLostTxt.setText("Games Lost: " + gamesLost);
            GamesDrawnTxt.setText("Games Drawn: " + gamesDrawn);
            teamPic.setImageResource(R.mipmap.tales);


        }

    }



    @Override
    public void onClick(View v) {

        //if this button is pressed
        if(v == ChangeCustomTeamNameButton)
        {

            //update the text of the button
            CustomTeamButton.setText("Custom Team: " + inputTeamName.getText().toString());

        }

        //if this button is pressed
        if(v == PlayerDetailsButton)
        {

            //go to the next activity
            Intent intent = new Intent(MainActivity.this,PlayerScreen.class);
            startActivityForResult(intent,100);

        }


    }



}//end of main




