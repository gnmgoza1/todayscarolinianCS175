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

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todays.R;

public class StaffFragment extends Fragment {
	public StaffFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_staff, container,
				false);

		return rootView;
	}
}
