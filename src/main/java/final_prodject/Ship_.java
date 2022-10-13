package final_prodject;

public enum Ship_ {
    EMPTY ("⬜", 0), SHIP_1p("\uD83D\uDEE5", 1), SHIP_2p("\uD83D\uDEE5", 2), SHIP_3p ("\uD83D\uDEE5", 3),SHIP_4p ("\uD83D\uDEE5", 4), OREOL ("\uD83D\uDFE6", 0), SOS ("\uD83D\uDFE5", 0), MOVE ("*", 0), WOUNDED("X", 0);

    private String value;
    private int paluba;


    private Ship_ (String value, int paluba) {

        this.value=value;
        this.paluba=paluba;
    }

    public int getPaluba() {
        return paluba;
    }

    public String getValue (){
        return value;
    }
    public String toString() {
        return value;
    }
}
