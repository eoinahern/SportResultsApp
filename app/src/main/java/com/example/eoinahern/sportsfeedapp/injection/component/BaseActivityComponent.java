package com.example.eoinahern.sportsfeedapp.injection.component;

import android.support.v7.app.AppCompatActivity;

public interface BaseActivityComponent<T extends AppCompatActivity> {

	void inject(T activity);
}
