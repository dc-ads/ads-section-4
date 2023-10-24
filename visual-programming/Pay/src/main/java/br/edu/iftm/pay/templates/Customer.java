package br.edu.iftm.pay.templates;

import br.edu.iftm.pay.utils.enumerations.RegistrationStatus;
import br.edu.iftm.pay.utils.enumerations.EntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dc7devs
 */
public class Customer {
    private static Integer contadorClientes = 1;
    private Integer id;
    private String nome;
    private String CpfOuCnpj;
    private List<Address> telefones;
    private EntityType tipoCliente;
    private RegistrationStatus situacaoCadastral;
    
    public Customer(Integer id, String nome, String CpfOuCnpj, ArrayList<Address> telefones, EntityType tipoCliente, RegistrationStatus situacaoCadastral) {
        this.id = contadorClientes++;
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

    public void setTelefones(List<Address> telefones) {
        this.telefones = telefones;
    }

    public List<Address> getTelefones() {
        return telefones;
    }
    
    public void setSituacaoCadastral(RegistrationStatus situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public RegistrationStatus getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setTipoCliente(EntityType tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public EntityType getTipoCliente() {
        return tipoCliente;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()) return false;
        
        final Customer cliente = (Customer) obj;
        return Objects.equals(id, cliente.id) && Objects.equals(CpfOuCnpj, cliente.CpfOuCnpj);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
