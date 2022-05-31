package main;

public class Dictionary {

    private String word;
    private boolean discard;
    private int[] position;

    public Dictionary(String word){
        this.word = word;
        this.discard = true;
        this.position = new int[]{0,0,0,0,0};
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isDiscard() {
        return discard;
    }

    public void setDiscard(boolean discard) {
        this.discard = discard;
    }

    public int getPosition(int pos) {
        return position[pos];
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
