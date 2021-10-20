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
        for (int i = 0; i < numNiveles; i++) {
            switch (i){
                case 0: operaciones.add(new Operacion(numBase, enterosUsados, 8)); break;
                default: operaciones.add(new Operacion(numBase+i, enterosUsados));
            }
        }
    }

    public String ownToString(){
        String retorno = "";
        for (Operacion operacion : operaciones) {
            retorno+= operacion.ownToString()+"\n";
        }
        return retorno;
    }
}
