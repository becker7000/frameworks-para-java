package com.cst.struts.app.model;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.HashMap;
import java.util.Map;

public class ValueStackTestAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String correo;
    private int longitudStack;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getLongitudStack() {
        return longitudStack;
    }

    public void setLongitudStack(int longitudStack) {
        this.longitudStack = longitudStack;
    }

    @Override
    public String execute() throws Exception {

        ValueStack stack = ActionContext.getContext().getValueStack();

        Map<String,String> mensajes = new HashMap<>();
        mensajes.put("mensaje1","Atencion a clientes: 5512345678");
        mensajes.put("mensaje2","Comunicate con nosotros para mas informacion");
        stack.push(mensajes);

        // Guardamos el tamaño final del stack
        longitudStack = stack.size();

        return SUCCESS;
    }
}
