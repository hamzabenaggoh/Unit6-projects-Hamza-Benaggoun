public class MusicLibraryClient {
    public static void main(String[] args) {
        Album a1 = new Album("First" , "John" , 2 , 49.03);
        Album a2 = new Album("Second" , "John" , 20 , 10);
        Album a3 = new Album("Third" , "wer" , 21 , 11);
        Album a4 = new Album("Fourth" , "ert" , 12, 9);
        Album a5= new Album("Fifth" , "yeet" , 4 , 3);
        Library library = new Library();
        library.Double();
        library.add(a2);
        library.add(a2);
        library.add(a3);
        library.add(a4);
        library.add(a5);
        library.add(a1);
        library.add(a2);
        library.add(a3);
        library.add(a4);
        library.add(a5);
        library.add(a1);
        library.add(a1);
        library.add(a1);
        library.sortByArtist();
        System.out.println(library.binarySearchArtist("sdfsdfsdf"));

        System.out.println(library.toString());

    }
}
