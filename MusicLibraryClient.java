public class MusicLibraryClient {
    public static void main(String[] args) {
        Album a1 = new Album("First" , "John" , 2 , 49.03);
        Album a2 = new Album("Second" , "John" , 20 , 10);
        Album a3 = new Album("Third" , "John" , 21 , 11);
        Library library = new Library();
        library.add(a1);
        library.add(a2);
        library.add(a3);

        int loc = library.findTitle("First");
        System.out.println(library.getAlbum(loc));
        library.remove(1);

        System.out.println(library.toString());

    }
}
