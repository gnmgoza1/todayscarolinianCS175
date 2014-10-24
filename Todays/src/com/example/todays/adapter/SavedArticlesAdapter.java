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
import com.example.todays.model.News;

public class SavedArticlesAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final ArrayList<News> news;

	public SavedArticlesAdapter(Context context, ArrayList<News> news) {
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
		ImageView saved = (ImageView) rowView.findViewById(R.id.saveIcon);
		articleDate.setText(news.get(position).date);
		articleAuthor.setText(news.get(position).author);
		articleTitle.setText(news.get(position).title);

		articleImage.setImageResource(news.get(position).image);
		saved.setImageResource(android.R.drawable.btn_star_big_on);

		return rowView;
	}
	

	@Override
	public int getCount() {
		return news.size();
	}

}