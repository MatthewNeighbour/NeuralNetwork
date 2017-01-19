
package com.artificialinteligence;



/**
 *
 * @author Matt
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        
        
        Node x = new Node();
        Node y = new Node();
        Node z = new Node();
        
        
        Node a1 = new Node();
        Node a2 = new Node();
        Node a3 = new Node();
        Node a4 = new Node();
        Node a5 = new Node();
        
        
        Node b1 = new Node();
        Node b2 = new Node();
        Node b3 = new Node();
        Node b4 = new Node();
        Node b5 = new Node();
        
        
        Node c1 = new Node();
        Node c2 = new Node();
        Node c3 = new Node();
        Node c4 = new Node();
        Node c5 = new Node();
        
        Node o1 = new Node();
        Node o2 = new Node();
        Node o3 = new Node();
        
        
        
        o1.addChild(a1);
        o1.addChild(a2);
        
        
        o2.addChild(a2);
        o2.addChild(a3);
        
        o3.addChild(a3);
        o3.addChild(a4);
        o3.addChild(a5);
        
        a1.addChild(b1);
        a1.addChild(b5);
        
        
        a2.addChild(b2);
        a2.addChild(b5);
        
         
        a3.addChild(b3);
        a3.addChild(b5);
        
        
        a4.addChild(b4);
        a4.addChild(b1);
        
        
        a5.addChild(b5);
        a5.addChild(b1);
        
        
        b1.addChild(c1);
        b1.addChild(c2);
        
        
        b2.addChild(c1);
        b2.addChild(c2);
        b2.addChild(c3);
        
        
        b3.addChild(c2);
        b3.addChild(c3);
        b3.addChild(c4);
        
        b4.addChild(c3);
        b4.addChild(c4);
        b4.addChild(c5);
        
        b5.addChild(c4);
        b5.addChild(c5);
        
        c1.addChild(x);
        
        c2.addChild(x);
        c2.addChild(y);
        
        c3.addChild(z);
        c3.addChild(y);
        
        c4.addChild(y);
        c4.addChild(z);
        
        c5.addChild(z);
        
        /*
        x.setOpinion(0);
            y.setOpinion(0);
            z.setOpinion(0);
            
            
            
            o1.adjustWeight(0);
            o2.adjustWeight(0);
            o3.adjustWeight(1);
        */
        Node n1 = new Node(1);
        Node n2 = new Node(0);
        Node n3 = new Node(1);
        n2.addChild(n1);
        n3.addChild(n2);
        for(long i = 0; 100 > i; i++)
        {
            n1.adjustWeight(0);
            n2.adjustWeight(5);
            n3.adjustWeight(0);
            //System.out.println("N1: " + n1.fire() + "   N2: " + n2.fire() + "   N3: " + n3.fire());
        }
        System.out.println(" Hello N1: " + n1.fire() + "   N2: " + n2.fire() + "   N3: " + n3.fire());
        System.out.println(o1.fire());
        System.out.println(o2.fire());
        System.out.println(o3.fire());
        System.out.println("Error: " + n3.calcError(1));
    }
    
}