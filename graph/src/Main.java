public class Main {
    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(1,3);
        g.addEdge(0,4);
        g.addEdge(2,3);
        g.showedges();


        g.display();
    }
}