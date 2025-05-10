package com.iliasse.presentation;

import com.iliasse.dao.IDao;
import com.iliasse.metier.IMetier;
import com.iliasse.metier.MetierImpl;

public class Presentation {

    public static void main(String[] args)
    {
        try{
            //Instanciation dynamique
            Class<IDao> clazz = (Class<IDao>)Class.forName("com.iliasse.dao.DaoImpl");
            IDao dao = clazz.getConstructor().newInstance();

            IMetier metier = new MetierImpl(dao);
            System.out.println("La température est égale à : " + metier.calcul());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
