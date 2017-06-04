import java.util.ArrayList;
public class Game {

  // declare and initialize variables
  private GameHelper helper = new GameHelper();
  // ArrayList of only Ship objects
  private ArrayList<Ship> ships = new ArrayList<Ship>();
  private int numOfGuesses = 0;

  private void setUpGame() {
      // make ships and give them locations
      Ship ship1 = new Ship();
      ship1.setName("Harbinger");
      Ship ship2 = new Ship();
      ship2.setName("Battleship");
      Ship ship3 = new Ship();
      ship3.setName("Aircraft Carrier");
      ships.add(ship1);
      ships.add(ship2);
      ships.add(ship3);

      System.out.println("Your goal is to sink three ships.");
      System.out.println("Haribinger, Battleship, and the Aircraft Carrier");
      System.out.println("Try to sink them all in the fewest number of guesses");

      for (Ship shipToSet : ships) {
        // ask helper for a random location
        ArrayList<String> newLocation = helper.placeShip(3);
        // set the ship to that location
        shipToSet.setLocationCells(newLocation);
      }
    }

  private void startPlaying() {
    // while there are still ships
    while(!ships.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  private void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss";

    for (Ship shipToTest : ships) {
      // check user guess and return hit, kill, or miss
      result = shipToTest.checkYourself(userGuess);
      if (result.equals("hit")) {
        break;
      }
      if (result.equals("kill")) {
        // remove sunken ship
        ships.remove(shipToTest);
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame() {
    System.out.println("All ships are sunk! You are the leader of the (free) world!");
    if(numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
      System.out.println("You got out before your options sank.");
    } else {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.")
      System.out.println("Fish are dancing with your options.")
    }
  }

  public static void main (String[] args) {
    Game game = new Game();
    game.setUpGame();
    game.startPlaying();
  }
}
