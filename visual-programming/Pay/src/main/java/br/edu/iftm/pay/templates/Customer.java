package br.edu.iftm.pay.templates;

import br.edu.iftm.pay.utils.enumerations.RegistrationStatus;
import br.edu.iftm.pay.utils.enumerations.EntityType;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dc7devs
 */
public class Customer {
    private static Integer customerCounter = 1;
    private Integer id;
    private String name;
    private String cpfOrCnpj;
//    private List<Address> address;
    private String phoneNumber;
    private EntityType customerType;
    private RegistrationStatus registrationStatus;
    
    public Customer(String name, String cpfOrCnpj, String phoneNumber, EntityType customerType, RegistrationStatus registrationStatus) {
        this.id = customerCounter++;
        this.name = name;
        this.cpfOrCnpj = cpfOrCnpj;
        this.phoneNumber = phoneNumber;
        this.registrationStatus = registrationStatus;
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    public void setCustomerType(EntityType customerType) {
        this.customerType = customerType;
    }

    public EntityType getCustomerType() {
        return customerType;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()) return false;
        
        final Customer customer = (Customer) obj;
        return Objects.equals(id, customer.id) && Objects.equals(cpfOrCnpj, customer.cpfOrCnpj);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}