package ex_028_Enum;

public enum color {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hex_code;

    color(String hex_code1) {
        this.hex_code=hex_code1;
    }


    public String getHex_code() {
        return hex_code;
    }
}

