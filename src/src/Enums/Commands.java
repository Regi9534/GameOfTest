package src.Enums;

public enum Commands {
    MOVE("<move> <direction> u can move to a neibor of the current location"),
    HELP("Give all existens Caommands back");


    private String desc;

    Commands(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return " " + desc;
    }

}
