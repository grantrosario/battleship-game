import java.util.ArrayList;

public class Ship {

  private ArrayList<String> locationCells;
  private String name;

  public void setLocationCells(ArrayList<String> locs) {
    locationCells = locs;
  }

  public void setName(String thisName) {
    name = thisName;
  }

  public String checkYourself(String userInput) {
    String result = "miss";
    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
      locationCells.remove(index);

      if (locationCells.isEmpty()) {
        result = "kill";
        System.out.println("You sunk the " + name + "!");
      } else {
        result = "hit";
      } // close if
    } // close outer if
    return result;
  } // close method
} // close class
