/*
* generated by Xtext
*/
package org.cirad.dsl.ecec.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EcecStandaloneSetup extends EcecStandaloneSetupGenerated{

	public static void doSetup() {
		new EcecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

