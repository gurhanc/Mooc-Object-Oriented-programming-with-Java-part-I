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

public class Grade {
    
    private ArrayList<Integer> scores;
    private String five = "";
    private String four = "";
    private String three = "";
    private String two = "";
    private String one = "";
    private String zero = "";
    
    public Grade() {
        scores = new ArrayList();
    }
    
    public void addGrade(int grade) {
        scores.add(grade);
    }
    
    public void assignGrades() {
        int i;
        for (i=0;i<scores.size();i++) {
            int score;
            score = Integer.parseInt(scores.get(i).toString());
                if (score <= 30) {
                    zero += "*";
                }
                else if (score > 30 && 34 >= score) {
                    one += "*";
                    }
                else if (35 <= score && score<= 39) {
                    two += "*"; 
                }
                else if (40 <= score && score<= 44) {
                    three += "*";  
                }
                else if (45 <= score && score<= 49) {
                    four += "*"; 
                }
                else if (50 <= score && score<= 60) {
                    five += "*";  
                }
        } 
    }
    public void printOutput() {
        int i;
        double result = 0;
        String[] grades = new String[]{"5","4","3","2","1","0"};
        String[] values = new String[]{five,four,three,two,one,zero};
        System.out.println("Grade distribution:");
        for (i=0;i<grades.length;i++) {
            System.out.println(grades[i]+": "+values[i]);
        } 
        for (i=0;i<values.length;i++) {
            result += values[i].length();
        }
        if (result == 0) {
            System.out.println("Acceptance percentage: 0.0");
        }
        System.out.println("Acceptance percentage: "+((result-values[5].length())/result)*100);
    }

    
}
