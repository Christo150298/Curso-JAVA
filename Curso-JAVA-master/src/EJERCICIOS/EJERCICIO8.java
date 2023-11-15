package EJERCICIOS;

public class EJERCICIO8 {
    public static void main(String[] args) {

        int contador = 0;
        int[] arrPrueba = {1,2,3,3,9,8,7,4,6,7,0,4,5};

        for (int i=0; i<arrPrueba.length;i++){
            for (int j=0; j<arrPrueba.length;j++){
                if (arrPrueba[i] == arrPrueba[j])
                    contador++;
            }
            System.out.print(contador + ",");
            contador = 0;
        }
    }
}
