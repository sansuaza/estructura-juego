import java.util.ArrayList;

public class Aplication {
    public static void main(String[] args) {
        AdivinaValor adivinaValor = new AdivinaValor();
        System.out.println("Inicio de la construccion de la estructura");

            Estructura estructura = new Estructura(999, 6);
            System.out.println(estructura.ownToString());
        /*ArrayList<Integer> valoresUsados = new ArrayList<>();
        valoresUsados.add(1);
        valoresUsados.add(7);
        valoresUsados.add(3);
        valoresUsados.add(8);*/
        //System.out.println(adivinaValor.imprimirEstructura(adivinaValor.construirEstructura(4)));
    }
}
