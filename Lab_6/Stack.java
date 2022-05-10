package com.company;

import java.util.ArrayList;

public class Stack extends ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize(){
        return super.size();
    }

    public Object pop() {
        Object el = get(getSize()-1);
        return remove(el);
    }

    public Object push (Object el ){
        return add(el);
    }
}