public class Documento {
    String titulo;
    String url;
    Tema tema;
    Index index;
    Registro registro;
    Documento documento;

    public Documento(String titulo, String url, Tema tema, Index index, Registro registro, Documento documento) {

        this.titulo = titulo;
        this.url = url;
        this.tema = tema;
        this.index = index;
        this.registro = registro;
        this.documento = documento;
    }
}