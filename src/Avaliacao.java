public class Avaliacao {
    private int nota;
    private String comentario;
    private Cliente cliente;
    private Data data;

    public Avaliacao(int nota)
    {
        this.nota = nota;
        data = new Data();
    }
    
    public void comentar(String comentario)
    {
        this.comentario = comentario;
    }

    public void avaliador(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() { // NÃO ESPECIFICADO COMO A DATA SERIA ATRIBUIDA À AVALIAÇÃO
        return data;
    }

    public String getComentario() {
        return comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNota() {
        return nota;
    }


}
