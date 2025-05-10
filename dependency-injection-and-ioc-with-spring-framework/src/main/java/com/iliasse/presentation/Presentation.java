package com.iliasse.presentation;


import com.iliasse.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.iliasse");

        IMetier metier = (IMetier)appContext.getBean("metier");
        System.out.println("La température est égale à : " + metier.calcul());
    }
}
