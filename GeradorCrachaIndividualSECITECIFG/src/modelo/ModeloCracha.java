package modelo;

public class ModeloCracha {    
    //Variaveis
    //--String
    private String nome_simplif = "";
    private String cpf = "";
    private String url = "";
    
    //Metodos
    //--Construtor
    public ModeloCracha(String nome_simplif, String cpf, String url) {
        this.nome_simplif = nome_simplif;
        this.cpf = cpf;
        this.url = url;
    }

    
    public String getNome_simplif() {
		return nome_simplif;
	}


	public void setNome_simplif(String nome_simplif) {
		this.nome_simplif = nome_simplif;
	}


	public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
}