package com.example.todays;
 
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
 
public class SearchActivity extends Activity {
 
    private TextView txtQuery;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        txtQuery = (TextView) findViewById(R.id.txtQuery);
        handleIntent(getIntent());
    }
 
    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search, menu);
 
        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
      
        int searchSrcTextId = getResources().getIdentifier("android:id/search_src_text", null, null);  
        EditText searchEditText = (EditText) searchView.findViewById(searchSrcTextId);  
        searchEditText.setTextColor(Color.WHITE);  
        searchEditText.setHintTextColor(Color.LTGRAY);  
        
        
        searchView.setIconifiedByDefault(false);
        searchView.requestFocus();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
 
        return super.onCreateOptionsMenu(menu);
    }
    
    /**
     * Handling intent data
     */
    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
 
            /**
             * Use this query to display search results like 
             * 1. Getting the data from SQLite and showing in listview 
             * 2. Making webrequest and displaying the data 
             * For now we just display the query only
             */
            txtQuery.setText("Search Query: " + query);
            txtQuery.setText("NO RESULTS FOUND");
 
        }
 
    }
}