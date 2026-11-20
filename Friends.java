import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

    ArrayList<Name> friends = new ArrayList<Name>();
    Random r = new Random();
    
   
   // the constructor
   public Friends () {
        friends.add(new Name("Bob", "Dylan"));
   }
   
   public void printRandomFriend(){
       //return a random Name object from the List
       int x = r.nextInt(friends.size());
       String s = friends.get(x).fullName();
       System.out.println(s);
    }
   
  public Name getRandomFriend(){
    int x = (int)(Math.random()*friends.size());
    return friends.get(x);
  }
}