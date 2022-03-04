/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.tailieuDao;
import java.util.List;
import model.tailieu;

/**
 *
 * @author Admin
 */
public class tailieuService {
    private tailieuDao tlDao;
    
    public tailieuService(){
            tlDao = new tailieuDao(); 
    }
    
    public List<tailieu> getAll(){
            return tlDao.getAll();
    }
}
