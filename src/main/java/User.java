public class User implements Comparable<User>{

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWantsEmails() {
        return wantsEmails;
    }

    private final String name;
    private final int age;
    private final boolean wantsEmails;

    public User(String name, int age, boolean wantsEmails) {

        this.name = name;
        this.age = age;
        this.wantsEmails = wantsEmails;
    }


    @Override
    public int compareTo(User otherUser) {
        return name.compareToIgnoreCase(otherUser.getName());
    }
}
