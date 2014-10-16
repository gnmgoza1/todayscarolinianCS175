package com.example.todays.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.todays.fragments.AboutFragment;
import com.example.todays.fragments.StaffFragment;

public class AboutAndStaffAdapter extends FragmentPagerAdapter {

	public AboutAndStaffAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new AboutFragment();
		case 1:
			// Games fragment activity
			return new StaffFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}