/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_thread2;

/**
 *
 * @author siliprandi.diego
 */
public class Es_Thread2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        processo p1 = new processo('A');
        processo p2 = new processo('B');
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
    }
    
}