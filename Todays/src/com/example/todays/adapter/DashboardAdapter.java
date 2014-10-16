package com.example.todays.adapter;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.todays.R;

public class DashboardAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final ArrayList<News> news;

	public DashboardAdapter(Context context, ArrayList<News> news) {
		super(context, R.layout.fragment_main);
		this.context = context;
		this.news = news;

	}
	
	@SuppressLint("ViewHolder") @Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.fragment_main, parent, false);
		TextView articleDate = (TextView) rowView
				.findViewById(R.id.articleDate);
		TextView articleAuthor = (TextView) rowView
				.findViewById(R.id.articleAuthor);
		TextView articleTitle = (TextView) rowView
				.findViewById(R.id.articleTitle);
		ImageView articleImage = (ImageView) rowView
				.findViewById(R.id.articleImage);
		articleDate.setText(news.get(position).date);
		articleAuthor.setText(news.get(position).author);
		articleTitle.setText(news.get(position).title);

		articleImage.setImageResource(news.get(position).image);

		return rowView;
	}
	

	@Override
	public int getCount() {
		return news.size();
	}

}