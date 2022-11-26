package org.example.service;

import org.example.entity.Dil;

import java.util.ArrayList;
import java.util.List;

public class DilManager implements DilService{
    static List<Dil>diller=new ArrayList();
    static{
        diller.add(new Dil("Java"));
        diller.add(new Dil("Html"));
        diller.add(new Dil("Css"));
    }
    @Override
    public Dil getDilById(Integer id) {
        return diller.get(id);
    }
    @Override
    public void deleteDilById(Integer id) {
        diller.remove(id);

    }
    @Override
    public List<Dil> getAll() {
        return diller;
    }
}
