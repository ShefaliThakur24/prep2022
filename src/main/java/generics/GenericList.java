package generics;

import java.util.Iterator;

//T type parameter or template  or element E for collection
//T over here represents type of objects we want to store in a list
//just as our nethod can have parameters our classes can have parameters too
// when we create instance of this class we need to specify value of this parameter
//Through generics are code gets cleaner due to no need of explicit cast and complile time type safety
//When creating an instance of generic type
public class GenericList<T> implements Iterable<T> {
public T[] items = (T[])new Object[10];// use new object array here is the solution

private int count;

public void add(T item)
{
items[count++]= item;
}
public T get(int index)
{
return items[index];
}

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
