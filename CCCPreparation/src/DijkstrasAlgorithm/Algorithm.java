/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstrasAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author berge
 */
public class Algorithm {
    
    public void computePaths(Vertex sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);
        
        while(!priorityQueue.isEmpty()) {
            
            Vertex currentVertex = priorityQueue.poll();
            
            for(Edge edge: currentVertex.getNeighborList()) {
                Vertex targetVertex = edge.getTargetVertex();
                double weight = edge.getWeight();
                double minDistanceViaTarget = currentVertex.getMinDistance() + weight;
                
                if(minDistanceViaTarget < targetVertex.getMinDistance()){
                    priorityQueue.remove(targetVertex);
                    targetVertex.setPreviousVertex(currentVertex);
                    targetVertex.setMinDistance(minDistanceViaTarget);
                    priorityQueue.add(targetVertex);
                }
            }
        }
    }
    
    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> path = new ArrayList<>();
        for (Vertex vertex = targetVertex; vertex!= null; vertex = vertex.getPreviousVertex()) {
            path.add(vertex);
        }
        
        Collections.reverse(path);
        return path;
    }
}
