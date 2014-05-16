/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//http://www.programcreek.com/2013/03/arraylist-vs-linkedlist-vs-vector/


package desempenholistas;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author roger
 */
public class DesempenhoListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    // ArrayList add
    long startTime = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
           arrayList.add(i);
    }
    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println("ArrayList add:  " + duration);

    // LinkedList add
    startTime = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
           linkedList.add(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList add: " + duration);

    // ArrayList get
    startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) {
           arrayList.get(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList get:  " + duration);

   // LinkedList get
   startTime = System.nanoTime();

   for (int i = 0; i < 10000; i++) {
           linkedList.get(i);
   }
   endTime = System.nanoTime();
   duration = endTime - startTime;
   System.out.println("LinkedList get: " + duration);



   // ArrayList remove
   startTime = System.nanoTime();

   for (int i = 9999; i >=0; i--) {
           arrayList.remove(i);
   }
   endTime = System.nanoTime();
   duration = endTime - startTime;
   System.out.println("ArrayList remove:  " + duration);



   // LinkedList remove
   startTime = System.nanoTime();

   for (int i = 9999; i >=0; i--) {
           linkedList.remove(i);
   }
   endTime = System.nanoTime();
   duration = endTime - startTime;
   System.out.println("LinkedList remove: " + duration);
   //And the output is:

   //ArrayList add:  13265642
   //LinkedList add: 9550057
   //ArrayList get:  1543352
   //LinkedList get: 85085551
   //ArrayList remove:  199961301
   //LinkedList remove: 85768810       
        
        
        
    }
    
}
