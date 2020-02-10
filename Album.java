public class Album {
    private String title;
    private String artist;
    private int tracks;
    private double playTime;

    public Album(String title , String artist , int tracks , double playTime){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        this.playTime = playTime;



    }

    public double getPlayTime(){
        return this.playTime;
    }

    public int getTracks(){
        return this.tracks;
    }

    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }

    public String toString(){
        String result = "";
        result += title + " by " + artist + " | " + tracks + " tracks";
        result += ", Time: " + playTime + " min";
        return result;
    }
}
