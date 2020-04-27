import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;
    public WordPairList(String[] words){
        for(int i=0; i<words.length-1;i++){
            for(int x =i; x<words.length;x++){
                allPairs.add(new WordPair(words[i],words[x]));
            }
        }
    }
    public int numMatches(){
        int counter= 0;
        for(WordPair w : allPairs){
            if(w.getFirst().equals(w.getSecond())){
                counter++;
            }
        }
         return counter;
    }

}
