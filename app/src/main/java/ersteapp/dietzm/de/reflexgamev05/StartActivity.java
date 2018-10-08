package ersteapp.dietzm.de.reflexgamev05;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void readyToStart(View view) {

        Intent i = new Intent(this, HighscoreActivity.class);
        startActivity(i);

    }
}
