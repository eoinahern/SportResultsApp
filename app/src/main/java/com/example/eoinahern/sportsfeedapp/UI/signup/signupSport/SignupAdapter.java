package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.eoinahern.sportsfeedapp.data.api.models.Sport;

import java.util.ArrayList;
import java.util.List;

public class SignupAdapter extends RecyclerView.Adapter<SignupAdapter.ViewHolder> {


	private List<Sport> sportList;

	public SignupAdapter() {
		sportList = new ArrayList<>();
	}

	@Override
	public SignupAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return null;
	}

	@Override
	public void onBindViewHolder(SignupAdapter.ViewHolder holder, int position) {

	}

	@Override
	public int getItemCount() {
		return sportList.size();
	}

	public void setList(List<Sport> sportList) {

		if(!sportList.isEmpty()) {
			sportList.clear();
		}

		sportList.addAll(sportList);
		notifyDataSetChanged();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {

		public ViewHolder(View itemView) {
			super(itemView);
		}
	}
}
