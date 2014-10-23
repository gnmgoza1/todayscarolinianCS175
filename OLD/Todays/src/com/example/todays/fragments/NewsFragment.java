package com.example.todays.fragments;

import java.util.ArrayList;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.todays.ArticleActivity;
import com.example.todays.R;
import com.example.todays.adapter.DashboardAdapter;
import com.example.todays.adapter.News;

public class NewsFragment extends ListFragment {

	View headerView = null;

	public NewsFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		headerView = inflater.inflate(R.layout.header_layout, null);
		headerView = inflater.inflate(R.layout.header_layout, null);
		ImageView imago = (ImageView) headerView.findViewById(R.id.layoutImage);
		imago.setImageResource(R.drawable.news);
		return super.onCreateView(inflater, container, savedInstanceState);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	
		ArrayList<News> items = News.populateItems();
		DashboardAdapter adapter = new DashboardAdapter(getActivity(), items);
		if (headerView != null)
			this.getListView().addHeaderView(headerView);

		setListAdapter(adapter);
		super.onActivityCreated(savedInstanceState);
	}


	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);

		Intent articleintent = new Intent(getActivity(), ArticleActivity.class);
		startActivity(articleintent);
	}

}
