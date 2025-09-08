package trabalho;

public class Pagina {
    private String url, titulo;

    public Pagina(String url, String titulo){
        this.url = formatUrl(url);
        this.titulo = formatTitulo(titulo);
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    
    private String formatTitulo(String titulo){
    	return titulo.substring(0, 1).toUpperCase() + titulo.substring(1);
    }
    
    private String formatUrl(String url){
    	return "www." + url.toLowerCase() + ".com";
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Url: " + url + "\nTitulo: " + titulo;
    }
}
