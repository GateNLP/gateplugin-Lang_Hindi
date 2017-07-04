package hindi;

import gate.creole.metadata.CreoleResource;
import gate.creole.orthomatcher.OrthoMatcher;

@CreoleResource(isPrivate = true)
@Deprecated
public class HindiOrthoMatcher extends OrthoMatcher {

  // No idea why this class was created given it doesn't provide anything new,
  // so we'll stop using it and mark it as private

  private static final long serialVersionUID = 8120069980644391276L;
}