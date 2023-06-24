import java.util.ArrayList;

public class Filme extends Midia {
    
    private int duracao; //(min)
    public Filme(int id, String nome, Data dataDeLancamento, int duracao)
    {
        this.id = id;
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.duracao = duracao;
        this.init(); 
        this.tipo = 2;
    }
    
    public void avaliar(int nota)
    {
        this.avaliacoes.add(new Avaliacao(nota));
    }

    public String toString()
    {
        int soma = this.avaliacoes.stream().mapToInt(i -> i.getNota()).sum();
        if(this.avaliacoes.size() != 0) {
            this.media =  soma/this.avaliacoes.size();
        }
        
        return "Filme: " + this.nome + ","
            + "\nGênero: " + this.genero.toString() + ","
            + "\nDuração: " + this.duracao + " min,"
            + "\nVizualizações: " + this.views + "," 
            + "\nIdioma: " + this.idioma + ","
            + "\nLançamento: " + this.dataDeLancamento.dataFormatada() + ","
            + "\nAvaliação média: " + (this.avaliacoes.size() == 0 ? 0 : this.media);
    }

    public String getNome()
    {
        return this.nome;
    }
    public int getDuracao()
    {
        return this.duracao;
    }
    public Data getDataLancamento()
    {
        return this.dataDeLancamento;
    }

    public int getId()
    {
        return this.id;
    }

    public ArrayList<Avaliacao> getAvaliacoes()
    {
        return this.avaliacoes;
    }

    @Override
    public int getTipo() {
        return this.tipo;
    }
}
