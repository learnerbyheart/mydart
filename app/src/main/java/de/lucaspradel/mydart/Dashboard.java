package de.lucaspradel.mydart;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import de.lucaspradel.mydart.game.ChoseGameActivity;
import de.lucaspradel.mydart.player.CreatePlayerActivity;
import de.lucaspradel.mydart.player.PlayerListActivity;
import de.lucaspradel.mydart.statistics.StatisticsOverviewActivity;


public class Dashboard extends ActionBarActivity {

    private Button newPlayerBtn;
    private Button playerList;
    private Button newGame;
    private Button statisticsOverview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        newPlayerBtn = (Button) findViewById(R.id.btn_createPlayer);
        newPlayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, CreatePlayerActivity.class));
            }
        });
        playerList = (Button) findViewById(R.id.btn_playerList);
        playerList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, PlayerListActivity.class));
            }
        });
        newGame = (Button) findViewById(R.id.btn_newGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, ChoseGameActivity.class));
            }
        });
        statisticsOverview = (Button) findViewById(R.id.btn_statistics);
        statisticsOverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, StatisticsOverviewActivity.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
