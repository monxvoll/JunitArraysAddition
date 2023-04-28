import java.util.Arrays;

public class SumaArreglos {

    public String arreglos( ) {
        int[] arregloUno = {1, 2, 3, 4};
        int[] arregloDos = {1, 1, 1, 1};
        int[] arregloSuma = new int[arregloUno.length];

        for (int i = 0; i < arregloUno.length; i++) {
            arregloSuma[i] = arregloUno[i] + arregloDos[i];

        }
        return  Arrays.toString(arregloSuma);

    }
    public int suma ( int NumeroA, int NumeroB ) {
        int resultado = NumeroA + NumeroB;
        return resultado;
    }
    public int multiplicacion ( int NumeroA, int NumeroB ) {
        int resultado = NumeroA * NumeroB;
        return resultado;
    }
}
