public class Library {
    private double runTime;
    private int songs;
    private Album[] albums;


    public Library() {
        albums = new Album[10];
        runTime = 0;
        songs = 0;
    }
    public void update(){
        for (Album val : albums){
            if (val != null){
                runTime += val.getPlayTime();
                songs += val.getTracks();
            }
        }
    }

    public boolean add(Album a1) {
        boolean a = false;
        boolean b = true;
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] == null) {
                albums[i] = a1;
                this.update();
                a = true;
            }
        }
        if (!a){
            b = false;
        }
        return b;
    }

    public void remove(int index) {
        for (int i = 0; i < albums.length; i++) {
            if (i == index) {
                albums[i] = null; //Setting album to null basically to remove it
                this.update();
            }
        }
    }

    public void Double(){
        Album[] reset = new Album[albums.length * 2];
        for (int i = 0 ; i < albums.length ; i++){
            reset[i] = albums[i];
        }
        albums = reset;
        this.update();
    }

    public int findTitle(String title){
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] != null && albums[i].getTitle().equals(title)){
                return i;
            }
            else{
                return -1;
            }
        }
        return -1;
    }
    public int findArtist(String artist){
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] != null && albums[i].getArtist().equals(artist)){
                return i;
            }
            else{
                return -1;
            }
        }
        return -1;
    }

    public Album getAlbum(int index){
        if (index >= 0 && index < albums.length){
            return albums[index];
        }
        else{
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public String toString(){
        String toString = "";
        for (Album a : albums){
            if (a != null){
                toString += a.toString() + "\n";
            }
        }
        return toString;
    }

    public void titleSort(){
        int min , temp;
    }




}
