package com.example.todays;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar bar = getActionBar();
		bar.hide();
		setContentView(R.layout.activity_signup);
	}

//	public void signUp(View view) {
//
//		TextView signup = (TextView) findViewById(R.id.signUp1);
//		TextView signuptext = (TextView) findViewById(R.id.signUp2);
//		signup.setText("Sign Up");
//		signuptext.setText("A password will be e-mailed to you");
//	}

	public void skip(View view) {
		Intent dashboard = new Intent(this, MainActivity.class);
		startActivity(dashboard);
	}
}
