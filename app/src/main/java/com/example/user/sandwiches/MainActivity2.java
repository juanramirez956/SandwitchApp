package com.example.user.sandwiches;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity2 extends ActionBarActivity {
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        results = (TextView)findViewById((R.id.lblsummaryuser));
        Sandwitch sandwitch1 = getIntent().getParcelableExtra("Sandwitch");
        Log.d("sandwitch","afdadsfsadfasdfas");
        results.setText(PrepareMenuSummary(sandwitch1));
    }

    public String PrepareMenuSummary(Sandwitch sandwitch)
    {
        String sandwitchString = "";
        sandwitchString = sandwitch.getBread();
        sandwitchString = sandwitchString +","+ sandwitch.getBacon();
        sandwitchString = sandwitchString +","+ sandwitch.getCheese();
        sandwitchString = sandwitchString +","+ sandwitch.getOnion();
        sandwitchString = sandwitchString +","+ sandwitch.getKetchup();
        sandwitchString = sandwitchString +","+ sandwitch.getLettuce();
        sandwitchString = sandwitchString +","+ sandwitch.getPeperoni();
       return  sandwitchString;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
