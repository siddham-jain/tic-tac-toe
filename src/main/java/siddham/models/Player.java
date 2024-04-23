package siddham.models;

public class Player {
    String name;
    Symbol symbol;

    PlayerTyper type;

    public enum PlayerTyper{
        Human, Bot;
    }

    public Player(String name, Symbol symbol, PlayerTyper type){
        this.name = name;
        this.symbol = symbol;
        this.type = type;
    }
}
