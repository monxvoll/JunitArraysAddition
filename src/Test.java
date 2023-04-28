import junit.framework.TestCase;

import java.util.Arrays;

public class Test extends TestCase {

    private SumaArreglos sumaArreglos;
    public void escenery (){
        sumaArreglos = new SumaArreglos();
    }


    //test que compara la suma de los arreglos

    public void testArreglos() {
        escenery();
        int[] expectedArray ={2,3,4,5} ;
        assertEquals(Arrays.toString( expectedArray),sumaArreglos.arreglos());
    }


    //test que compara la suma de dos numeros
    public void testSuma(){
        escenery();
        assertTrue(sumaArreglos.suma(2,3)==(2+3));
    }

    //test que compara la multiplicacion de dos numeros

    public void testMultiplicacion(){
        escenery();
        assertEquals(8,sumaArreglos.multiplicacion(4,2));
    }
}

