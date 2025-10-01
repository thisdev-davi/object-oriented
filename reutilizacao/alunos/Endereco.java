package objectOriented.reutilizacao.alunos;

public class Endereco {
    private String logradouro, cidade, estado;
    private int numero, cep;

    public Endereco (String logradouro, String cidade, String estado, int numero, int cep) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco () {
        this.logradouro = "";
        this.cidade = "";
        this.estado = "";
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Logradouro: " + logradouro + ",Cidade: " + cidade +
                ", Estado: " + estado +", Numero: " + numero + ", Cep:" + cep;
    }
}