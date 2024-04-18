public class Address {
    String plotNo;
    String at;
    String post;
    Address(String plotNo, String at, String post){
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    @Override
    public String toString(){
        return "Address: " + plotNo + ", " + at + ", " + post;
    }
}
