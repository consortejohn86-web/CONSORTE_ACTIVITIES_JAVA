public class FavoriteThingsArray {
    
public static void main(String[] args) {

        String[] favorites = {
            "Music",
            "Dance",
            "Movies",
            "Travel",
            "Gaming"
        };

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total number of favorites: "
                + favorites.length);
    }
}



