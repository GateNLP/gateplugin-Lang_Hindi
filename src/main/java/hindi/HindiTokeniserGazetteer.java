package hindi;

import gate.creole.ResourceReference;
import gate.creole.gazetteer.DefaultGazetteer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Hindi Tokeniser Gazetteer", comment = "A list lookup component.")
public class HindiTokeniserGazetteer extends DefaultGazetteer {

  private static final long serialVersionUID = -8248832038325991006L;

  @Override
  @CreoleParameter(defaultValue = "resources/tokeniser/lists.def")
  public void setListsURL(ResourceReference lists) {
    super.setListsURL(lists);
  }
  
  @Override
  @CreoleParameter(defaultValue="\t")
  public void setGazetteerFeatureSeparator(String separator) {
    super.setGazetteerFeatureSeparator(separator);
  }
}