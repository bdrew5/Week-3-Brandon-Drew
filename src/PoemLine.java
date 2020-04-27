public class PoemLine {
    private String englishLine;

    public  PoemLine(String line){
        englishLine=line;
    }
    public String getEnglishLine(){
        return englishLine;
    }
    public String convertToAlienLine(){
        String alienString = "";
        String sub;
        int counter = 0;
        for(int i = 0; i< englishLine.length(); i++){
            counter++;
            sub = englishLine.substring(i,i+1);
            if(sub.equals(" ")){
                counter = 0;
                alienString += englishLine.substring(i-counter, i) + " ";
            }
        }
        return alienString;
    }
}
