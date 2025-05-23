package com.iliasse.metier;

import com.iliasse.dao.IDao;
import org.springframework.stereotype.Service;

@Service("metier")
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
