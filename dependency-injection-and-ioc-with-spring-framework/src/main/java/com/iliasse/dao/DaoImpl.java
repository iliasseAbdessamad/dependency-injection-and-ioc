package com.iliasse.dao;


import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao{

    public double getData(){
        System.out.println("Data from Database");
        return 25d;
    }
}
