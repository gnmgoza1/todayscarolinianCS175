package com.example.todays.adapter;

import com.example.todays.R;
import com.example.todays.R.id;
import com.example.todays.R.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class StaffAdapter extends ArrayAdapter<String> {
	private final String[] pos;
	private final String[] name;
	private final Context context;

	public StaffAdapter(Context context, String[] pos, String[] name){
		super(context,R.layout.fragment_staff_item
				,pos);
		this.pos = pos;
		this.name = name;
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.fragment_staff_item, parent, false);
		TextView pos1 = (TextView) rowView.findViewById(R.id.staffPosition);
		TextView name1 = (TextView) rowView.findViewById(R.id.staffName);
		pos1.setText(pos[position]);
		name1.setText(name[position]);
		 
		return rowView;
	}
}
