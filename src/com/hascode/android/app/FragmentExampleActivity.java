package com.hascode.android.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class FragmentExampleActivity extends Activity implements
		SelectionFragment.OnSelectListener {
	private FragmentApplication app;

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		app = (FragmentApplication) getApplication();
		SelectionFragment selectionFragment = (SelectionFragment) getFragmentManager()
				.findFragmentById(R.id.selection_fragment);

		selectionFragment.setListAdapter(new ArrayAdapter<Article>(this,
				R.layout.list_item, app.getLinks()));
	}

	@Override
	public void onItemSelected(final int position) {
		final Article article = app.getLinks().get(position);
		NewsFragment newsFragment = (NewsFragment) getFragmentManager()
				.findFragmentById(R.id.news_fragment);
		if (newsFragment == null) {
			Intent intent = new Intent(this, NewsFragment.class);
			intent.putExtra("url", article.getUrl());
			startActivity(intent);
		} else {
			newsFragment.updateContent(article.getUrl());
		}

	}
}