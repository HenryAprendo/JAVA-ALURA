package br.com.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        //Primer ejemplo
        byte[] bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");
        String sNuevo = new String(bytes, "windows-1252");
        System.out.println(sNuevo);

        //Segundo ejemplo
        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        sNuevo = new String(bytes, "windows-1252");
        System.out.println(sNuevo);

        //Caso especial
        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US_ASCII, ");
        sNuevo = new String(bytes, "windows-1252");
        System.out.println(sNuevo);
        
        /***
         * Si al obtener los bytes de un string con un determinado tipo de encoding ejemplo utf-8, si queremos obtener un nuevo string apartir de 
         * este byte, debemos pasar el mismo encoding o de lo contrario imprimira algo extraño como en el segundo ejemplo.
         */
        
        

    }

}