/**
 * 
 */
package com.papa99do.toolkits.clhammer;

/**
 * A CLState represents the current state of the console, any action triggers
 * a change of the state.
 * 
 * @author papa99do
 * 
 */
public interface CLState {

	/**
	 * An action makes it change to annother state. This action is atomic, it
	 * can be an simple interaction between the user and the console, or a
	 * specific piece of task.
	 * 
	 * @return A state that it changes to
	 */
	CLState act(CLContext context);

}
