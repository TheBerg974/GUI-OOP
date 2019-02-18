package DijkstrasAlgorithm;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author berge
 */
public class Vertex implements Comparable<Vertex> {
    private String name;
    private List<Edge> neighborList;
    private boolean visited;
    private Vertex previousVertex;
    private double minDistance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.neighborList = new ArrayList<>();
    }
    
    public void addNeighbour(Edge edge) {
        this.neighborList.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getNeighborList() {
        return neighborList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return "Vertex{" + "name=" + name + '}';
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.minDistance, o.getMinDistance());
    }
    
    
    
    
}
