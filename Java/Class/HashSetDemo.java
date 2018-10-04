import java.util.*;
class HashSetDemo {

  public static void main(String[] args) {
    HashSet <String> hSet = new HashSet();

    // auto sorting and its not ordered
    // HashSet for unique and TreeSet for unique and sorted
    // TreeSet is slower than HasSet

    hSet.add("Zeena");
    hSet.add("kavita");
    hSet.add("Leena");
    hSet.add("Meena");
    hSet.add("Meena");
    System.out.println(hSet);
    System.out.println("Insertion Complete");
    hSet.remove("kavita");
    System.out.println("Removed kavita");
    System.out.println(hSet);

    // add, remove, size, contains...

    Iterator itr = hSet.iterator();

    while(itr.hasNext()){

      System.out.println(itr.next());
    }

    //hashCode can be same by equals method can be true or false so basically we have to check if the hashCode is same and equals should return true.....
  }
}
