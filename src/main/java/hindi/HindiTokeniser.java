package hindi;

import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;
import gate.creole.tokeniser.DefaultTokeniser;

@CreoleResource(name = "Hindi Tokeniser", comment = "A customisable Hindi tokeniser.")
public class HindiTokeniser extends DefaultTokeniser {

  private static final long serialVersionUID = -1883387850699820809L;

  @Override
  @CreoleParameter(defaultValue = "resources/tokeniser/multiTokeniser.rules")
  public void setTokeniserRulesURL(ResourceReference rules) {
    super.setTokeniserRulesURL(rules);
  }

  @Override
  @CreoleParameter(defaultValue = "resources/tokeniser/postprocess.jape")
  public void setTransducerGrammarURL(ResourceReference grammar) {
    super.setTransducerGrammarURL(grammar);
  }
}