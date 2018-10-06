import java.util.*;
class MapDemo{

  public static void main(String[] args) {
    HashMap <Integer, String> hMap = new HashMap<>();
    hMap.put(101, "Kavita");
    hMap.put(103, "Anita");
    hMap.put(100, "Vanita");
    System.out.println(hMap);
    hMap.put(101, "Sunita");
    System.out.println(hMap);
    //values can be duplicate but keys has to be unique
    System.out.println(hMap.get(101));

    System.out.println("is 101 present " + hMap.containsKey(101));
    System.out.println("is 105 present " + hMap.containsKey(105));

    System.out.println("is it empty " + hMap.isEmpty());
    System.out.println("Map Size " + hMap.size());
    hMap.remove(100);
    System.out.println("After removing 100");
    System.out.println(hMap);
    //HashMap does not support iterator
    // but there is a mehtod called keySet() mehtod;
    Set <Integer> kSet = hMap.keySet();
    // using for each loop
    for (Integer key : kSet){
      System.out.println(hMap.get(key));
    }
    // using iterator
    Iterator itr = kSet.iterator();
    while (itr.hasNext()) {
      System.out.println(hMap.get(itr.next()));
    }
  }
}
