import java.util.ArrayList;

public class Estructura {
    ArrayList<Operacion> operaciones;

    public Estructura(int valorInicial, int niveles){
        operaciones = new ArrayList<>();
        build(niveles);
    }

    private void build(int numNiveles){
        final int numBase = 2;
        ArrayList<Integer> enterosUsados = new ArrayList<Integer>();
        for (int i = 0; i < numNiveles - 1; i++) {
            switch (i){
                case 0: operaciones.add(new Operacion(numBase, enterosUsados));
                default: operaciones.add(new Operacion(numBase+i, enterosUsados));
            }
        }
    }

    public ArrayList<String> toStringTemp(){
        ArrayList<String> estructuraToString = new ArrayList<>();
        for (Operacion operacion: operaciones) {
            String operacionToString = "";
            for (Operando operando: operacion.getOperandos()) {
                if(operando.operador == 0) operacionToString += operando.valor;
                if(operando.operador == 1) operacionToString += operando.valor+" - ";
                if(operando.operador == 2) operacionToString += operando.valor+" + ";
            }
            estructuraToString.add(operacionToString);
        }
        return estructuraToString;
    }
}
