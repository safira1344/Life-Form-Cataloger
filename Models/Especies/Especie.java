package Models.Especies;

// package Models;
// /**
//  * Especie
//  */
public class Especie{

    private String nome;
    private String nomeCientifico;
    private String descricao;

    public Especie(String nome, String nomeCientifico, String descricao) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.descricao = descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNomeCientifico() {
        return this.nomeCientifico;
    }

    public String getDescricao() {
        return this.descricao;
    }
}