public class Trainer{

  String name;
  int badges;
  Pokemon[] pokemons;

  public Trainer(String name) {

    this.name = name;
    this.badges = 0;
    this.pokemons = new Pokemon[6];

  }

  public boolean capture(Pokemon p) {

    return false;  

  }

}
