import java.util.ArrayList;

public class AdivinaValor {


    public static void main(String[] args) {

    }

    public ArrayList<Operando> contruirOperacion(int cantidadNodos) {
        //0perador 0 => no hay operador porque es el ultimo elemento
        //Operador 1 => resta
        //Operador 2 => suma
        ArrayList<Operando> operacion = new ArrayList<Operando>();
        for (int i = 0; i < cantidadNodos; i++) {
             if(i == cantidadNodos - 2) operacion.add(new Operando((int) Math.random()*9, 0));
             else operacion.add(new Operando((int) Math.random()*9, (int) Math.random()*1 + 1));
        }
        return operacion;
    }

    public void contruirEstructura(int numNiveles){
        //se va a hacer uso de espacio en memoria de cada uno de los nodos
        //para tener una mejor consistencia en el manejo de los datos
        final int numBase = 2;
        ArrayList<ArrayList<Operando>> estructura = new ArrayList<ArrayList<Operando>>();
        for (int i = 0; i < numNiveles; i++) {

        }
    }
}
