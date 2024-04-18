import java.util.Scanner;





public class Contador {

    public static void main (String[] args) throws ParametrosInvalidosException {

        System.out.println("Digite o primeiro paramêtro:" );
        int num1 = digitaParametro();


        System.out.println("Digite o segundo paramêtro:" );
        int num2 = digitaParametro();

        try{contar(num1, num2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");        }



    }

    static int digitaParametro() {
        Scanner parametro = new Scanner(System.in);
        int numero = parametro.nextInt();
        return numero;

    }

    static void contar(int num1, int num2 ) throws ParametrosInvalidosException {
        if (num1 >= num2){
            throw new ParametrosInvalidosException();
        }
            int quantidadeDeIteracoes = num2 - num1;
            for(int contador = 0; contador < quantidadeDeIteracoes; contador++){
                System.out.println("Imprimindo o número " + (contador+1));
            }


    }

    }





