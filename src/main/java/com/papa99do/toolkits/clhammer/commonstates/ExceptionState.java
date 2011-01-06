/**
 * 
 */
package com.papa99do.toolkits.clhammer.commonstates;

import com.papa99do.toolkits.clhammer.CLState;
import com.papa99do.toolkits.clhammer.CLContext;

/**
 * @author papa99do
 *
 */
public class ExceptionState implements CLState {

	Throwable e;
	
	public ExceptionState(Throwable e) {
		this.e = e;
	}
	
	@Override
	public CLState act(CLContext context) {
		e.printStackTrace();
		return context.getCLState(ExitState.class);
	}

}
