package hindi;

import gate.creole.ResourceReference;
import gate.creole.Transducer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Hindi Main Grammar")
public class HindiTransducer extends Transducer {

  private static final long serialVersionUID = -617463162465998005L;

  @Override
  @CreoleParameter(defaultValue = "resources/grammar/main.jape")
  public void setGrammarURL(ResourceReference grammar) {
    super.setGrammarURL(grammar);
  }
}