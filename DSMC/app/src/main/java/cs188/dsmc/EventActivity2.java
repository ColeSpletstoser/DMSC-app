package cs188.dsmc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class EventActivity2 extends Activity {
    private TextView eventText;
    private TextView dateText;
    private TextView eventDescription;
    private ImageButton image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event2);
        image = (ImageButton) findViewById(R.id.imageButton);
        eventText = (TextView) findViewById(R.id.eventText);
        dateText = (TextView) findViewById(R.id.dateText);
        eventDescription = (TextView) findViewById(R.id.eventDescription);
        eventDescription = (TextView) findViewById(R.id.eventDescription);
        image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setData(CalendarContract.Events.CONTENT_URI);
                startActivity(calIntent);
            }
        });
    }

}
