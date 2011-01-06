/**
 * 
 */
package com.papa99do.toolkits.clhammer;

/**
 * The context can be the factory and cache for CLStates. It can also be a
 * container to put anything you want to share between states.
 * 
 * @author papa99do
 * 
 */
public interface CLContext {

	/**
	 * Get the entry state for the specific task.
	 * 
	 * @return
	 */
	CLState getEntryState();

	/**
	 * Create the CLState instance with the actual class.
	 * 
	 * @param stateClass
	 * @return
	 */
	CLState getCLState(Class<? extends CLState> stateClass);

}
