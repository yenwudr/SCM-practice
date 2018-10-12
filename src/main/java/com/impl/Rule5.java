package com.impl;

import com.AbstractRule;

/**
 * 当数字是5 的倍数或者包括5 的输出fizz
 */
public class Rule5 extends AbstractRule {

    @Override
    public String getData(Integer number) {
       if (number%5 ==0 || String.valueOf(number).contains("5")){
            return"fizz";
        }else {
            return String.valueOf(number);
        }
    }
}
