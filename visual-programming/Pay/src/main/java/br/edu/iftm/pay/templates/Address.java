package br.edu.iftm.pay.templates;

enum AddressType {
    RESIDENCIAL,
    COMERCIAL,
    ENTREGA
}

/**
 *
 * @author dc7devs
 */
public class Address {
    private String state;
    private String city;
    private String publicPlace;
    private String cep;
    private String number;
    private String complement;
    private AddressType addressType;
    
    public Address(String state, String city, String publicPlace, String cep, String number, String complemento, AddressType addressType) {
        this.state = state;
        this.city = city;
        this.publicPlace = publicPlace;
        this.cep = cep;
        this.number = number;
        this.addressType = addressType;
        this.complement = complemento;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
    
    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getComplement() {
        return complement;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public AddressType getAddressType() {
        return addressType;
    }
}
