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
public class Error
{
    Network net = new Network();
    public double calcError(double goal)
    {
        
        double error = 0;
        for(int i = 0; i > nodeLayer.size(); i++)
        {
            error *= nodeLayer.get(i).calcError(goal);
        }
        return error;
    }
}
