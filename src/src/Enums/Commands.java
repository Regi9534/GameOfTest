package src.Enums;

public enum Commands {
    MOVE("<move> <direction> you can move to a neighbor of the current location"),
    AT("Gives the player's current location"),
    HELP("Give all existent Commands back");


    private String desc;

    Commands(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return " " + desc;
    }

}
