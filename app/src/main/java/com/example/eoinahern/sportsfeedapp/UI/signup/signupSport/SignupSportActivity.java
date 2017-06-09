package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.eoinahern.sportsfeedapp.MyApplication;
import com.example.eoinahern.sportsfeedapp.R;
import com.example.eoinahern.sportsfeedapp.UI.signup.signupTeams.SignupTeamsActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignupSportActivity extends AppCompatActivity implements SignupSportView {

	@BindView(R.id.recycler) RecyclerView recycler;
	@BindView(R.id.next) RelativeLayout next;

	@Inject SignupSportPresenter presenter;
	@Inject SignupAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup_sport);
		ButterKnife.bind(this);
		presenter.attachView(this);
		inject();

		setupRecycler();
	}

	private void inject() {
		MyApplication.get(this).getAppComponent().plus(new SignupSportActivityComponent.SignupSportActivityModule(this)).inject(this);
	}

	private void setupRecycler() {
	}

	@OnClick(R.id.next)
	public void goToNext() {
		startActivity(SignupTeamsActivity.getStartIntent(this));
	}

	public static Intent getStartIntent(Context context) {
		return  new Intent(context, SignupSportActivity.class);
	}

	@Override
	public void onPause(){
		super.onPause();
		presenter.saveSignupList(adapter.getList());
	}
}
