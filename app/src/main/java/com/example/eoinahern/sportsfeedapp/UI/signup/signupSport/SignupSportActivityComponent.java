package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;


import com.example.eoinahern.sportsfeedapp.injection.component.BaseActivityComponent;
import com.example.eoinahern.sportsfeedapp.injection.module.BaseActivityModule;
import com.example.eoinahern.sportsfeedapp.injection.module.PerScreen;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@PerScreen
@Subcomponent(modules = SignupSportActivityComponent.SignupSportActivityModule.class)
public interface SignupSportActivityComponent extends BaseActivityComponent<SignupSportActivity> {


	@Module
	class SignupSportActivityModule extends BaseActivityModule<SignupSportActivity> {

		public SignupSportActivityModule(SignupSportActivity activity) {
			super(activity);
		}


		@PerScreen
		@Provides
		public SignupAdapter getAdapter() {
			return new SignupAdapter();
		}
	}
}
