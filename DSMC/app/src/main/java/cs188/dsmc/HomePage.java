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

        String[] dates = {"Thur Sep 22\n7:00 PM", "Thur Sep 22\n7:30 PM","Fri Sep 23\n5:00 PM", "Sun Sep 24\n3:00 PM"};
        String[] events = {"DANG GOOD SONGWRITERS WORKSHOP","Chiffon","World food & Music Week: SONDORGO","Nola Jazz Band and Grand Avenue Ruckus"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dates);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, events);

        list_one.setAdapter(adapter1);
        list_two.setAdapter(adapter2);
        list_two.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(HomePage.this, EventActivity2.class);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(HomePage.this, EventActivity3.class);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(HomePage.this, EventActivity.class);
                    startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(HomePage.this, EventActivity4.class);
                    startActivity(intent);
                }
            }
        });

    }
}
