package src.Enums;

public enum Commands {
    MOVE("<move> <direction> you can move to a neighbor of the current location"),
    AT("<at> Gives the player's current location"),
    LOOK("<look> Shows all possible directions and items in location"),
    INVENTORY("<inventory> List all items in your invetory"),
    QUEST("Give u a next quest, with the right answer u will get an item"),
    ANSWER("<answer> <yes or no> let u give an answer to the current quest"),
    HELP("<help> Give all existent Commands back");

    private String desc;

    Commands(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return " " + desc;
    }

}
