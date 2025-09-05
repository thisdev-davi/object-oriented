package trabalho;

public class Pagina {
    private String url, titulo;

    public Pagina(String url, String titulo){
        this.url = url;
        this.titulo = titulo;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "url='" + url + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}