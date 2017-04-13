package scorecard.project.com.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_me);
        ImageView button = (ImageView) findViewById(R.id.play_button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Play Button", "Tapped");
                Toast.makeText(getApplicationContext(), "Music Playing", Toast.LENGTH_LONG).show();

            }



    });
        ImageView mic=(ImageView)findViewById(R.id.search_mic);
        mic.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlayMe.this,SearchActivity.class));
            }
        });

        ImageView next=(ImageView)findViewById(R.id.skip_next);
        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getApplicationContext(),"Next Track",Toast.LENGTH_SHORT).show();
            }
        });
        ImageView previous=(ImageView)findViewById(R.id.skip_previous);
        previous.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Previous Track",Toast.LENGTH_SHORT).show();
            }
        });
}}