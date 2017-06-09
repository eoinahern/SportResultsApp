package com.example.eoinahern.sportsfeedapp.UI.launcher;


import com.example.eoinahern.sportsfeedapp.injection.component.BaseActivityComponent;
import com.example.eoinahern.sportsfeedapp.injection.module.BaseActivityModule;
import com.example.eoinahern.sportsfeedapp.injection.module.PerScreen;

import dagger.Module;
import dagger.Subcomponent;


@PerScreen
@Subcomponent( modules = LauncherActivityComponent.LauncherActivityModule.class)
public interface LauncherActivityComponent extends BaseActivityComponent<LauncherActivity> {

	@Module
	class LauncherActivityModule extends BaseActivityModule<LauncherActivity> {

		public LauncherActivityModule(LauncherActivity activity) {
			super(activity);
		}
	}
}
