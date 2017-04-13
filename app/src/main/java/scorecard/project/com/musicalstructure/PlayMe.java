package scorecard.project.com.musicalstructure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

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
                Uri a = Uri.parse("http://downloadsongspk.in/copy6/Blank%20Space%20-%20320Kbps%20-%20(www.songspksongspk.cc).mp3");
                Intent intent = new Intent();
                intent.setAction(android.content.Intent.ACTION_VIEW);
                intent.setDataAndType(a, "audio/*");
                startActivity(intent);
            }
        });
    }

}
