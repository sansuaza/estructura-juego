import java.util.ArrayList;

public class AdivinaValor {


    public static void main(String[] args) {

    }
    public void contruirEstructura(int numNiveles){
        //se va a hacer uso de espacio en memoria de cada uno de los nodos
        //para tener una mejor consistencia en el manejo de los datos
        final int numBase = 2;
        ArrayList<ArrayList<Operando>> estructura = new ArrayList<ArrayList<Operando>>();
        for (int i = 1; i <= numNiveles; i++) {
            switch (i){
                case 0: estructura.add(contruirOperacion(numBase, null));
                default: estructura.add(contruirOperacion(numBase+i, obtenerUltimoOperando(estructura)));
            }
        }
    }

    public ArrayList<Operando> contruirOperacion(int cantidadNodos, Operando primerNodo) {
        //0perador 0 => no hay operador porque es el ultimo elemento
        //Operador 1 => resta
        //Operador 2 => suma
        ArrayList<Operando> operacion = new ArrayList<Operando>();
        for (int i = 0; i < cantidadNodos; i++) {
            if(primerNodo != null && i == 0) operacion.add(primerNodo);
            if(i == cantidadNodos - 2) operacion.add(new Operando((int) Math.random()*9, 0));
            else operacion.add(new Operando((int) Math.random()*9, (int) Math.random()*1 + 1));
        }
        return operacion;
    }

    public Operando obtenerUltimoOperando(ArrayList<ArrayList<Operando>> estructura){
        ArrayList<Operando> ultimaOperacion = estructura.get(estructura.size()-1);
        Operando ultimoOperando             = ultimaOperacion.get(ultimaOperacion.size()-1);

        return ultimoOperando;
    }
}
