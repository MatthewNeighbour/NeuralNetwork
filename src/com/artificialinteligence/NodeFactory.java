/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artificialinteligence;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matt
 */
public class NodeFactory
{
    Network network;
    int totalLayers = 0;
    NodeFactory(Network net)
    {
        this.network = net;
    }
    public void addLayer(int nodes)
    {
        ArrayList<Node> myList = new ArrayList();
        for (int i = 0; i < nodes; i++)
        {
            Node n = new Node();
            myList.add(n);
             
        }
    }
}
