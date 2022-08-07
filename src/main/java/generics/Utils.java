package generics;

public class Utils {

    public static <T extends Comparable<T>> T max(T first,T second){

       return (first.compareTo(second)<0) ? first : second;
    }
    public static void printUser(User user)
    {
        System.out.println(user);
    }
public  static void printList(GenericList<? super User> users)
{
Object x =users.get(0);//with the extends key word we can only read from the list
users.add(new User(10));
users.add(new Instructor(22));
}
}
