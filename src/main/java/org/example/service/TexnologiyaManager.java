package org.example.service;

import org.example.entity.Texnologiya;

import java.util.ArrayList;
import java.util.List;

public class TexnologiyaManager implements TexnologiyaService {
    static List<Texnologiya>texnologiyas=new ArrayList<>();
    static{
        texnologiyas.add(new Texnologiya("JSP"));
        texnologiyas.add(new Texnologiya("React"));
        texnologiyas.add(new Texnologiya("Lavarel"));


    }
    @Override
    public Texnologiya getTexnologiyaById(Integer id) {
        return texnologiyas.get(id);
    }
    @Override
    public void deleteTexnologiyaById(Integer id) {
        texnologiyas.remove(id);
    }
    @Override
    public List<Texnologiya> getAll() {
        return texnologiyas;
    }
}
