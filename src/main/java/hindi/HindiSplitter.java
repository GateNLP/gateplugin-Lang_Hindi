package hindi;

import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;
import gate.creole.splitter.SentenceSplitter;

@CreoleResource(name = "Hindi Splitter", comment = "A Sentence Splitter.")
public class HindiSplitter extends SentenceSplitter {

  private static final long serialVersionUID = -921305757426248619L;

  @Override
  @CreoleParameter(defaultValue = "resources/splitter/grammar/main.jape")
  public void setTransducerURL(ResourceReference transducer) {
    super.setTransducerURL(transducer);
  }

  @Override
  @CreoleParameter(defaultValue = "resources/splitter/gazetteer/lists.def")
  public void setGazetteerListsURL(ResourceReference lists) {
    super.setGazetteerListsURL(lists);
  }
}