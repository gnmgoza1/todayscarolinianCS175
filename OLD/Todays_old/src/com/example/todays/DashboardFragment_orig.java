package com.example.todays;

import java.util.ArrayList;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.todays.adapter.DashboardAdapter;
import com.example.todays.adapter.News;
import com.example.todays.fragments.ArticleFragment;

public class DashboardFragment_orig extends ListFragment {

	public DashboardFragment_orig() {
	}

	// public View onCreateView(LayoutInflater inflater, ViewGroup container,
	// Bundle savedInstanceState) {
	//
	// ArrayList<Item> items = Item.populateItems();
	// CustomAdapter adapter = new CustomAdapter(getActivity(), items);
	// View rootView = inflater.inflate(setListAdapter(adapter), container,
	// false);
	//
	// return rootView;
	// }

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ArrayList<News> items = News.populateItems();
		DashboardAdapter adapter = new DashboardAdapter(getActivity(), items);
		setListAdapter(adapter);
	}
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        Fragment fragment = new ArticleFragment();
        FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction()
				.replace(R.id.frame_container, fragment).commit();
    }
	
}
