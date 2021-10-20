import java.util.ArrayList;

public class Aplication {
    public static void main(String[] args) {
        AdivinaValor adivinaValor = new AdivinaValor();
        System.out.println("Inicio de la construccion de la estructura");
        Operacion op = new Operacion(2, new ArrayList<Integer>(), 8);
        System.out.println(op.getOperandos().get(0).getValor());
        //System.out.println(adivinaValor.imprimirEstructura(adivinaValor.construirEstructura(4)));
    }
}
