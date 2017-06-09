package com.example.eoinahern.sportsfeedapp.UI.livescoreall;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.eoinahern.sportsfeedapp.MyApplication;
import com.example.eoinahern.sportsfeedapp.R;

import javax.inject.Inject;


/**
 * show live score for all
 * current matches kind of like an overview screen
 * maybe include tabs for individual sport.
 */

public class LiveScoreAllActivity extends AppCompatActivity {

	@Inject SharedPreferences sharedPrefs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_live_score_all);
		inject();
	}

	private void inject() {
		MyApplication.get(this).getAppComponent().plus(new LiveScoreActivityComponent.LiveScoreAllActivityModule(this)).inject(this);
	}

	public static Intent getStartIntent(Context context) {
		return new Intent(context, LiveScoreAllActivity.class);
	}
}
