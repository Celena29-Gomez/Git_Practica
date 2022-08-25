//Mi clase en java
public class HolaMundo {
    public static void main (String args[]){
        //Se definio una variable de tipo entero
        int miVariableEntera = 100;
        System.out.println(miVariableEntera);
        //Se modifico el valor de la variable
        miVariableEntera = 346;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //Var - Inferencia de tipos en Java
        var miVariableEntera2 = 48;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Celena la mejor";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVarible = 2;
        var $miVarieble = 3;
        // var áVariable = 10; no se recomienda utilizar 
        // var #miVariable = 2; no se permite utilizar caracteres especiales
    }
}
