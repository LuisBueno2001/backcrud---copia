package com.backcrud.backcrud.entity;

import java.io.IOException;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@JsonComponent
public class ClasesAlumnoSerializer extends StdSerializer<ClasesAlumno>{

    public ClasesAlumnoSerializer(){
        super(ClasesAlumno.class);
    }

    @Override
    public void serialize(ClasesAlumno clasesalumno, JsonGenerator gen, SerializerProvider provider) 
    throws IOException {
        gen.writeStartObject();
        gen.writeNumberField("id", clasesalumno.getId());
        gen.writeObjectField("alumno_id", clasesalumno.getAlumno());
        gen.writeObjectField("clases_id", clasesalumno.getClases());
        gen.writeEndObject();
    }
}
