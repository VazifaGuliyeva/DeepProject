package org.example;

import org.example.service.DilManager;
import org.example.service.TexnologiyaManager;

public class Main {
    public static void main(String[] args) {
        TexnologiyaManager manager=new TexnologiyaManager();
        System.out.println(manager.getAll());

        DilManager manager2=new DilManager();
        System.out.println(manager2.getAll());

    }
}