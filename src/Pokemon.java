import acm.program.GraphicsProgram;

public abstract class Pokemon implements PokemonInterface {
    protected String name;
    protected int pokedexNum;
    protected double weight;
    protected double height;
    protected double attack;
    protected double defense;
    protected double stamina;
    protected String type;

    public String toString(){
        return name + " " +  pokedexNum + " " + weight + " " + height + " " + attack + " " + defense + " " + stamina + " " + type;
    }

    public String getName() {
        return this.name;
    }

    public int getPokedexNum() {
        return this.pokedexNum;
    }
}
