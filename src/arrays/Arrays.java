/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

/**
 *
 * @author rkaune
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numbers = new int [10];
        int [][] numbersSquare = new int [10][10];
        int [] numbers2 = {0,1,2,3,4,5,6,7,8,9};
        double [] numbers3 = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0,1.1,1.2,1.3};
        String[] cities = {"London", "Toronto", "Guelph", "Kitchener", "Waterloo", "Cambridge"};
        
        for (int i=numbers2.length-1;i>=0;i--){
            System.out.println(" "+ numbers2[i]);
        }
    }
    
}
