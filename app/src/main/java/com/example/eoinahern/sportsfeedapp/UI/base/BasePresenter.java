package com.example.eoinahern.sportsfeedapp.UI.base;


public class BasePresenter<T extends MvpView> {

	T view;

	public BasePresenter() {
	}

	public void attachView(T view) {
		this.view = view;
	}

	public T getView() {
		return view;
	}

	public void detachView() {
		view = null;
	}

	public boolean isViewAttached() {
		return view != null;
	}
}
