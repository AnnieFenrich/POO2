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
public interface IAeronave<T> {
    
    public void save(T t);
    
    public T getById(long id);
    
    public List<T> list();
    
    public void remove(T t);
    
   // public void update(T t);
    
}
