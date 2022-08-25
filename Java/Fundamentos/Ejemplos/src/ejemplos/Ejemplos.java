 //Ejemplos concatenacion 

public class Ejemplos {

    public static void main(String args[]) {
        var usuario = "Ema";
        var titulo = "Ingeniera en sistemas";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 3;
        var b = 4;

        System.out.println(a + b); //Se realiza la suma de numeros
        System.out.println(a + b + usuario); //Evaluacion de izq a derecha realiza suma
        System.out.println(usuario + a + b); //Contexto cadena todo es una cadena
        System.out.println(usuario + (a + b)); //uso de parentesis modifica la proridad en la evaluacion

    }
}
