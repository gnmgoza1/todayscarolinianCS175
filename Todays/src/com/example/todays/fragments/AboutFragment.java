
package com.example.todays.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todays.R;

public class AboutFragment extends Fragment {
	
	public AboutFragment(){}
	
	
	@Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
//       TextView tv= tv.setMovementMethod(new ScrollingMovementMethod()); 

        return rootView;
    }
	
	public void test(View view){
		
	}
	
}