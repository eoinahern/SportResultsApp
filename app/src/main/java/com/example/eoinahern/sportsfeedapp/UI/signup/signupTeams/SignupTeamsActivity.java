package com.example.eoinahern.sportsfeedapp.UI.signup.signupTeams;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.eoinahern.sportsfeedapp.R;

public class SignupTeamsActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup_teams);
	}

	public static Intent getStartIntent(Context context) {
		return new Intent(context, SignupTeamsActivity.class);
	}
}
