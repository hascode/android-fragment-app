package com.hascode.android.app;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

public class FragmentApplication extends Application {
	private final List<Article> links = new ArrayList<Article>();
	{
		links.add(new Article(
				"Selenium WebDriver, Selenium Server and PageObjects by Example",
				"http://www.hascode.com/2012/03/selenium-webdriver-selenium-server-and-pageobjects-by-example/"));
		links.add(new Article("Ordering your JUnit Rules using a RuleChain",
				"http://www.hascode.com/2012/02/ordering-your-junit-rules-using-a-rulechain/"));
		links.add(new Article(
				"JPA Persistence and Lucene Indexing combined in Hibernate Search",
				"http://www.hascode.com/2012/02/jpa-persistence-and-lucene-indexing-combined-in-hibernate-search/"));
		links.add(new Article(
				"Neo4j Graph Database Tutorial: How to build a Route Planner and other Examples",
				"http://www.hascode.com/2012/01/neo4j-graph-database-tutorial-how-to-build-a-route-planner-and-other-examples/"));
		links.add(new Article(
				"Create Mobile Websites using Java Server Faces and PrimeFaces Mobile",
				"http://www.hascode.com/2012/01/create-mobile-websites-using-java-server-faces-and-primefaces-mobile/"));
		links.add(new Article("Writing Styles and Themes on Android",
				"http://www.hascode.com/2011/12/writing-styles-and-themes-on-android/"));
		links.add(new Article(
				"Managing Background Tasks on Android using the Alarm Manager",
				"http://www.hascode.com/2011/11/managing-background-tasks-on-android-using-the-alarm-manager/"));
		links.add(new Article(
				"Finding Memory Leaks using Eclipse and the MemoryAnalyzer Plugin",
				"http://www.hascode.com/2011/11/finding-memory-leaks-using-eclipse-and-the-memoryanalyzer-plugin/"));
		links.add(new Article(
				"Testing RESTful Web Services made easy using the REST-assured Framework",
				"http://www.hascode.com/2011/10/testing-restful-web-services-made-easy-using-the-rest-assured-framework/"));
		links.add(new Article(
				"Maven Tomcat Plugin: Adding Authentication to an Embedded Tomcat",
				"http://www.hascode.com/2011/10/maven-tomcat-plugin-adding-authentication-to-an-embedded-tomcat/"));
	}

	public List<Article> getLinks() {
		return links;
	}

}
