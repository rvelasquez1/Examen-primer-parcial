import java.util.List;

public class Registro {
    Integer numeroRegistro;
    List<Documento> documento;
    String fechaActualizacio;
    Registro registro;

    public Registro(Integer numeroRegistro, List<Documento> documento, String fechaActualizacio, Registro registro) {

        this.numeroRegistro = numeroRegistro;
        this.documento = documento;
        this.fechaActualizacio = fechaActualizacio;
        this.registro = registro;
    }
}
