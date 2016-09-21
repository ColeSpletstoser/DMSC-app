package cs188.dsmc;

import android.app.Activity;
import android.os.Bundle;
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
        // image = (ImageButton) findViewById(R.id.imageView);
        eventText = (TextView) findViewById(R.id.eventText);
        dateText = (TextView) findViewById(R.id.dateText);
        eventDescription = (TextView) findViewById(R.id.eventDescription);
    }
}
