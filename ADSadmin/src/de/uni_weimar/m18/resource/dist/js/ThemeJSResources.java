package de.uni_weimar.m18.resource.dist.js;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ThemeJSResources extends ClientBundle {
	public static final ThemeJSResources INSTANCE = GWT.create(ThemeJSResources.class);
	@Source("app.js")
	TextResource appJs();

}
