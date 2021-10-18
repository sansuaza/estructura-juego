public class Operando {
    int valor;
    int operador;

    public Operando(int valor, int operador){
        this.valor = valor;
        //operador = 1 es resta
        //operador = 2 es suma
        this.operador = operador;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
