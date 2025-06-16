//Verifica que al avanzar y retroceder en el plano cartesiano se llegue nuevamente al punto inicial 

public class PlanoCartesiano {
    public static boolean isValidWalk(char[] walk) {
        // Verificar que la longitud del array sea exactamente 10
        if (walk.length != 10) {
            return false;
        }
        
        // Coordenadas iniciales
        int x = 0;
        int y = 0;
        
        // Procesar cada dirección en el array
        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
                default:
                    // Si se encuentra un carácter no válido
                    return false;
            }
        }
        
        // Verificar si hemos regresado al punto de inicio
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        char[] walk1 = {'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's'};
        char[] walk2 = {'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n'};
        char[] walk3 = {'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e'};
        
        System.out.println(isValidWalk(walk1)); // true
        System.out.println(isValidWalk(walk2)); // false
        System.out.println(isValidWalk(walk3)); // false
    }
}
