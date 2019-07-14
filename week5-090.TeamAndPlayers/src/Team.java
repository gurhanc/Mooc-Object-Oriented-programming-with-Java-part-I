/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurhan
 */

import java.util.ArrayList;
        
public class Team {
    
    private String name;
    private int maxSize = 16;
    private ArrayList<Player> list = new ArrayList<Player>();
    
    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        System.out.println(maxSize);
        System.out.println(list.size());
        if (list.size() < maxSize) {
            list.add(player); 
    }
        
    }
    
    public void printPlayers() {
        int i;
        for (i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return list.size();
    }
    
    public int goals() {
        int i;
        int totalGoal = 0;
        for (i=0;i<list.size();i++) {
            totalGoal += list.get(i).goals(); 
        }
        return totalGoal;
        
    }
    
    
}
