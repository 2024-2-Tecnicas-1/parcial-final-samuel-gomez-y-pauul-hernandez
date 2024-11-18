package logicaNegocio;

public class Delfin extends Animal {
    private final TipoHabitat habitat;
 
    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }
 
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }
 
    @Override
    public String obtenerDieta() {
        return "Pescado";
    }

    String getHabitat() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}