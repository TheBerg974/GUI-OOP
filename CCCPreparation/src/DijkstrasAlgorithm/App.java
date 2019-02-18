/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstrasAlgorithm;

/**
 *
 * @author berge
 */
public class App {

    public static void main(String[] args) {
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");

        A.addNeighbour(new Edge(4, A, B));
        A.addNeighbour(new Edge(3, A, C));
        A.addNeighbour(new Edge(7, A, E));
        
        B.addNeighbour(new Edge(4, B, A));
        B.addNeighbour(new Edge(6, B, C));
        B.addNeighbour(new Edge(5, B, D));
        
        C.addNeighbour(new Edge(3, C, A));
        C.addNeighbour(new Edge(6, C, B));
        C.addNeighbour(new Edge(8, C, E));
        
        D.addNeighbour(new Edge(5, D, B));
        D.addNeighbour(new Edge(11, D, C));
        D.addNeighbour(new Edge(2, D, E));
        D.addNeighbour(new Edge(2, D, F));
        D.addNeighbour(new Edge(10, D, G));
        
        E.addNeighbour(new Edge(7, E, A));
        E.addNeighbour(new Edge(8, E, C));
        E.addNeighbour(new Edge(2, E, D));
        E.addNeighbour(new Edge(4, E, G));
        
        F.addNeighbour(new Edge(2, F, D));
        F.addNeighbour(new Edge(3, F, G));
        
        G.addNeighbour(new Edge(10, G, D));
        G.addNeighbour(new Edge(4, G, E));
        G.addNeighbour(new Edge(3, G, F));
        
        Algorithm alg = new Algorithm();
        alg.computePaths(A);
        
        System.out.println(alg.getShortestPathTo(F));
    }

}
