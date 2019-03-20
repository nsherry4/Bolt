package net.sciencestudio.bolt.scripting.plugin;

import java.net.URL;

import net.sciencestudio.bolt.plugin.core.BoltPluginSet;
import net.sciencestudio.bolt.plugin.core.IBoltPluginSet;
import net.sciencestudio.bolt.plugin.core.container.BoltURLContainer;

public class BoltScriptContainer<T extends BoltScriptPlugin> extends BoltURLContainer<T> {

	private BoltPluginSet<T> plugins;
	
	public BoltScriptContainer(URL url, Class<T> runner) {
		super(url);
		
		plugins = new IBoltPluginSet<>();
		IBoltScriptPluginPrototype<T> plugin = new IBoltScriptPluginPrototype<T>(this, runner);
		plugins.addPlugin(plugin);
	}
	
	@Override
	public BoltPluginSet<T> getPlugins() {
		return plugins;
	}

}
