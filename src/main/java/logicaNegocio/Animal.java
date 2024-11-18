package logicaNegocio;

public abstract class Animal {
 public abstract String emitirSonido();
    public abstract String obtenerDieta();

    static class TipoHabitat {

        static TipoHabitat TERRESTRE;
        static TipoHabitat ACUATICO;
static TipoHabitat AEREO;

        public TipoHabitat() {
        }
    }
    
}
 

