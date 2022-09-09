import java.util.Date;

public class Index {
    boolean hash;
    Integer tamanio;
    Date fecha;
    Index index;

    public Index(boolean hash, Integer tamanio, Date fecha, Index index) {

        this.hash = hash;
        this.tamanio = tamanio;
        this.fecha = fecha;
        this.index = index;
    }
}
