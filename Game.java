public class Game {
  public static void main(String[] args) {
    // track user guesses
    int numOfGuesses = 0;

    // special class for getting user input
    GameHelper helper = new GameHelper();

    SimpleDotCom theDotCom = new SimpleDotCom();

    // make a random variable and fill locations array
    int randomNum = (int) (Math.random() * 5);
    int[] locations = {randomNum, randomNum + 1, randomNum + 2};

    // give the dotcom its locations
    theDotCom.setLocationCells(locations);

    // value to check wether game should still go on
    boolean isAlive = true;

    while(isAlive == true) {
      // get user input string
      String guess = helper.getUserInput("Enter a number");
      // check the guess and return result
      String result = theDotCom.checkYourself(guess);
      numOfGuesses++;
      // if result is kill, end game, report score
      if(result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      }
    }
  }
}
