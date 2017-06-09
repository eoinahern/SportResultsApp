package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.eoinahern.sportsfeedapp.MyApplication;
import com.example.eoinahern.sportsfeedapp.R;
import com.example.eoinahern.sportsfeedapp.UI.signup.signupTeams.SignupTeamsActivity;
import com.example.eoinahern.sportsfeedapp.data.api.models.Sport;

import java.util.ArrayList;
import java.util.List;

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


		List<Sport> sportList  = new ArrayList<>();

		sportList.add(Sport.create("football", false));
		sportList.add(Sport.create("Basketball", false));
		sportList.add(Sport.create("Hurling", false));
		sportList.add(Sport.create("MMA", false));
		sportList.add(Sport.create("Boxing", false));
		sportList.add(Sport.create("NHL", false));
		sportList.add(Sport.create("Curling", false));
		sportList.add(Sport.create("Angling", false));

		adapter.setList(sportList);

		recycler.setLayoutManager(new LinearLayoutManager(this));
		recycler.setAdapter(adapter);
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
