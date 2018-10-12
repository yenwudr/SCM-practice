package com.impl;

import com.AbstractRule;

/**
 * 当数字是3 的倍数或者包括3 的输出fizz
 */
public class Rule3 extends AbstractRule {

    @Override
    public String getData(Integer number) {
       if (number%3 ==0 || String.valueOf(number).contains("3")){
            return"fizz";
        }else {
            return String.valueOf(number);
        }
    }
}
