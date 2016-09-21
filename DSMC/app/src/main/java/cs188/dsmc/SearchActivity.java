package cs188.dsmc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SearchView;

public class SearchActivity extends Activity {
    private SearchView search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        search = (SearchView) findViewById(R.id.searchView);
    }
}
