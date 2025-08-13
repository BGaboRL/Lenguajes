import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EjemploStreams{
    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Brenda", "Luis", "Maria", "Fernanda", "Eric", "Genesys");
        nombres.stream()    //Convierte la lista a un flujo que permite aplicar operaciones funcionales
                .sorted()   //Ordena la lista alfabéticamente
                .limit(4)   //Limita la lista a los primeros 4 datos
                .filter(n -> n.startsWith("B")) //Filtra solo los datos que comienzan con "B"
                .map(String::toUpperCase)   //Los datos filtrados son convertidos a mayusculas
                .forEach(System.out::println);  //Imprime el/los resultados. Salida: ["BRENDA"]

        /***************** Ejemplo 2 ***********************/
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numerosPares = numeros.stream()   //Convierte "numeros" a un flujo
                                            .filter(n -> n % 2 == 0)    //Filtra los numeros pares
                                            .collect(Collectors.toList());  //Agrega o colecciona el resultado del filtro y los almacen como una lista nueva dentro de "numerosPares"
        System.out.println(numerosPares);   //Salida:[2,4,6,8,10]

        /***************** Ejemplo 3 ***********************/
        List<String> palabras = Arrays.asList("Java", "Stream", "Operaciones", "Intermedias");
        List<Integer> tamanios = palabras.stream()  //Convierte "palabras" a un flujo manipulable
                                        .map(s -> s.length())   //Transforma o mapea cada palabra en su longitud
                                        .collect(Collectors.toList());  //Agrega los resultados a una nueva lista "tamanios"
        System.out.println(tamanios);   //Salida: [4,6,11,11]

        /***************** Ejemplo 4 ***********************/
        List<String> nombres2 = Arrays.asList("Brenda", "Luis", "Maria", "Fernanda", "Eric", "Genesys");
        nombres2.stream()
            .forEach(nombre -> System.out.println("Hola " + nombre + "!")); //ForEach permiteejecutar una accion con cada elemento del stream
                                                                            //Ejemplo de salida: Hola Brenda!

        /***************** Ejemplo 5 ***********************/
        List<Integer> numeros2 = Arrays.asList(1,2,2,3,4,4,5,6,6,7,8,8,9,10,10);
        List<Integer> numerosPares2 = numeros2.stream()   //Convierte "numeros" a un flujo
                                            .filter(n -> n % 2 == 0)    //Filtra los numeros pares
                                            .collect(Collectors.toList());  //Agrega o colecciona el resultado del filtro y los almacen como una lista nueva dentro de "numerosPares"
        System.out.println(numerosPares2);   //Salida:[2,2,4,4,6,6,8,8,10,10]

        Set<Integer> unicosPares = numeros2.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toSet());   //Agrega los resultados a una SetList pero sin repetirlos
        System.out.println(unicosPares);    //Salida: [2,4,6,8,10]
    }
}