package me.nareshhing.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void buttonAndToast(View view) {
        int id = view.getId();
        String[] appNames = {
                "Spotify Streamer",
                "Scores",
                "Library",
                "Build It Bigger",
                "XYZ Reader",
                "Capstone",
                "Unidentified"
        };
        String appName;
        CharSequence text;

        if (id == R.id.spotifyStreamerButton) {
            appName = appNames[0];
        } else if (id == R.id.scoresAppButton) {
            appName = appNames[1];
        } else if (id == R.id.libraryAppButton) {
            appName = appNames[2];
        } else if (id == R.id.buildItBiggerAppButton) {
            appName = appNames[3];
        } else if (id == R.id.xyzReaderAppButton) {
            appName = appNames[4];
        } else if (id == R.id.capstoneAppButton) {
            appName = appNames[5];
        } else {
            appName = appNames[6];
        }
        text = "This will launch my " + appName + " app.";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
