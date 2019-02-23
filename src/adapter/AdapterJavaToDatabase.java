/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author nodira
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
    
    @Override
    public void update() {
        updateObject();
    }
    
    
}
