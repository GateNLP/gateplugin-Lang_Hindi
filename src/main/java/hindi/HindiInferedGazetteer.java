package hindi;

import gate.creole.ResourceReference;
import gate.creole.gazetteer.DefaultGazetteer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Hindi Inferred Gazetteer")
public class HindiInferedGazetteer extends DefaultGazetteer {

  private static final long serialVersionUID = 3491735773408407297L;

  @Override
  @CreoleParameter(defaultValue = "resources/inferred-gazetteer/inferred-lists.def")
  public void setListsURL(ResourceReference lists) {
    super.setListsURL(lists);
  }
}