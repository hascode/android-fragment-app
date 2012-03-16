package com.hascode.android.app;

import android.app.Activity;
import android.app.ListFragment;
import android.view.View;
import android.widget.ListView;

public class SelectionFragment extends ListFragment {
	private OnSelectListener onSelectListener;

	public interface OnSelectListener {
		public void onItemSelected(final int position);
	}

	@Override
	public void onAttach(final Activity activity) {
		super.onAttach(activity);
		onSelectListener = (OnSelectListener) activity;
	}

	@Override
	public void onListItemClick(final ListView l, final View v,
			final int position, final long id) {
		onSelectListener.onItemSelected(position);
	}

}
