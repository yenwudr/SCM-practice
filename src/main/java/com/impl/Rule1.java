package com.impl;

import com.AbstractRule;

/**
 * 当数字是3的倍数输出Fizz，是5的倍数输出Buzz，既是3的倍数又是5的倍数输出FizzBuzz
 */
public class Rule1 extends AbstractRule {
    @Override
    public String getData(Integer number) {
            if (number%3==0 && number %5 ==0){
               return "FizzBuzz";
            }else if (number%3 ==0){
                return"Fizz";
            }else if (number% 5 ==0){
                return"Buzz";
            }else {
                return String.valueOf(number);
            }
    }
}
