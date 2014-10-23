//
//package com.example.todays.fragments;
//
//import android.app.Fragment;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.todays.R;
//
//public class AboutFragment extends Fragment {
//	
//	public AboutFragment(){}
//	
//	
//	@Override
//	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
//            Bundle savedInstanceState) {
// 
//        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
////       TextView tv= tv.setMovementMethod(new ScrollingMovementMethod()); 
//
//        return rootView;
//    }
//	
//	public void test(View view){
//		
//	}
//	
//}
package com.example.todays.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.example.todays.R;
import com.example.todays.adapter.StaffAdapter;

public class StaffFragment extends Fragment {
	public StaffFragment() {
	}

	/*
	 * @Override public View onCreateView(LayoutInflater inflater, ViewGroup
	 * container, Bundle savedInstanceState) {
	 * 
	 * View rootView = inflater.inflate(R.layout.fragment_staff, container,
	 * false);
	 * 
	 * return rootView; }
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.fragment_staff, container, false);

		ListView lv = (ListView) v.findViewById(R.id.frame_container);
		final String[] pos = new String[] { "Editor-in-Chief",
				"Associate Editor for Internal Affairs",
				"Associate Editor for External Affairs", "Managing Editor",
				"News Editor for Downtown and South Campus",
				"News Editor for Technological Center",
				"Features Editor (English)",
				"Features Editor (Filipino/Bisaya)", "Literary Editor",
				"Director for Circulation and Strategic Direction",
				"Technical Adviser" };
		String[] name = new String[] { "Kathleen Alexandra Belleza",
				"Karl Sayson", "Miko Paolo Mangubat", "John Matthew Flores",
				"Athena Grace Orque", "Wayne Tandingan",
				"Cesar Carlos Heyrosa", "Ed Samuel Almarez Bacaltos",
				"Raynielle Beatrix Lacson","John Doe", "Daryl Mendoza, MA" };

		final StaffAdapter adap = new StaffAdapter(getActivity(), pos, name);
		lv.setAdapter(adap);

		return v;
	}

}
