package br.edu.iftm.pay.templates;

enum TipoEndereco {
    RESIDENCIAL,
    COMERCIAL,
    ENTREGA
}

/**
 *
 * @author dc7devs
 */
public class Address {
    private String estado;
    private String cidade;
    private String logradouro;
    private String cep;
    private String numero;
    private String complemento;
    private TipoEndereco tipoEndereco;
    
    public Address(String estado, String cidade, String logradouro, String cep, String numero, String complemento, TipoEndereco tipoEndereco) {
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.tipoEndereco = tipoEndereco;
        this.complemento = complemento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }
}
