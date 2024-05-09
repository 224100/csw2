import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph_l{
    ArrayList<vertices> v;
    ArrayList<LinkedList<vertices>> adjL ;
    public Graph_l(){
        v = new ArrayList<>();
        adjL = new ArrayList<>();
    }
    public void addVertex(char x){
        vertices temp = new vertices(x);
      v.add(temp);
      LinkedList<vertices> tem = new LinkedList<>();
      tem.add(temp);
      adjL.add(tem);
    }
    public void addEdge(char a, char b) {
    int d = search(a);
    adjL.get(d).add(new vertices(b));
    }
    int search(char x){
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

    public void bfs(char x){
        int s = search(x);
        Queue<vertices> q = new LinkedList<>();
        q.add(v.get(s));
        v.get(s).visited=true;
        while(!q.isEmpty()){
            vertices u = q.poll();
            System.out.print(u+" , ");
            int d = search(u.data);
            LinkedList<vertices> l = adjL.get(d);
            for(int  i = 1;i<l.size();i++){
                if(!v.get(search(l.get(i).data)).visited){
                q.add(l.get(i));
                v.get(search(l.get(i).data)).visited=true;
            }
            }
        }
        System.out.println();
        vf();
    }
    public void dfs(char x){
        Stack<vertices> st = new Stack<>();
        int d = search(x);
        st.push(v.get(d));
        v.get(d).visited=true;
        while(!st.isEmpty()){
            vertices t = st.pop();
            System.out.print(t+" , ");
            d = search(t.data);
            LinkedList<vertices> l = adjL.get(d);
            for(int  i = 1;i<l.size();i++){
                if(!v.get(search(l.get(i).data)).visited){
                    st.push(l.get(i));
                    v.get(search(l.get(i).data)).visited=true;
                }
            }

        }
        System.out.println();
        vf();
    }
    public void vf(){
        for(vertices i:v){
            i.visited=false;
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
