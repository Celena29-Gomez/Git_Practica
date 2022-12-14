
public class EjemploTres {

    public static void main(String args[]) {
        /*
         Tipo primitivos enteros: byte, short, int, long
         */
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        
        short numeroShort = (short) 32768;
        System.out.println("numeroShort:" + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        
        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 922337203685477580L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo long:" + Long.MAX_VALUE);
        
    }
}
