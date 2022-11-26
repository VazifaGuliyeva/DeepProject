package org.example.service;

import org.example.entity.Texnologiya;

import java.util.List;

public interface TexnologiyaService {
    Texnologiya getTexnologiyaById(Integer id);
    void deleteTexnologiyaById(Integer id);
    List<Texnologiya> getAll();
}
