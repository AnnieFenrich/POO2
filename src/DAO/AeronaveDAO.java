/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import OverbookPolicy.Aeronave;
import DataServices.ConnectionFactory;
import Interfaces.IDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author pazak
 */
public class AeronaveDAO implements IDAO<Aeronave>{
    
        
          
    @Override
    public void save(Aeronave aviao) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO aeronave (modelo, capacidade) values (?, ?)");
            stmt.setString(1, aviao.getModelo());
            stmt.setInt(2, aviao.getCapacidade());  
            
            stmt.executeUpdate();  
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!"); 
        }catch (SQLException ex){
            throw new RuntimeException("Erro ao salvar!", ex);
        } finally {
           ConnectionFactory.closeConnection(con, stmt);
        }
      }

 
    
    
    @Override
    public void update(Aeronave a1) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE aeronave SET modelo = ?, capacidade = ? WHERE id = ?");
            stmt.setString(1, a1.getModelo());
            stmt.setInt(2, a1.getCapacidade()); 
            stmt.setInt(3, a1.getId());            
            
            stmt.executeUpdate();  
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!"); 
        }catch (SQLException ex){
            throw new RuntimeException("Erro ao atualizar!", ex);
        } finally {
           ConnectionFactory.closeConnection(con, stmt);
        }
     }        
    

    @Override
    public Aeronave getById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aeronave> list() {
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Aeronave> aeronaves = new ArrayList();
        
        try{
        stmt = con.prepareStatement("SELECT * FROM aeronave");
        rs = stmt.executeQuery();
        
        while (rs.next()){
            
            Aeronave a = new Aeronave();
            
            a.setId(rs.getInt("id"));
            a.setModelo(rs.getString("modelo"));
            a.setCapacidade(rs.getInt("capacidade"));
            aeronaves.add(a);
                       
        }        
        
        }catch (SQLException ex){
            throw new RuntimeException("Errinho", ex);
        }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return aeronaves;
    }

    @Override
    public void remove(Aeronave aremover) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM aeronave WHERE id = ?");
            stmt.setInt(1, aremover.getId());            
            
            stmt.executeUpdate();  
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!"); 
        }catch (SQLException ex){
            throw new RuntimeException("Erro ao excluir!", ex);
        } finally {
           ConnectionFactory.closeConnection(con, stmt);
        }
     }                
}
