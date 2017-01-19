/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artificialinteligence;

/**
 *
 * @author Matt
 */
public class Synapse
{
    private Node parentNode, childNode;
    private double myWeight;
    Synapse(Node parent, Node child, double weight)
    {
        parentNode = parent;
        childNode = child;
        childNode.weight = weight;
    }
    public Node getParent()
    {
        return parentNode;
    }
    public Node getChild()
    {
        return childNode; 
    }
    public double getWeight()
    {
        return childNode.weight;
    }
    public void setWeight(double newWeight)
    {
        childNode.weight = newWeight;
    }
    
}
