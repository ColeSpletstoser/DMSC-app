package cs188.dsmc;

import android.app.Activity;
import android.app.ListActivity;
import android.app.usage.UsageEvents;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomePage extends Activity {
    private ListView list_one;
    private ListView list_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        list_one = (ListView) findViewById(R.id.leftListView);
        list_two = (ListView) findViewById(R.id.rightListView);

        String[] dates = {"Sat Sep 12\n7:00 PM", "Tue Sep 14\n5:00 PM"};
        String[] events = {"DMSC Presents: An evening with Fendika", "World food & Music Week: SONDORGO"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dates);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, events);

        list_one.setAdapter(adapter1);
        list_two.setAdapter(adapter2);
        list_two.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1) {
                    Intent intent = new Intent(HomePage.this, EventActivity.class);
                    startActivity(intent);
                }
                else if(position == 0){
                    Intent intent = new Intent(HomePage.this, EventActivity2.class);
                    startActivity(intent);
                }
            }
        });

    }
}
