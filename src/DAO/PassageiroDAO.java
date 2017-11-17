/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DataServices.ConnectionFactory;
import Interfaces.IDAO;
import OverbookPolicy.Passageiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author pazak
 */
public class PassageiroDAO implements IDAO<Passageiro>{
    
    
    @Override
    public void save(Passageiro psg) {
        
        Connection con = ConnectionFactory.getConnection();  
        PreparedStatement stmt = null;
        try{      
            stmt = con.prepareStatement("INSERT INTO passageiro (nome, cpf, categoria) values (?, ?, ?)");
            stmt.setString(1, psg.getNome());
            stmt.setString(2, psg.getCpf());
            stmt.setString(3, psg.getCategoria());
            
            stmt.executeUpdate();  
            
            //JOptionPane.showMessageDialog(null, "Salvo com Sucesso!"); 
        }catch (SQLException ex){
            throw new RuntimeException("Erro ao salvar!", ex);
        } finally {
           ConnectionFactory.closeConnection(con, stmt);
        }
      }

    @Override
    public Passageiro getById(long id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
//        Passageiro a = null;
//        try{
//            a = new Passageiro();
//            Statement sta = connection.createStatement();
//                               
//            ResultSet elements = sta.executeQuery("SELECT * from passageiro where id =" + id);
//            if (elements != null){
//                elements.first();
//                    a.setNome(elements.getString("nome"));
//                    a.setCpf(elements.getString("cpf"));
//                    a.setCategoria(elements.getInt("categoria"));
//                    a.setCategoria(elements.get);
//            }
//            
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally {
//            conexao.fecharConexao();
//        }
//        
      
    }

    @Override
    public  List<Passageiro> list() {
               
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Passageiro> result = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM passageiro");
            rs = stmt.executeQuery();
                    
            while (rs.next()) {
                
                Passageiro a = new Passageiro();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setCpf(rs.getString("cpf"));
                a.setCategoria(rs.getString("categoria"));
                
                result.add(a);
            }
        } catch (SQLException ex){
           throw new RuntimeException("Erro ao listar passageiros", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }return result;
        
    }

    @Override
    public void remove(Passageiro psg) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
          stmt = con.prepareStatement("DELETE FROM passageiro WHERE id = ?");
          stmt.setInt(1, psg.getId());
         
          stmt.executeUpdate();
          
          JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");               
        } catch (SQLException ex){
            throw new RuntimeException("Erro ao excluir!", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
    @Override
    public void update(Passageiro psg) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE passageiro SET nome = ?, cpf = ?, categoria = ? WHERE id = ?");
            stmt.setString(1, psg.getNome());
            stmt.setString(2, psg.getCpf()); 
            stmt.setString(3, psg.getCategoria());
            stmt.setInt(4, psg.getId());            
            
            stmt.executeUpdate();  
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!"); 
        }catch (SQLException ex){
            throw new RuntimeException("Erro ao atualizar!", ex);
        } finally {
           ConnectionFactory.closeConnection(con, stmt);
        }
     }        
                
}

   

