/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.IDAO;
import OverbookPolicy.Aeronave;
import OverbookPolicy.OverbookPolicy;
import OverbookPolicy.Passageiro;
import OverbookPolicy.Voo;
import java.util.List;
import DAO.PassageiroDAO;
import DataServices.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pazak
 */
public class VooDAO implements IDAO<Voo> {

    private Passageiro passageiro;
    private Aeronave aeronave;
    private OverbookPolicy ovbp;

    @Override
    public void save(Voo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Voo getById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<Voo> list() { 
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
    

       

        @Override
        public void remove
        (Voo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void update
        (Voo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
       
    public List<Passageiro> list2() {
               
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Passageiro> result = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM passageiro");
            rs = stmt.executeQuery();
                    
            while (rs.next()) {
                
                Passageiro a = new Passageiro();
                
                a.setNome(rs.getString("nome"));
                a.setCategoria(rs.getString("categoria"));
                
                result.add(a);
            }
        } catch (SQLException ex){
           throw new RuntimeException("Erro ao listar passageiros", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }return result;
        
    }
    
    public void save2(){
        
    }

    }
