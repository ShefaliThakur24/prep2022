package generics;

public class User implements Comparable<User> {
int points;

        public User(int points)
        {
            this.points=points;
        }

    @Override
    public int compareTo(User o) {
        //if this < o -> -1
        //if this == o -> 0
        //if this > o -> 1
        return points - o.points;
    }

    @Override
    public String toString()
    {
       return "points=" + points;
    }
}
