package hindi;

import gate.creole.ResourceReference;
import gate.creole.gazetteer.DefaultGazetteer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Hindi Gazetteer", comment = "A list lookup component.")
public class HindiGazetteer extends DefaultGazetteer {

  private static final long serialVersionUID = 7137065617752693885L;

  @Override
  @CreoleParameter(defaultValue = "resources/gazetteer/lists.def")
  public void setListsURL(ResourceReference lists) {
    super.setListsURL(lists);
  }
}