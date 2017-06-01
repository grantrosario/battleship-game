public class SimpleDotComTestDrive {
  public static void main (String[] args) {
    // Intsantoate simpledotcom object
    SimpleDotCom dot = new SimpleDotCom();

    // Make int array for location of dotcom
    int[] locations = {2, 3, 4};
    // Invoke setter method on dotcom
    dot.setLocationCells(locations);

    // fake user guess
    String userGuess = "2";
    // invoke checkyourself() method on dotcom object and pass it fake guess
    String result = dot.checkYourself(userGuess);
  }
}
