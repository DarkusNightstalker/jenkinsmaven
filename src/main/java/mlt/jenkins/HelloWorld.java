package mlt.jenkins;


import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        for (int j = 0; j < 30; j++) {
            for (int i = 0; i <25; i++) {
                System.out.println("Contador :" +(i+1)*(j+1));
            }

        }
        final int maxWidth = 8;
        System.out.println(StringUtils.abbreviate("HOLA SOY UNA MCADENA QUE SERA ABREVIADA",maxWidth));
    }
}
