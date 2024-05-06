public class BNode {
    country info;
    BNode right;
    BNode left;
    public BNode(String name, int p){
        info = new country(name,p);
        left =right=null;
    }
    @Override
    public String toString(){
        return info.toString();
    }
}
