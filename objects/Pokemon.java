public class Pokemon {

  String name;
  int lv;
  double hp;

  /* Constructor for creating a Pokemon Object */
  // Parameters: 
  //  Name of the Pokemon
  //  Level default to 1
  //  HP depends on the Pokemon's level
  public Pokemon(String name) {
    
    this.name = name;
    this.lv = 1;
    this.hp = this.lv * 10 + this.lv * 5;

  }

  public boolean attack(Pokemon enemy) {

    return false;  

  }

}
