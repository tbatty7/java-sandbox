import java.util.Comparator;

public class Hero {
    private final String name;
    private final String format;
    private final boolean likedMovie;
    public String getName() {
        return name;
    }
    public String getFormat() {
        return format;
    }

    public boolean isLikedMovie() {
        return likedMovie;
    }



    private final int weight;
    public Hero(String name, String format, boolean likedMovie, int weight) {
        this.name = name;
        this.format = format;
        this.likedMovie = likedMovie;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }


    // Field of an interface that implements an anonymous class for the interface
    public static Comparator<Hero> byName = new Comparator<Hero>() {
        @Override
        public int compare(Hero hero1, Hero hero2) {
            return hero1.getName().compareToIgnoreCase(hero2.getName());
            // you can use the compareTo() method in String to return -1, 0, or 1
        }
    };

    //Field of an interface that implements an anonymous class for the interface and compares an int
    public static Comparator<Hero> byWeight = new Comparator<Hero>() {
        @Override
        public int compare(Hero o1, Hero o2) {
            if (o1.getWeight() < o2.getWeight())
                return 1;
            else if (o1.getWeight() == o2.getWeight())
                return 0;
            else
                return -1;
        }
    };


}
