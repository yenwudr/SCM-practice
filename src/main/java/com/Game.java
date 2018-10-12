package com;

import com.impl.Rule1;
import com.impl.Rule3;
import com.impl.Rule5;


public class Game {

    public static void main(String[] args) {
        Integer [] numbers = new Integer[100];
        for(int i=0 ; i<100 ;i++){
            numbers[i]=i+1;
        }
        Rule rule = new Rule1();
        rule.printOut(numbers);
        System.out.println();
        System.out.println("==========================================");
        System.out.println();
        Rule rule3 = new Rule3();
        rule3.printOut(numbers);
        System.out.println();
        System.out.println("==========================================");
        System.out.println();
        Rule rule5 = new Rule5();
        rule5.printOut(numbers);
    }




}
