package tk.talcharnes.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void toast (View view) {
        String toast = "";
        switch (view.getId()) {
                case R.id.spotify: toast = "Spotify streamer will show here";
                    break;
                case R.id.scores:  toast = "Scores app will show here";
                    break;
                case R.id.library:  toast = "Library app will show here";
                    break;
                case R.id.build:  toast = "Build it Bigger app will show here";
                    break;
                case R.id.xyz:  toast = "XYZ Reader app will show here";
                    break;
                case R.id.capstone:  toast = "My Capstone app will show here";
                    break;
            }
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();

        }
    }







