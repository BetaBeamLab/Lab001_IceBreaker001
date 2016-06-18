package beam.lab001_icebreaker001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void breakIce()
    {
        count++;
        if(count > 9)
        {

        }
    }

    private void levelWin()
    {

    }

}
