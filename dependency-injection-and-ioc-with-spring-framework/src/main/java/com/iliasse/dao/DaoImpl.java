package com.iliasse.dao;

public class DaoImpl implements IDao{

    public double getData(){
        System.out.println("Data from Database");
        return 25d;
    }
}
