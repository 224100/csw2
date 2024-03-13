public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("Aman",1030);
        System.out.println(p.getKey()+" , "+p.getValue());
        p.setKey("Utkarsh");
        p.setValue(1042);
        System.out.println(p.getKey()+" , "+p.getValue());

    }
}