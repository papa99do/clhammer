/**
 * 
 */
package com.papa99do.toolkits.clhammer.helloworld;

import java.util.HashMap;
import java.util.Map;

import com.papa99do.toolkits.clhammer.CLState;
import com.papa99do.toolkits.clhammer.CLContext;
import com.papa99do.toolkits.clhammer.commonstates.ExceptionState;

/**
 * @author papa99do
 *
 */
public class HelloWorldContext implements CLContext {
	
	private Map<Class<? extends CLState>, CLState> stateCache;
	
	public HelloWorldContext() {
		stateCache = new HashMap<Class<? extends CLState>, CLState>();
	}

	/* (non-Javadoc)
	 * @see com.papa99do.toolkits.clhammer.CLStateFactory#createCLState(java.lang.Class)
	 */
	@Override
	public CLState getCLState(Class<? extends CLState> stateClass) {
		try {
			if (!stateCache.containsKey(stateClass)) {
				stateCache.put(stateClass, stateClass.newInstance());
			}
			return stateCache.get(stateClass);
		} catch (Exception e) {
			return new ExceptionState(e);
		}
		
	}

	@Override
	public CLState getEntryState() {
		return getCLState(LoginState.class);
	}
	

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
