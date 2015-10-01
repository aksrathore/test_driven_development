package main.java.abhinav.tdd.practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * Develop a class that decomposes a given URL into its constituents. 
 * Like in URL https://www.google.co.in/test/url, we would like to get the result
 * 		The protocol: http
 * 		The domain name: www.google.se
 * 		The path: test/url (otherwise an empty string if none)
 */
public class URLSplitter {
	
	private final String URL_SPLITER_REGEX = "(.*//)(.*?[^/])(/)(.*)";
	private String protocol;
	private String domain;
	private String path;
	
	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void urlSpliter(String url){
		Pattern p = Pattern.compile(URL_SPLITER_REGEX);
		Matcher m = p.matcher(url);
		if(m.find())
		{
			setProtocol(m.group(1));
			setDomain(m.group(2));
			setPath(m.group(4));
		}
	}
	
	public void display(){
		System.out.println("The protocol: "+getProtocol());
		System.out.println("The domain name: "+getDomain());
		System.out.println("The path: "+getPath());
	}

}
