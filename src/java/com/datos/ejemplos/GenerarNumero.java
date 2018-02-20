package com.datos.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GenerarNumero {
     Calendar c2;
     ArrayList<String> meses;
    public GenerarNumero() {
        c2 = new GregorianCalendar();
        meses = new ArrayList(Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"));
    }

    public String numeros() {
        String inicio = null;
        inicio = String.valueOf(c2.get(Calendar.YEAR));
        inicio= inicio.substring(2)+meses.get(c2.get(Calendar.MONTH))+"-";
        return inicio;
    }

    public static void main(String[] args) {
        GenerarNumero g = new GenerarNumero();
        
        
    }
}
