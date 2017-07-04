package hindi;

import gate.creole.PackagedController;
import gate.creole.metadata.AutoInstance;
import gate.creole.metadata.AutoInstanceParam;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Hindi IE System", comment = "Ready-made Hindi IE application", autoinstances = @AutoInstance(parameters = {
    @AutoInstanceParam(name = "pipelineURL", value = "resources/hindi.gapp"),
    @AutoInstanceParam(name = "menu", value = "Hindi")}))
public class HindiIE extends PackagedController {
  private static final long serialVersionUID = 4754394751421742169L;
}