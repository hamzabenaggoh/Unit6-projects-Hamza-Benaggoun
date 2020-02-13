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
        runTime = 0;
        songs = 0;
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
                return true;
            }
        }
        return false;
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
        this.update();
        return toString + "total play time: " + runTime + " and number of songs is " + songs;
    }

    public void sortByTitle(){
        Album temp;
        int min;
        for (int i = 0 ; i < albums.length - 1 ; i++){
            min = i;
            for (int scan = i + 1; scan < albums.length ; scan++) {
                if (albums[scan] != null && albums[i] != null){
                    if (albums[scan].getTitle().compareTo(albums[min].getTitle()) < 0){
                        min = scan;
                    }
                }
            }
            temp = albums[min];
            albums[min] = albums[i];
            albums[i] = temp;
        }
    }

    public void sortByArtist(){
        for (int i = 1; i < albums.length; i++) {
            Album key = albums[i];
            int position = i;

            while (position > 0 && albums[position - 1] != null && key != null && albums[position - 1].getArtist().compareTo(key.getArtist()) > 0 ){
                albums[position] = albums[position - 1];
                position--;
            }
            albums[position] = key;
        }
    }

    public int binarySearchArtist(String target){
        int low = 0;
        int high = albums.length - 1;
        int middle = (low + high) / 2;

        while (!albums[middle].getArtist().equals(target) && low <= high ){
            if (target.compareTo(albums[middle].getArtist()) < 0){
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
            middle = (low + high) / 2;
        }

        if (albums[middle].getArtist().equals(target)){
            return middle;
        }
        else{
            return -1;
        }

    }

    public int binarySearchTitle(String target){
        int low = 0;
        int high = albums.length - 1;
        int middle = (low + high) / 2;

        while (!albums[middle].getTitle().equals(target) && low <= high ){
            if (target.compareTo(albums[middle].getTitle()) < 0){
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
            middle = (low + high) / 2;
        }

        if (albums[middle].getTitle().equals(target)){
            return middle;
        }
        else{
            return -1;
        }

    }

}
