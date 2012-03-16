package com.hascode.android.app;

public class Article {
	private final String title;
	private final String url;

	public Article(final String title, final String url) {
		super();
		this.title = title;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return title;
	}

}
