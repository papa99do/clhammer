/**
 * 
 */
package com.papa99do.toolkits.clhammer.helloworld;

import com.papa99do.toolkits.clhammer.CLContext;
import com.papa99do.toolkits.clhammer.CLState;

/**
 * @author papa99do
 *
 */
public class LoginState implements CLState {

	/* (non-Javadoc)
	 * @see com.papa99do.toolkits.clhammer.CLState#act(com.papa99do.toolkits.clhammer.CLContext)
	 */
	@Override
	public CLState act(CLContext context) {
		String name = System.console().readLine("Please login(input your name): ");
		((HelloWorldContext) context).setName(name);
		
		return context.getCLState(HelloState.class);
	}

}
