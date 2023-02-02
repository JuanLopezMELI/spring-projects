package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        HashMap<String,String> participante = new HashMap<>();
        participante.put("dni","1234567890");
        participante.put("nombre","pepito");
        participante.put("apellido","perez");
        participante.put("edad","20");
        participante.put("celular","3115556677");
        participante.put("nro. emergencia","3224445566");
        participante.put("grupo sanguineo","O+");

        Map<String, List<Integer>> precioChico = new HashMap<>();
        precioChico.put("precio", Arrays.asList(1300,1500));
        Map<String, List<Integer>> precioMedio = new HashMap<>();
        precioMedio.put("precio", Arrays.asList(2000,2300));
        Map<String, List<Integer>> precioAvanzado = new HashMap<>();
        precioAvanzado.put("precio", Arrays.asList(2800));

        HashMap<String,List<Map>> participantesChico = new HashMap<>();
        participantesChico.put("participantes",Arrays.asList(participante,participante));
        HashMap<String,List<Map>> participantesMedio = new HashMap<>();
        participantesMedio.put("participantes",Arrays.asList(participante));
        HashMap<String,List<Map>> participantesAvanzado = new HashMap<>();
        participantesAvanzado.put("participantes",Arrays.asList(participante));

        Map<String,Map> categorias = new HashMap<>();
        System.out.println(participante);
        System.out.println(precioChico);
        System.out.println(participantesChico);
    }
}
