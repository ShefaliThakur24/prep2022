import generics.*;
//T type parameter or template  or element E for collection
//T over here represents type of objects we want to store in a list
//just as our nethod can have parameters our classes can have parameters too
// when we create instance of this class we need to specify value of this parameter
//Through generics are code gets cleaner due to no need of explicit cast and complile time type safety
//When creating an instance of generic type we can only use reference type as generic type argument.
// for eg String Object are reference typr in java we cannot pass int short boolean float these are all primitive types
// if we want to store these primitive types in generic types we have to use there wrapper classes lite Integer, Boolean
//Float new GenericList<U>

public class Main {

    public static void main(String[] args) {
//        var list = new List();
//        list.add(1);

//     var list=   new GenericList<Integer>();
//     list.add(1);
//     int number = list.get(0);

//        GenericList<Integer> numbers = new GenericList<Integer>();///grayed out as it is not
//        // necessary and we are duplicating our code
//        numbers.add(1);// java compliler will srap this value to store in the instance of Integer class it will create the
//        //instance of Integer class this process is called BOXING; so the java complier will put this value inside a Box
//int number=numbers.get(0);// we get instance of the integer in this case java compiler will
//// extract the value store in the instance of the object this is Unboxing

//     User user1 =   new User(12);
//     User user2= new User(24);
//
//     if(user1.compareTo(user2) < 0)
//     {
//         System.out.println("user1 < user2");
//     }
//     else if(user1.compareTo(user2) == 0)
//        {
//            System.out.println("user1 < user2");
//        }
//else
//     {
//         System.out.println("user1 > user2");
//     }

   //    var max=  Utils.max(1,3);
       // System.out.println(max);

     // var max=  Utils.max(new User(10),new User(20));

       // System.out.println(max);
//        User user = new User(10);
//        //or
//        User user2 = new Instructor(10);//bcoz instructor is the type of user this is basic object oriented programming
//        Utils.printUser(new Instructor(10));

//       var user4= new GenericList<Instructor>();
//       //
//        var user3= new GenericList<User>();
//        var user5= new GenericList<Integer>();
//       //
//       Utils.printList(user3);

   var list = new GenericList<String>();
   list.add("q");
   list.add("ee");
        System.out.println(list);
//       for(var item : list.items)
//       {}

       var itr= list.iterator();
       //iterator is like an pointer pointing to the object
       while(itr.hasNext()){
           var current=itr.next();
           System.out.println(itr);
       }
    }
}

