package com.example.eoinahern.sportsfeedapp.injection.component;

import com.example.eoinahern.sportsfeedapp.UI.launcher.LauncherActivityComponent;
import com.example.eoinahern.sportsfeedapp.UI.livescoreall.LiveScoreActivityComponent;
import com.example.eoinahern.sportsfeedapp.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

	LiveScoreActivityComponent plus(LiveScoreActivityComponent.LiveScoreAllActivityModule module);

	LauncherActivityComponent plus(LauncherActivityComponent.LauncherActivityModule module);
}
