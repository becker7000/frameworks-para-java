package com.cst.struts.app.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.logging.Logger;

public class AuditoriaInterceptor implements Interceptor {

    private static final Logger logger = Logger.getLogger(AuditoriaInterceptor.class.getName());

    @Override
    public void destroy() {
        // Cleanup code if needed
    }

    @Override
    public void init() {
        // Initialization code if needed
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        // Registrar información antes de ejecutar la acción
        String nombreAction = invocation.getInvocationContext().getName();
        logger.info(String.format(
                """
                    
                    +--------------------------------------------------------------+
                    | Iniciando accion:  %s
                    +--------------------------------------------------------------+
               
                """,nombreAction));

        long tiempoInicio = System.currentTimeMillis();

        // Continuar con la invocación de la acción
        String resultado = invocation.invoke();

        long tiempoFinal = System.currentTimeMillis();
        long duracion = tiempoFinal - tiempoInicio;

        // Registrar información después de ejecutar la acción
        logger.info(String.format(
                """
                    
                    +--------------------------------------------------------------+
                    | Accion completada:  %s en %d milisegundos 
                    +--------------------------------------------------------------+
               
                """,nombreAction,duracion));

        return resultado;
    }
}
