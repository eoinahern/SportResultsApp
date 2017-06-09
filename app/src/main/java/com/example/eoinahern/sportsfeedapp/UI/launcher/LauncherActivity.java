package com.example.eoinahern.sportsfeedapp.UI.launcher;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.eoinahern.sportsfeedapp.MyApplication;
import com.example.eoinahern.sportsfeedapp.R;
import com.example.eoinahern.sportsfeedapp.UI.livescoreall.LiveScoreAllActivity;
import com.example.eoinahern.sportsfeedapp.UI.signup.signupSport.SignupSportActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LauncherActivity extends AppCompatActivity implements LauncherActivityView {

	@Inject LauncherActivityPresenter presenter;
	@BindView(R.id.image) ImageView ball;
	private Handler handler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);

		inject();
		presenter.attachView(this);
		handler = new Handler();

		ButterKnife.bind(this);
		ButterKnife.setDebug(true);
		animateAndTransitionToNext();
		gotoNext();
	}

	private void inject() {
		MyApplication.get(this).getAppComponent().plus(new LauncherActivityComponent.LauncherActivityModule(this)).inject(this);
	}

	public void animateAndTransitionToNext() {
		Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotation);
		ball.startAnimation(anim);
	}

	public void gotoNext() {

		handler.postDelayed(new Runnable() {
			@Override public void run() {
				presenter.goToNextScreen();
			}
		}, 2000);
	}


	@Override
	public void NavigateToSetup() {
		startActivity(SignupSportActivity.getStartIntent(this));
	}

	@Override
	public void NavigateToLiveScores() {
		startActivity(LiveScoreAllActivity.getStartIntent(this));
	}
}
