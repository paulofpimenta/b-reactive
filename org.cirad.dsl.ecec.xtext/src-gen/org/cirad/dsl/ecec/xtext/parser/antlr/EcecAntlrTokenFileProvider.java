/*
* generated by Xtext
*/
package org.cirad.dsl.ecec.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EcecAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/cirad/dsl/ecec/xtext/parser/antlr/internal/InternalEcec.tokens");
	}
}
