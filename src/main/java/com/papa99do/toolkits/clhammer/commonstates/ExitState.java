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
public class ExitState implements CLState {

	/* (non-Javadoc)
	 * @see com.papa99do.toolkits.clhammer.CLState#act()
	 */
	@Override
	public CLState act(CLContext context) {
		System.exit(0);
		return null;
	}

}
