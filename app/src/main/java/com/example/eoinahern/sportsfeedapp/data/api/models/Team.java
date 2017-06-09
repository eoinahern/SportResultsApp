package com.example.eoinahern.sportsfeedapp.data.api.models;


import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Team {

	public abstract String name();

	public abstract String sport();

	public abstract String logo();
}
