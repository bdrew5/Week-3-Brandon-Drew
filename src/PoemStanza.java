import java.util.ArrayList;
import java.util.List;

public class PoemStanza {
    private List<PoemLine> stanzaLines;

    public PoemStanza(List<PoemLine> stanza){
        stanzaLines = stanza;
    }
    public List<PoemLine> convertToAlienStanza() {
        List<PoemLine> alienStanza = new ArrayList<PoemLine>(stanzaLines.size());
        String alienLine = "";
        for(int i = 0;i< stanzaLines.size(); i++){
            alienLine = stanzaLines.get(i).convertToAlienLine();
            alienStanza.add(0, new PoemLine(alienLine));
        }
        return alienStanza;
    }
}
