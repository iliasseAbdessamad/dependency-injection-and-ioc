package com.iliasse.metier;

import com.iliasse.dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    public void setDao(IDao dao){
        this.dao = dao;
    }

    public double calcul(){
        return this.dao.getData();
    }
}
