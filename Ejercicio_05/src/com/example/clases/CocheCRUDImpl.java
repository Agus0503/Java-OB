package com.example.clases;
import com.example.interfaces.CocheCRUD;
import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    private List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        //coches.add(coche);
        System.out.println("Save successful");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Found objects");
        return  null;
        //return coches;
    }

    @Override
    public void delete(Coche coche) {
        //coches.remove(coche);
        System.out.println("Object deleted");
    }
}
