public enum Roman {
    I(1, "I"), II(2, "II"), III(3, "III"), IV(4, "IV"), V(5, "V"), VI(6, "VI"), VII(7, "VII"), VIII(8, "VIII"), IX(9, "IX"), X(10, "X");
    private int arab;
    private String roman;

    Roman(int arab, String roman) {
        this.arab = arab;
        this.roman = roman;

    }
    public int getArab() {
        return arab;
    }
    public String getRo() {
        return roman;
    }


}