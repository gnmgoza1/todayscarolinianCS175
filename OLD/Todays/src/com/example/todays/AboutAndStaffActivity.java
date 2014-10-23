package com.example.todays;

import com.example.todays.adapter.AboutAndStaffAdapter;
import com.example.todays.fragments.StaffFragment;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

public class AboutAndStaffActivity extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private AboutAndStaffAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "About", "Staff" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_todays);

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		getActionBar().setDisplayShowHomeEnabled(false);
		getActionBar().setDisplayShowTitleEnabled(false);
		mAdapter = new AboutAndStaffAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	public void openFacebook(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		Uri data = Uri.parse("https://www.facebook.com/todayscarolinian");
		intent.setData(data);
		startActivity(intent);
	}
	
	public void openTwitter(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		Uri data = Uri.parse("https://www.twitter.com/todaysusc");
		intent.setData(data);
		startActivity(intent);
	}
	
	public void openAskFM(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		Uri data = Uri.parse("https://ask.fm/TodaysCarolinian");
		intent.setData(data);
		startActivity(intent);
	}
	

	public void eMailTodays(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		Uri data = Uri.parse("mailto:?subject=todayscarolinianusc@gmail.com"
				+ "&body=");
		intent.setData(data);
		startActivity(intent);
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}

}