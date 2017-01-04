package com.junqua.drawer;

/**
 * Created by Niokniok on 2016-12-28.
 */

public class DrawerData {

    private int icon;
    private String name;
    private Class target;

    public DrawerData(String name, int icon, Class target){
        this.icon = icon;
        this.name = name;
        this.target = target;
    }

    public String getName(){
        return name;
    }

    public int getIcon(){
        return icon;
    }

    public Class getTarget(){ return target;}
}


