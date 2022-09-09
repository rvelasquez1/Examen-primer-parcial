import java.util.List;

public class Tema {
    List <Documento>documento;
    List <Tema>subTema;
    String nombreTema;

    public Tema(List<Documento> documento, List<Tema> subTema, String nombreTema) {

        this.documento = documento;
        this.subTema = subTema;
        this.nombreTema = nombreTema;
    }
}
