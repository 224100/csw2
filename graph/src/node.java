import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class vertices {
    int data;
    boolean visited;

    @Override
    public String toString() {
        return "" + data;
    }

    public vertices(int x) {
    data=x;
    visited=false;
}
}
class graph{
    int max_v=0;
    ArrayList<vertices> v;
    int[][] adjMatrix;
    int size;
    public graph(int size){
        max_v=size;
        v = new ArrayList<>();
        this.size = size;
        adjMatrix = new int[size][size];
        for(int i =0 ;i<size;i++){
            for(int j = 0;j<size;j++){
                adjMatrix[i][j]=0;
            }
        }
    }
    public void addVertex(int x){
        if(max_v !=0){
            vertices vertex = new vertices(x);
            v.add(vertex);
            --max_v;
        }
    }
    public void addEdge(int a, int b) {
        a = search(a);
        b = search(b);
        if (a != -1 && b != -1) {
            adjMatrix[a][b] = 1;
            adjMatrix[b][a] = 1;
        }
        else
            System.out.println("Wrong input!");
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
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                if(adjMatrix[i][j]==1){
                    System.out.println(v.get(i)+" -> "+v.get(j));
                }
            }
        }
    }

}
