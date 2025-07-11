import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConsultaPokemon consulta = new ConsultaPokemon();
        System.out.println("Escribe el numero de la pokedex del pokemon que quieres consultar:");
        int pokeNum = sc.nextInt();

        try {
            Pokemon pokemon =  consulta.buscarPokemon(pokeNum);

            System.out.println("Nombre: " + pokemon.name());
            System.out.println("Numero Pokedex: " + pokemon.id());

            System.out.print("Tipos: ");
            for (int i = 0; i < pokemon.types().size(); i++) {
                System.out.print(pokemon.types().get(i).type().name());
                if (i < pokemon.types().size() - 1) System.out.print(", ");
            }

            GeneradorArchivo generador = new GeneradorArchivo();
            generador.guardarJson(pokemon);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
