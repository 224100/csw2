public class country {
    String name;
    int population;
    public country(String n , int p ){
        name = n;
        population=p;
    }
    @Override
    public String toString(){
        return name + " :- "+population;
    }
}
