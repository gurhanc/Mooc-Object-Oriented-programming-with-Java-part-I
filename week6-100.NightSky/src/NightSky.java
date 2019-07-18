/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurhan
 */

import java.util.Random;

public class NightSky {
    
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
        String result = "";
        int i;
        double prob;
        Random rn = new Random();
        for (i=0;i<this.width;i++) {
            prob = rn.nextDouble();
            if (prob < density) {
                result += "*";
                this.starsInLastPrint += 1;
            }
            else {
                result += " ";
            }
        }
        System.out.println(result);
        
    }
    
    public void print() {
        int i;
        this.starsInLastPrint = 0;
        for (i=0;i<this.height;i++) {
            printLine();
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
