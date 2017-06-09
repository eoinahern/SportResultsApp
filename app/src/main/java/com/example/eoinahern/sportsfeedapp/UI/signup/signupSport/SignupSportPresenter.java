package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;

import com.example.eoinahern.sportsfeedapp.UI.base.BasePresenter;
import com.example.eoinahern.sportsfeedapp.data.api.models.Sport;
import com.example.eoinahern.sportsfeedapp.injection.module.PerScreen;

import java.util.List;

import javax.inject.Inject;


@PerScreen
public class SignupSportPresenter extends BasePresenter<SignupSportView> {

	@Inject
	public SignupSportPresenter() {

	}


	public List<Sport> getSignupList() {
		return null;
	}
}
