package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;

import android.content.SharedPreferences;

import com.example.eoinahern.sportsfeedapp.UI.base.BasePresenter;
import com.example.eoinahern.sportsfeedapp.data.api.models.Sport;
import com.example.eoinahern.sportsfeedapp.injection.module.PerScreen;

import java.util.List;

import javax.inject.Inject;


@PerScreen
public class SignupSportPresenter extends BasePresenter<SignupSportView> {

	private SharedPreferences sharedPrefs;

	@Inject
	public SignupSportPresenter(SharedPreferences sharedPrefs) {
		this.sharedPrefs = sharedPrefs;
	}

	public List<Sport> getSignupList() {
		return null;
	}


	public void saveSignupList(List<Sport> sportList) {

	}
}
