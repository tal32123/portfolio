package tk.talcharnes.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void toast (View view) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
    public void spotify(View view){
        toast = "Spotify app will be available here";
        toast(view);
    }
    public void scores(View view){
        toast = "Scores app will be available here";
        toast(view);
    }
    public void library(View view){
        toast = "Library app will be available here";
        toast(view);
    }
    public void build(View view){
        toast = "Build it Bigger app will be available here";
        toast(view);
    }
    public void xyz(View view){
        toast = "XYZ app will be available here";
        toast(view);
    }
    public void capstone(View view){
        toast = "My Capstone app will be available here";
        toast(view);
    }






}
