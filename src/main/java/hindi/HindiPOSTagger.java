package hindi;

import gate.creole.POSTagger;
import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Hindi POS Tagger")
public class HindiPOSTagger extends POSTagger {

  private static final long serialVersionUID = -8269321728400574645L;

  @Override
  @CreoleParameter(defaultValue = "resources/tagger/hindi_lexicon")
  public void setLexiconURL(ResourceReference lexicon) {
    super.setLexiconURL(lexicon);
  }

  @Override
  @CreoleParameter(defaultValue = "resources/tagger/ruleset")
  public void setRulesURL(ResourceReference rules) {
    super.setRulesURL(rules);
  }

  @Override
  @CreoleParameter(defaultValue = "#")
  public void setLexiconSeparator(String separator) {
    super.setLexiconSeparator(separator);
  }
  
  @Override
  @CreoleParameter(defaultValue = "UTF-8")
  public void setEncoding(String encoding) {
    super.setEncoding(encoding);
  }
}
