package com.cst.frameworks.app.service;

import com.cst.frameworks.app.model.Persona;

public class EditarServiceEnMemoria implements EditarService {

    private static Persona persona;
    private static String[] modelosDeCoche = {"Ford", "Nissan"};

    static {
        persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Rodriguez");
        persona.setDeporte("baloncesto");
        persona.setGenero("masculino");
        persona.setResidencia("JAL");
        persona.setMayorDe18(true);
        persona.setModelosDeCoche(modelosDeCoche);
    }

    public Persona obtenerPersona() {
        return EditarServiceEnMemoria.persona;
    }

    public void guardarPersona(Persona persona) {
        EditarServiceEnMemoria.persona.setNombre(persona.getNombre());
        EditarServiceEnMemoria.persona.setApellido(persona.getApellido());
        EditarServiceEnMemoria.persona.setDeporte(persona.getDeporte());
        EditarServiceEnMemoria.persona.setGenero(persona.getGenero());
        EditarServiceEnMemoria.persona.setResidencia(persona.getResidencia());
        EditarServiceEnMemoria.persona.setMayorDe18(persona.esMayorDe18());
        EditarServiceEnMemoria.persona.setModelosDeCoche(persona.getModelosDeCoche());
    }

}
