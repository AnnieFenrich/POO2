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
public interface IVoo<V> {
    
    public void save(V v);
    
    public V getById(long id);
    
    public List<V> list();
    
    public void remove(V p);
    
    public void update(V p);
    
}
