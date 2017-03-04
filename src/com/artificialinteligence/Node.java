
package com.artificialinteligence;


import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Matt
 */
public class Node
{
    private double LearningRate = 0.5;
    private double Opinion;
    private final ArrayList <Synapse>LINK = new ArrayList();
    private double bias = .5;   // figure 1 * weight. weight being .5
    private final Random rand = new Random();
    double weight;
    Network NodeNet;
    
    Node(double newData)
    {

        if(newData > 1)
        {
            this.Opinion = newData;
        }else{
            this.Opinion = newData;
        }
        
    }
//    Node(Node newChild)
//    {
//        LINK.add(new Synapse(this, newChild, rand.nextDouble()));
//        //System.out.println(LINK.get(0).getChild().Opinion);
//    }
    Node()
    {
        
    }
    Node(Network net)
    {
        addNet(net);
    }
    public double getData()
    {
        return this.Opinion;
    }
    private double calcOutput()
    {
        if(LINK.size() > 0)
        {
            for (int i = 0; LINK.size() > i; i++)
            {
                double weightedValue = LINK.get(i).getChild().Opinion * LINK.get(i).getWeight();
                Opinion += weightedValue;
            }
            //Opinion = newData / LINK.size();
            System.out.println("Opinion: " + Opinion);
            Opinion =  Opinion + bias;
        }else{
            System.out.println("Opinion: " + Opinion);
            Opinion = Opinion + bias;
        }
        return Opinion;
    }
//    private void adjustChild()
//    {
//        for(int iLink = 0; LINK.size() > iLink; iLink++)
//        {
//            LINK.get(iLink).getParent().calcOutput();
//        }
//    }
    public void addNet(Network net)    
    {
        this.NodeNet = net;
    }
    public void addChild(Node newChild)
    {
        double randomNum = rand.nextDouble();
        LINK.add(new Synapse(this, newChild, 0));
        System.out.println(randomNum);
    }
    public double fire()
    {
        return sigmoid(calcOutput());
    }
    
    private double sigmoid(double x) 
    {
        return (1/( 1 + Math.pow(Math.E,(-1*x))));
    }

    public void adjustWeight(double goal)
    {
        
            
        
        
    }
    public void printWeights()
    {
        for ( int i = 0; LINK.size() > i; i++)
        {
            System.out.println("Node " + i + " : " + LINK.get(i).getWeight());
        }
    }
    public void setOpinion(double newOpinion)
    {
        this.Opinion = newOpinion;
    }
    public double calcError(double goal) // i think this is useless
    {
        return (1/2) * (Math.pow(goal - Opinion, 2));
    }
    public double weightError(int weightNum)
    {
        return (NodeNet.TotalError / fire()) *  
                (fire() / calcOutput()) * 
                (calcOutput() / LINK.get(weightNum).getWeight());
    }
}
