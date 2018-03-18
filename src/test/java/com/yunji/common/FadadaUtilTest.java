package com.yunji.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by matth on 2018/3/17
 */
public class FadadaUtilTest {

    @Test
    public void uploadTemplate() {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}