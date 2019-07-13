/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurhan
 */
public class Counter {
    private int value;
    private boolean control;
    
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        if (check == true) {
            this.control = true;
        }
        else {
            this.control = false;
        }
    }
    
    public Counter(int startingValue) {
        this.value = startingValue;
        this.control = false;
    }
    
    public Counter(boolean check) {
        this.value = 0;
        if (check == true) {
            this.control = true;
        }
        else {
            this.control = false;
        }
    }
    
    public Counter() {
        this.value = 0;
        this.control = false;
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value += 1;
    }
    public void decrease() {

        this.value -= 1;
        
        if (this.control == true) {
            if (this.value < 0) {
                this.value = 0;
            }
            
        }
    }
    
    public void increase(int increaseAmount) {
        
        if (increaseAmount < 0) {
            increaseAmount = 0;
        } 
        this.value += increaseAmount;
    }
    
    public void decrease(int decreaseAmount) {
        
        
        if (decreaseAmount < 0) {
            decreaseAmount = 0;
        }
        
        this.value -= decreaseAmount;
        
        if (this.control == true) {
            if (this.value < 0) {
                this.value = 0;
            }
        }
        
        
    }
    
}
