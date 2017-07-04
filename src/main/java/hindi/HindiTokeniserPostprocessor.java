package hindi;

import gate.creole.ResourceReference;
import gate.creole.Transducer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Hindi Tokeniser Postprocessor")
public class HindiTokeniserPostprocessor extends Transducer {

  private static final long serialVersionUID = -2184382767129770444L;

  @Override
  @CreoleParameter(defaultValue = "resources/tokeniser/join.jape")
  public void setGrammarURL(ResourceReference grammar) {
    super.setGrammarURL(grammar);
  }
}