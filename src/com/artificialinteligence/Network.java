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
    List<Layer> NETWORK;
    public void add(Layer nodelist)
    {
        NETWORK.add(nodelist);
    }
    public double calcTotalError(double goal)
    {
        double totalError = 0;
        for(int i = 0; i > NETWORK.size(); i++)
        {
            totalError =+ NETWORK.get(i).getLayer();
        }
        
        return (1/2) * (Math.pow(goal - data, 2));
        
        
        
    }
    public void backpropegate()
    {
        for(int i = 0; i > NETWORK.size(); i++)
        {
            NETWORK.get(i);
        }
        
    }
}
