import java.util.ArrayList;

public class AdivinaValor {

    /*public ArrayList<Operacion> construirEstructura(int numNiveles){
        final int numBase = 2;
        ArrayList<Operacion> estructura = new ArrayList<Operacion>();
        ArrayList<Integer> enterosUsados = new ArrayList<Integer>();
        for (int i = 0; i < numNiveles - 1; i++) {
            switch (i){
                case 0: estructura.add(contruirOperacion(numBase, enterosUsados));
                default: estructura.add(contruirOperacion(numBase+i, enterosUsados));
            }
        }
        return estructura;
    }*/

    /*public Operacion contruirOperacion(int cantidadNodos, ArrayList<Integer> enterosUsados) {
        //0perador 0 => no hay operador porque es el ultimo elemento
        //Operador 1 => resta
        //Operador 2 => suma
        Operacion operation = new Operacion();
        for (int i = 0; i < cantidadNodos; i++) {
            if(i == cantidadNodos - 1){
                double valor = Math.random()*9 +1;
                operation.addOperando(new Operando((int) valor, 0));
            }else {
                double valorUsado = obtenerValorUsado(enterosUsados, operation);
                double operador = Math.random() * 2 + 1;
                if (i == 0) {
                    Operando primerOperando = new Operando((int) valorUsado, (int) operador);
                    operation.addOperando(primerOperando);
                } else {
                    operation.addOperando(new Operando((int) valorUsado, (int) operador));
                }
            }
        }
        return operation;
    }*/
    
    /*public ArrayList<String> imprimirEstructura(ArrayList<Operacion> estructura){
        ArrayList<String> estructuraToString = new ArrayList<>();
        for (Operacion operacion: estructura) {
            String operacionToString = "";
            for (Operando operando: operacion.getOperandos()) {
                if(operando.operador == 0) operacionToString += operando.valor;
                if(operando.operador == 1) operacionToString += operando.valor+" - ";
                if(operando.operador == 2) operacionToString += operando.valor+" + ";
            }
            estructuraToString.add(operacionToString);
        }
        return estructuraToString;
    }*/

    /*private int obtenerValorUsado(ArrayList<Integer> valoresUsados, Operacion operacion){
        boolean noEncontrado = true;
        int retornoTentativo=0;
        while(noEncontrado){
            retornoTentativo = valoresUsados.get((int) Math.random() * valoresUsados.size());
            if(!operacion.containsValue(retornoTentativo)) return retornoTentativo;
        }
        return retornoTentativo;
    }*/
}
