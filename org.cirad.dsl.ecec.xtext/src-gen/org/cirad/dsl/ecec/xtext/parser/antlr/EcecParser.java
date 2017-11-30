/*
* generated by Xtext
*/
package org.cirad.dsl.ecec.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.cirad.dsl.ecec.xtext.services.EcecGrammarAccess;

public class EcecParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EcecGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.cirad.dsl.ecec.xtext.parser.antlr.internal.InternalEcecParser createParser(XtextTokenStream stream) {
		return new org.cirad.dsl.ecec.xtext.parser.antlr.internal.InternalEcecParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public EcecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EcecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
