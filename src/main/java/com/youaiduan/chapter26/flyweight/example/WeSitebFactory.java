package com.youaiduan.chapter26.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class WeSitebFactory {
	private Map<String, WebSite> webSites = new HashMap<>();
	
	
	
	public WeSitebFactory() {
		super();
	}

	public WebSite getWebSite(String key) {
		if(webSites.get(key) == null) {
			synchronized (webSites) {
				if(webSites.get(key) == null) {
					webSites.put(key, new ConcreteWebSite(key));
				}
			}
		}
		return webSites.get(key);
	}
	
	public int getWebSiteCount() {
		synchronized (webSites) {
			return webSites.size();
		}
	}
	
}
