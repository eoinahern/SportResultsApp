package com.example.eoinahern.sportsfeedapp.data.api.models;


import android.os.Parcelable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Sport implements Parcelable {

	public abstract String name();

	public abstract boolean active();

	public static Sport create(String name, boolean active) {
		return new AutoValue_Sport(name, active);
	}

}
