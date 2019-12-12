package Muslim.muslim.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.muslim.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplachActivity extends AppCompatActivity
{

    private TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);

        initalTimer();
    }

    private void initalTimer()
    {
        timerTask = new TimerTask()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        };

        new Timer().schedule(timerTask,2250);
    }

}

