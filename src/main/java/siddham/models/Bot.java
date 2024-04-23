package siddham.models;

public class Bot extends Player{
    BotDifficultyLevel difficultyLevel;
    public enum BotDifficultyLevel{
        Easy, Medium, Hard;
    }
    public Bot(BotDifficultyLevel difficultyLevel, String name, Symbol symbol){
        super(name, symbol, PlayerTyper.Bot);
        this.difficultyLevel = difficultyLevel;
    }
}
