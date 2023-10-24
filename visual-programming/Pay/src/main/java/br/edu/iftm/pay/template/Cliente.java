package br.edu.iftm.pay.template;

import br.edu.iftm.pay.utils.enumerations.SituacaoCadastral;
import br.edu.iftm.pay.utils.enumerations.TipoEntidade;
import java.util.ArrayList;

/**
 *
 * @author dc7devs
 */
public class Cliente {
    private Integer ID;
    private String nome;
    private String CpfOuCnpj;
    private ArrayList<Long> telefones;
    private TipoEntidade tipoCliente;
    private SituacaoCadastral situacaoCadastral;
    
    public Cliente(Integer ID, String nome, String CpfOuCnpj, ArrayList<Long> telefones, TipoEntidade tipoCliente, SituacaoCadastral situacaoCadastral) {
        this.ID = ID;
        this.nome = nome;
        this.CpfOuCnpj = CpfOuCnpj;
        this.situacaoCadastral = situacaoCadastral;
        this.tipoCliente = tipoCliente;
        this.telefones = telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpfOuCnpj(String CpfOuCnpj) {
        this.CpfOuCnpj = CpfOuCnpj;
    }

    public String getCpfOuCnpj() {
        return CpfOuCnpj;
    }

    public void setSituacaoCadastral(SituacaoCadastral situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public SituacaoCadastral getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setTipoCliente(TipoEntidade tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoEntidade getTipoCliente() {
        return tipoCliente;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        
        final Cliente other = (Cliente) obj;
        
        if ((this.ID == null) ? (other.ID != null) : !this.ID.equals(other.ID)) return false;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) return false;
        if ((this.CpfOuCnpj == null) ? (other.CpfOuCnpj != null) : !this.CpfOuCnpj.equals(other.CpfOuCnpj)) return false;
        
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.ID != null ? this.ID.hashCode() : 0);
        return hash;
    }
}
