import java.util.ArrayList;

public class Operacion {
    ArrayList<Operando> operandos;
    final static int NUM_POSIBLES = 20;
    int RESULTAD0;
    ArrayList<Integer> usadosGlobales = new ArrayList<>();

    public Operacion(int cantOperandos, ArrayList<Integer> numUsados){
        usadosGlobales.addAll(numUsados);
        operandos = new ArrayList<>();
        build(cantOperandos, numUsados);
        RESULTAD0 = hacerOperacion();
    }

    public Operacion(int cantOperandos, ArrayList<Integer> numUsados, int valorInicial){
        //Constructor hacer la primera operacion de la estructura.
        operandos = new ArrayList<>();
        build(cantOperandos, numUsados, valorInicial);
        RESULTAD0 = hacerOperacion();
    }

    public void build(int cantOperandos, ArrayList<Integer> enterosUsados){
        //0perador 0 => no hay operador porque es el ultimo elemento
        //Operador 1 => resta
        //Operador 2 => suma
        for (int i = 0; i < cantOperandos; i++) {
            if(i == cantOperandos - 1){
                int valor = getNewValor();
                enterosUsados.add(valor);
                addOperando(new Operando(valor, 0));
            }else {
                double valorUsado = obtenerValorUsado();
                removeUsado((int)valorUsado);
                double operador = Math.random() * 2 + 1;
                addOperando(new Operando((int) valorUsado, (int) operador));
            }
        }
    }

    public void build(int cantOperandos, ArrayList<Integer> enterosUsados, int valorInicial){
        for (int i = 0; i<cantOperandos; i++){
            if(i == 0) {
                double operador = Math.random() * 2 + 1;
                addOperando(new Operando(valorInicial, (int) operador));
                enterosUsados.add(valorInicial);
            }
            else{
                double valor = getNewValor();
                addOperando(new Operando((int) valor, 0));
                enterosUsados.add((int)valor);
            }
        }
    }

    private int obtenerValorUsado(){
        boolean noEncontrado = true;
        int retornoTentativo=0;
        while(noEncontrado){
                double i = Math.random() * usadosGlobales.size();
                retornoTentativo = usadosGlobales.get((int) i);
                if (!containsValue(retornoTentativo)) noEncontrado = false;
        }
        return retornoTentativo;
    }

    private String impresion(ArrayList<Operando> op){
        String retorno = "";
        for (Operando ope: op) {
            retorno += ope.valor+", ";
        }
        return retorno;
    }

    public boolean containsValue(int value){
        for (Operando operando : operandos) {
            if(operando.getValor() == value) return true;
        }
        return false;
    }

    public int getNewValor(){
        boolean noEncontrado = true;
        int retorno = 0;
        while (noEncontrado){
            double valor = Math.random()*NUM_POSIBLES +1;
            if(!containsValue((int) valor)) {
                noEncontrado = false;
                retorno = (int) valor;
            }
        }
        return retorno;
    }

    public void removeUsado(int valToRem){
        for (int i = 0; i <usadosGlobales.size(); i++) {
            if (usadosGlobales.get(i) == valToRem){
                usadosGlobales.remove(i);
                break;
            }
        }
    }

    public void addOperando(Operando op){
        operandos.add(op);
    }

    public ArrayList<Operando> getOperandos() {
        return operandos;
    }

    public void setOperandos(ArrayList<Operando> operandos) {
        this.operandos = operandos;
    }

    public String ownToString(){
        String retorno = "(";
        for (Operando op : operandos) {
            String valor = String.valueOf(op.valor);
            String signo = " ";
            if (op.operador == 1) signo += "- ";
            if (op.operador == 2) signo += "+ ";
            if (op.operador == 0) signo += "= ";
            retorno += valor + signo;
        }
        return retorno+ RESULTAD0+")";
    }

    public int hacerOperacion(){
        ArrayList<Operando> aux = new ArrayList<>();
        aux.addAll(operandos);
        int retorno = aux.get(0).valor;
        int myOp= aux.get(0).getOperador();
        aux.remove(0);
        for (Operando op : aux) {
            int valor = op.valor;
            if (myOp == 1) retorno -= valor;
            if (myOp == 2) retorno += valor;
            myOp = op.operador;
        }
        return retorno;
    }
}
