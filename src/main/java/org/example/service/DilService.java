package org.example.service;

import org.example.entity.Dil;

import java.util.ArrayList;
import java.util.List;

public interface DilService {
    Dil getDilById(Integer id);
    void deleteDilById(Integer id);
    List<Dil>getAll();


}
