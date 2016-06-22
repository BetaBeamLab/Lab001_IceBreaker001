package beam.lab001_icebreaker001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{

    private int count = 0;
    boolean winState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextLevel = (Button) findViewById(R.id.button);


        if(winState == false)
        {
            nextLevel.setVisibility(View.GONE);
        }
        else
        {
            nextLevel.setVisibility(View.VISIBLE);
        }


    }

    public void breakIce(View view)
    {
        count++;
        if(count > 9)
        {
            levelWin();
        }
    }

    public void levelWin()
    {
        winState =  true;

    }

}
