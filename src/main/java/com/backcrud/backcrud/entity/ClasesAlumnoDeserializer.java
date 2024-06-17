package com.backcrud.backcrud.entity;

import java.io.IOException;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@JsonComponent
public class ClasesAlumnoDeserializer extends StdDeserializer<ClasesAlumno> {

    public ClasesAlumnoDeserializer() {
        this(null);
    }

    public ClasesAlumnoDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public ClasesAlumno deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);

        Long alumno_id = ((Long) node.get("alumno_id").asLong());
        Long clase_id = ((Long) node.get("clase_id").asLong());

        return new ClasesAlumno(new Alumnos(alumno_id), new Clase(clase_id));
    }
}