import java.util.ArrayList;

public class Operacion {
    ArrayList<Operando> operandos;

    public Operacion(int cantOperandos, ArrayList<Integer> numUsados){
        operandos = new ArrayList<>();
        build(cantOperandos, numUsados);
    }

    public Operacion(int cantOperandos, ArrayList<Integer> numUsados, int valorInicial){
        //Constructor hacer la primera operacion de la estructura.
        operandos = new ArrayList<>();
        build(cantOperandos, numUsados, valorInicial);
    }

    public void build(int cantOperandos, ArrayList<Integer> enterosUsados){
        //0perador 0 => no hay operador porque es el ultimo elemento
        //Operador 1 => resta
        //Operador 2 => suma
        for (int i = 0; i < cantOperandos; i++) {
            if(i == cantOperandos - 1){
                double valor = Math.random()*9 +1;
                addOperando(new Operando((int) valor, 0));
            }else {
                double valorUsado = obtenerValorUsado(enterosUsados);
                double operador = Math.random() * 2 + 1;
                if (i == 0) {
                    Operando primerOperando = new Operando((int) valorUsado, (int) operador);
                    addOperando(primerOperando);
                } else {
                    addOperando(new Operando((int) valorUsado, (int) operador));
                }
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
                double valor = Math.random()*9 +1;
                addOperando(new Operando((int) valor, 0));
                enterosUsados.add((int)valor);
            }
        }
    }

    private int obtenerValorUsado(ArrayList<Integer> valoresUsados){
        boolean noEncontrado = true;
        int retornoTentativo=0;
        while(noEncontrado){
            retornoTentativo = valoresUsados.get((int) Math.random() * valoresUsados.size());
            if(!containsValue(retornoTentativo)) return retornoTentativo;
            noEncontrado = false;
        }
        return retornoTentativo;
    }

    public boolean containsValue(int value){
        for (Operando operando : operandos) {
            if(operando.getValor() == value) return true;
        }
        return false;
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
}
