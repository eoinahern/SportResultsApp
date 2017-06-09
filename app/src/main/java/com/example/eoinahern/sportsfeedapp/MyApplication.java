package com.example.eoinahern.sportsfeedapp;


import android.app.Application;
import android.content.Context;

import com.example.eoinahern.sportsfeedapp.injection.component.ApplicationComponent;
import com.example.eoinahern.sportsfeedapp.injection.component.DaggerApplicationComponent;
import com.example.eoinahern.sportsfeedapp.injection.module.ApplicationModule;

public class MyApplication extends Application {

	private ApplicationComponent appComponent;


	@Override
	public void onCreate() {
		super.onCreate();
		appComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
	}

	public ApplicationComponent getAppComponent() {
		return appComponent;
	}

	public static MyApplication get(Context context) {
		return (MyApplication) context.getApplicationContext();
	}
}
