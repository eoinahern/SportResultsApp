package com.example.eoinahern.sportsfeedapp.UI.livescoreall;


import com.example.eoinahern.sportsfeedapp.injection.component.BaseActivityComponent;
import com.example.eoinahern.sportsfeedapp.injection.module.BaseActivityModule;
import com.example.eoinahern.sportsfeedapp.injection.module.PerScreen;

import dagger.Module;
import dagger.Subcomponent;

@PerScreen
@Subcomponent(modules = LiveScoreActivityComponent.LiveScoreAllActivityModule.class)
public interface LiveScoreActivityComponent extends BaseActivityComponent<LiveScoreAllActivity> {


	@Module
	class LiveScoreAllActivityModule extends BaseActivityModule<LiveScoreAllActivity> {

		public LiveScoreAllActivityModule(LiveScoreAllActivity activity) {
			super(activity);
		}
	}
}
