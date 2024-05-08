import java.util.ArrayList;
import java.util.LinkedList;

class Graph_l{
    ArrayList<vertices> v;
    ArrayList<LinkedList<vertices>> adjL ;
    public Graph_l(){
        v = new ArrayList<>();
        adjL = new ArrayList<>();
    }
    public void addVertex(int x){
      v.add(new vertices(x));
      LinkedList<vertices> temp = new LinkedList<>();
      temp.add(new vertices(x));
      adjL.add(temp);
    }
    public void addEdge(int a, int b) {
    a = search(a);
    adjL.get(a).add(new vertices(b));
    }
    int search(int x){
        for(int i = 0 ; i < v.size();i++){
            if(x==v.get(i).data)
                return i;
        }
        return -1;
    }
    void display(){
        for(vertices t : v){
            System.out.println(t);
        }
    }
    public void showedges(){
        for(LinkedList<vertices> i : adjL ){
            for(vertices j : i){
                System.out.print(j+" --> ");
            }
            System.out.println();
        }
    }

}
