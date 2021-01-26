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
public class processo implements Runnable{
    char a;
    long i = 6, j = 5, i2 = i-1, j2 = j-1;
    boolean terminato = false;
    
    public processo(char a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (a == 'A') {
            while(!terminato) {
                System.out.println(i+" * "+i2+"="+i*i2);
                i = i*i2;
                i2--;
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
                if (i2==0) {
                    this.ferma();
                }
            }
        } else {
            while(!terminato) {
                System.out.println("\t\t"+j+" * "+j2+"="+j*j2);
                j = j*j2;
                j2--;
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
                if (j2==0) {
                    this.ferma();
                }
            }
        }
    }
    
    public void ferma() {
        terminato = true;
    }
}