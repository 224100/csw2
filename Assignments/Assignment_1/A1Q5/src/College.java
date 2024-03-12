public class College {
    private String cName;
    private String cLoc;

    public College(String c, String cl) {
        cName = c;
        cLoc = cl;
    }
    @Override
    public String toString() {
        return "College{" + cName +" , " + cLoc  + "}";
    }
}