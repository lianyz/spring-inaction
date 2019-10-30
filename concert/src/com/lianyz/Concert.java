package com.lianyz;


public class Concert implements Performance {

    private String name;

    public Concert(String name){
        this.name = name;
    }

    @Override
    public void perform() {
        System.out.println("perform " + name + " concert ...");
    }
}
