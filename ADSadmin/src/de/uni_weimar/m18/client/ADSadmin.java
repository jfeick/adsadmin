package de.uni_weimar.m18.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.user.client.ui.RootPanel;

import de.uni_weimar.m18.resource.dist.js.ThemeJSResources;

public class ADSadmin implements EntryPoint {

	private LittleForm form = new LittleForm();
	
	public void onModuleLoad() {
		ScriptInjector.fromString(ThemeJSResources.INSTANCE.appJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		//ScriptInjector.fromString(CUSTOM_THEME_JS_RESOURCE.getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		//ScriptInjector.fromString()
		RootPanel.get().add(form);
	}
}
