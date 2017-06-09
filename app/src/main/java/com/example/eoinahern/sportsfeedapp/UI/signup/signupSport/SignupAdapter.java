package com.example.eoinahern.sportsfeedapp.UI.signup.signupSport;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.eoinahern.sportsfeedapp.R;
import com.example.eoinahern.sportsfeedapp.data.api.models.Sport;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignupAdapter extends RecyclerView.Adapter<SignupAdapter.ViewHolder> {

	private List<Sport> sportList;

	public SignupAdapter() {
		sportList = new ArrayList<>();
	}

	@Override
	public SignupAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_sport_select, parent, false);
		return new ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(SignupAdapter.ViewHolder holder, int position) {

		Sport sportItem = sportList.get(position);
		holder.name.setText(sportItem.name());
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

	public List<Sport> getList() {
		return sportList;
	}

	public class ViewHolder extends RecyclerView.ViewHolder {

		@BindView(R.id.name) TextView name;
		@BindView(R.id.checkbox) CheckBox checkbox;

		public ViewHolder(View itemView) {
			super(itemView);
			ButterKnife.bind(this, itemView);
		}
	}
}
