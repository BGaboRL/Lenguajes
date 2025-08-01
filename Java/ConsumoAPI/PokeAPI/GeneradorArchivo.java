import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorArchivo {
    public void guardarJson(Pokemon pokemon) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pokemon.name() + ".json");
        escritura.write(gson.toJson(pokemon));
        escritura.close();
    }
}

