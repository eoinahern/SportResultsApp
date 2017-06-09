package com.example.eoinahern.sportsfeedapp.injection.module;


import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

	private Application app;

	public ApplicationModule(Application app) {
		this.app = app;
	}

	@Provides
	@Singleton
	Application providesApplication() {
		return app;
	}

	@Provides
	@Singleton Gson getGson() {
		return new Gson();
	}

	@Provides
	@Singleton SharedPreferences getSharedPrefs() {
		return PreferenceManager.getDefaultSharedPreferences(app);
	}

}
