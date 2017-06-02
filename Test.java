import java.util.*;
public class Test {
  public static void main (String[] args) {
    // Intsantoate simpledotcom object
    ArrayList<String> myList = new ArrayList<String>();
    String a = new String("Woohoo");
    myList.add(a);
    System.out.println(myList);

    System.out.println(myList.size());
    System.out.println(myList.get(0));
    myList.remove(0);
    System.out.println(myList);
    System.out.println(myList.contains(a));

    // // Make int array for location of dotcom
    // int[] locations = {2, 3, 4};
    // // Invoke setter method on dotcom
    // dot.setLocationCells(locations);
    //
    // // fake user guess
    // String userGuess = "2";
    // // invoke checkyourself() method on dotcom object and pass it fake guess
    // String result = dot.checkYourself(userGuess);
  }
}
