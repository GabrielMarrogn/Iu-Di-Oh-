import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            StringBuilder st = new StringBuilder();

            // representa a quantidades de atributos que uma carta tem
            int qtdAtributos = sc.nextInt();

            // Quantas cartas Marcos e Leonardo possuem no deck
            int qtdCartaM = sc.nextInt();
            int qtdCartaL = sc.nextInt();

            // Arrays para guarda as cartas
            String[] marcosC = new String[qtdCartaM];
            String[] leonardoC = new String[qtdCartaL];

            // Dois for para colocar as cartas
            for (int i = 0; i < qtdCartaM; i++) {
                for (int k = 0; k < qtdAtributos; k++) {
                    st.append(sc.nextInt());
                    st.append(" ");
                }
                marcosC[i] = st.toString();
                st.setLength(0);
            }

            for (int i = 0; i < qtdCartaL; i++) {
                for (int k = 0; k < qtdAtributos; k++) {
                    st.append(sc.nextInt());
                    st.append(" ");
                }
                leonardoC[i] = st.toString();
                st.setLength(0);
            }

            // Cartas que foram escolhidas
            int escolhidaM = sc.nextInt();
            int escolhidaL = sc.nextInt();

            // Atributo escolhido
            int atributoE = sc.nextInt();

            // carta que foi escolhida por Marcos
            String cartaAM = marcosC[escolhidaM - 1];
            String[] arrM = cartaAM.split(" ");
            int cartaFinalM = Integer.parseInt(arrM[atributoE - 1]);

            // carta que foi escolhida por Leonardo
            String cartaAL = leonardoC[escolhidaL - 1];
            String[] arrL = cartaAL.split(" ");
            int cartaFinalL = Integer.parseInt(arrL[atributoE - 1]);

            if (cartaFinalM > cartaFinalL) {
                System.out.println("Marcos");
            } else if (cartaFinalL > cartaFinalM) {
                System.out.println("Leonardo");
            } else if (cartaFinalM == cartaFinalL) {
                System.out.println("Empate");
            }

        }
        sc.close();

    }
}
