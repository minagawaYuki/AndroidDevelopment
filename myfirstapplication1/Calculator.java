package com.example.myfirstapplication1;

import android.content.Intent;

import java.util.Stack;

public class Calculator {
    private Integer input;
    Stack stack = new Stack();

    public void setInput(StringBuilder input) {
        this.input = Integer.parseInt(String.valueOf(input));
    }

}
