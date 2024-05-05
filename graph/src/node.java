import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class vertices {
    int data;
    boolean visited;
    @Override
    public String toString(){
        return ""+data;
    }
}
class graph{
    ArrayList<vertices> v = new ArrayList<>();
    int[][] adjMatrix;
    int size;
    public graph(int size){
        this.size = size;
        adjMatrix = new int[size][size];
        for(int i =0 ;i<size;i++){
            for(int j = 0;j<size;j++){
                adjMatrix[i][j]=0;
            }
        }
        for(int i=0;i<size;i++){
            Scanner sc= new Scanner(System.in);
            vertices vertex = new vertices();
            System.out.println("Enter the data:");
            vertex.data = sc.nextInt();
            vertex.visited = false;
            v.add(vertex);
        }
    }
    public void addEdge(int a, int b){
        adjMatrix[a][b] = 1;
        adjMatrix[b][a] = 1;
    }
    void display(){
        for(vertices t : v){
            System.out.println(t);
        }
    }
    

    
}
