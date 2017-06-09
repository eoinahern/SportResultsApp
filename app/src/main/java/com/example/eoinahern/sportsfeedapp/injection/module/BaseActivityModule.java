package com.example.eoinahern.sportsfeedapp.injection.module;


import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BaseActivityModule<T extends AppCompatActivity> {

	T activity;

	public BaseActivityModule(T activity) {
		this.activity  = activity;
	}

	@Provides
	@PerScreen
	public T activityT() {
		return activity;
	}
}
