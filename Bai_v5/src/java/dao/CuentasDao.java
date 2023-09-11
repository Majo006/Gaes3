/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Cuentas;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author maria
 */
public class CuentasDao {
    private final EntityManagerFactory emf;

    public CuentasDao(EntityManagerFactory emf) {
        this.emf = Persistence.createEntityManagerFactory("Bai_v5PU");
    }

    public CuentasDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Cuentas validarCuenta(String usuario, String password)
    {
        Cuentas cuentas;
        EntityManager em= emf.createEntityManager();
        String sql="SELECT c FROM Cuentas c WHERE c.cuentas=: cuentas AND c.contrase\u00f1a = :contrase\u00f1a";
        Query query = em.createNamedQuery(sql);
        query.setParameter("usuario", usuario);
        query.setParameter("password", password);
        
        cuentas = (Cuentas)query.getSingleResult();
       
        return cuentas;
    }
    
}
