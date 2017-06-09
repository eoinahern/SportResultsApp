package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.eoinahern.sportsfeedapp.R;

import javax.inject.Inject;

import butterknife.BindView;

public class SignupSportActivity extends AppCompatActivity implements SignupSportView {

	@BindView(R.id.recycler) RecyclerView recycler;
	@Inject SignupSportPresenter presenter;
	@Inject SignupAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup_sport);
		inject();

		setupRecycler();
	}

	private void inject() {

	}

	private void setupRecycler() {

	}

	public static Intent getStartIntent(Context context) {
		return  new Intent(context, SignupSportActivity.class);
	}
}
