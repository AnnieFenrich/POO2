/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesExcluidas;

import java.util.List;

/**
 *
 * @author pazak
 */
public interface IPassageiro<P> {
    
       
    public void save(P p);
    
    public P getById(long id);
    
    public List<P> list();
    
    public void remove(P p);
    
    public void update(P p);
    
}
