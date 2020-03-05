public class Card {
    public static final String[] RANK = {"A", "K","Q","J","10","9","8","7","6","5","4","3","2"};
    public static final String[] SUIT = {"(Hearts)", "(Clubs)" , "(Spades)" , "(Diamonds)"};
    private String rank;
    private String suit;

    public Card(String suit , String rank){
        this.suit = suit;
        this.rank = rank;
    }
    public Card(){
        this.suit = "";
        this.rank = "";
    }
    public int compareTo(Object other){
        Card otherCard = (Card) other;
        return this.getRankValue() - otherCard.getRankValue();
    }
    public int getRankValue(){
        for (int i = 0; i < RANK.length; i++) {
            if (rank.equals(RANK[i])){
                return 14 - i;
            }
            else{
                return -1;
            }
        }
        return -1;
    }

    public String getSuit(){
        return this.suit;
    }
    public String getRank(){
        return this.rank;
    }
    public String toString(){
        String result = "";
        result += this.rank + this.suit;
        return result;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
}