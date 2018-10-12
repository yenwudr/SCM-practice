package com;

/**
 * 规则抽象接口
 */
public  abstract  class AbstractRule implements Rule {

    @Override
    public void printOut(Integer[] numbers) {
        if (numbers==null || numbers.length==0){
            return ;
        }
        for (Integer number : numbers){
            String data = getData(number);
            System.out.println(data);
        }
    }

    public abstract String getData(Integer number);
}
