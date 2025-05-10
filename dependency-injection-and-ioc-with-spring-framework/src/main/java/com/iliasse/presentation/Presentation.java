package com.iliasse.presentation;

import com.iliasse.dao.IDao;
import com.iliasse.dao.DaoImpl;
import com.iliasse.metier.IMetier;
import com.iliasse.metier.MetierImpl;

public class Presentation {

    public static void main(String[] args){
        IDao dao = new DaoImpl();

        /*  Injection de la dépendence IDao par instanciation statique */
        IMetier metier = new MetierImpl(dao);

        System.out.println("La température est égale à : " + metier.calcul());
    }
}
