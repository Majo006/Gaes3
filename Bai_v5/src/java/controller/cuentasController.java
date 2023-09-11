/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CuentasDao;
import entity.Cuentas;

import javax.faces.bean.SessionScoped;

/**
 *
 * @author mariSa
 */
@ManageBean(name="cuentas")
@SessionScoped
public class cuentasController {
    private String nombre;
    private String login;
    private String password;
    
    public String validaLogin()
    {
        CuentasDao CUENTAS= new CuentasDao();
        Cuentas c = CUENTAS.validarCuenta(login, password);
        if(c!=null)
        {
         nombre = c.getNombre();
         return "index_cliente";         
        }
        else
            return "login";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
