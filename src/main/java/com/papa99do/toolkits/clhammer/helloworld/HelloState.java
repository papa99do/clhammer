/**
 * 
 */
package com.papa99do.toolkits.clhammer.helloworld;

import com.papa99do.toolkits.clhammer.CLState;
import com.papa99do.toolkits.clhammer.CLContext;
import com.papa99do.toolkits.clhammer.commonstates.ExitState;

/**
 * @author papa99do
 * 
 */
public class HelloState implements CLState {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.papa99do.toolkits.clhammer.CLState#act()
	 */
	@Override
	public CLState act(CLContext context) {
		
		String choice = System.console().readLine("Please choose: 1) Say hello!  2) Say bye! 3) Log out\n");
		
		if ("3".equals(choice)) {
			System.console().printf("Logging out... \n");
			return context.getCLState(LoginState.class);
		}
		
		if ("2".equals(choice)) {
			System.console().printf("Bye, %s!\n", ((HelloWorldContext) context).getName());
			return context.getCLState(ExitState.class);
		} 
		
		if ("1".equals(choice)) {
			System.console().printf("Hello, %s!\n", ((HelloWorldContext) context).getName());
		}
		
		return context.getCLState(HelloState.class);

	}

}
