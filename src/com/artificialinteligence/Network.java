/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artificialinteligence;

import java.util.List;

/**
 *
 * @author Matt
 */
public class Network
{
   
    List <List<Node>> NodeNet;
    List <Node> nodeList;
    public void addLayer(List<Node> layer)
    {
        NodeNet.add(layer);
    }
    public void addNode(Node newNode, int layer)
    {
        NodeNet.get(layer).add(newNode);
        
    }
    public Node getNode(int layer, int node)
    {
        return NodeNet.get(layer).get(node);
    }
    
    
    
}
