package com.hascode.android.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class NewsFragment extends Fragment {
	public void updateContent(final String url) {
		WebView webView = (WebView) getActivity().findViewById(R.id.webView);
		// my blog is using javascript
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);
		webView.loadUrl(url);
	}

	@Override
	public View onCreateView(final LayoutInflater inflater,
			final ViewGroup container, final Bundle savedInstanceState) {
		return inflater.inflate(R.layout.news_fragment, container, false);
	}
}
