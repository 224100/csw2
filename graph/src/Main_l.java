public class Main_l {
    public static void main(String[] args) {
        Graph_l v  = new Graph_l();
        v.addVertex(1);
        v.addVertex(2);
        v.addVertex(3);
        v.addVertex(4);
        v.addVertex(5);

        v.addEdge(1,2);
        v.addEdge(2,5);
        v.addEdge(3,2);
        v.addEdge(4,1);
        v.addEdge(1,3);

        v.showedges();
        v.display();


    }
}
