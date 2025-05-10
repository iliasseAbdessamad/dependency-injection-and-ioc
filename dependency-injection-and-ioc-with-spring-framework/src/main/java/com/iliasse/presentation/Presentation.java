package com.iliasse.presentation;


import com.iliasse.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Presentation {

    public static void main(String[] args) {

        ApplicationContext appContext = new FileSystemXmlApplicationContext("context_config.xml");
        IMetier metier = (IMetier)appContext.getBean("metier");
        System.out.println("La température est égale à : " + metier.calcul());
    }
}
