package com.papa99do.toolkits.clhammer;

/**
 * CLHammer helps me to do some fast work with command line. It uses state
 * pattern to implement the interactions between the user and the console, which
 * makes it quite flexible to add new functionalities.
 * 
 * @author papa99do
 * 
 */
public class CLHammer {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String factoryClassName = args[0];
		CLContext context = (CLContext) Class.forName(factoryClassName).newInstance();
		
		CLState state = context.getEntryState();
		while(true) {
			state = state.act(context);
		}

	}

}
