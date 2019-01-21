package src;

public class Game {
    private LocationDealer locationDealer;
    private Player player;
    private Command command;
    private QuestDealer questDealer;

    public Game() {
        this.locationDealer = new LocationDealer(this);
        getLocationDealer().buildLocations();
        this.player = new Player(this, locationDealer.getLocations().get(0));
        this.command = new Command();
        this.questDealer = new QuestDealer(this);
    }


    public LocationDealer getLocationDealer() {
        return this.locationDealer;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Command getCommand() {
        return this.command;
    }

    public QuestDealer getQuestDealer() {
        return this.questDealer;
    }
}
