package com.example.todays;

import android.app.Activity;
import android.os.Bundle;

public class ArticleActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setTitle("TODAY'S CAROLINIAN");
		getActionBar().setSubtitle("Our commitment. Your paper.");
		setContentView(R.layout.fragment_article);

	}

}
