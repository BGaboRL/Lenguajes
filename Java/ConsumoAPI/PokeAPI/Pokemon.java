import java.util.List;

public record Pokemon(String name, int id, List<TipoSlot> types) {
}
record TipoSlot(int slot, Tipo type) {}
record Tipo(String name, String url) {}