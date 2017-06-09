package com.example.eoinahern.sportsfeedapp.UI.launcher;

import android.content.SharedPreferences;

import com.example.eoinahern.sportsfeedapp.UI.base.BasePresenter;
import com.example.eoinahern.sportsfeedapp.injection.module.PerScreen;

import javax.inject.Inject;


@PerScreen
public class LauncherActivityPresenter extends BasePresenter<LauncherActivityView> {

	private SharedPreferences sharedPrefs;
	public static final String SIGN_UP_KEY = "sign_up";

	@Inject
	public LauncherActivityPresenter(SharedPreferences sharedPrefs) {
		this.sharedPrefs = sharedPrefs;
	}

	public void goToNextScreen() {

		boolean signedup = sharedPrefs.getBoolean(SIGN_UP_KEY, false);

		if (signedup) {
			getView().NavigateToLiveScores();
			return;
		}

		getView().NavigateToSetup();
	}

}
