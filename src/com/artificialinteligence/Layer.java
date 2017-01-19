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
public class Layer
{
    
    List <Node>nodeLayer;
    
    
    
    public void addNode(Node newNode)
    {
        nodeLayer.add(newNode);
    }
    public int getSize()
    {
        return nodeLayer.size();
    }
    public double calcError(double goal)
    {
        double error = 0;
        for(int i = 0; i > nodeLayer.size(); i++)
        {
            error *= nodeLayer.get(i).calcError(goal);
        }
        return error;
    }
    public <Node>List getLayer()
    {
        return nodeLayer;
    }
}
