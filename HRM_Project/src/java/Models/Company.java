package Models;

import java.util.Date;

public class Company {

    private int id;
    private String name;
    private String taxCode;
    private String address;
    private String representativeName;
    private Date representativeDOB;
    private String representativeIDCard;
    private String representativeAddress;

    public Company() {
    }

    public Company(int id, String name, String taxCode, String address, String representativeName, Date representativeDOB, String representativeIDCard, String representativeAddress) {
        this.id = id;
        this.name = name;
        this.taxCode = taxCode;
        this.address = address;
        this.representativeName = representativeName;
        this.representativeDOB = representativeDOB;
        this.representativeIDCard = representativeIDCard;
        this.representativeAddress = representativeAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public Date getRepresentativeDOB() {
        return representativeDOB;
    }

    public void setRepresentativeDOB(Date representativeDOB) {
        this.representativeDOB = representativeDOB;
    }

    public String getRepresentativeIDCard() {
        return representativeIDCard;
    }

    public void setRepresentativeIDCard(String representativeIDCard) {
        this.representativeIDCard = representativeIDCard;
    }

    public String getRepresentativeAddress() {
        return representativeAddress;
    }

    public void setRepresentativeAddress(String representativeAddress) {
        this.representativeAddress = representativeAddress;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + ", taxCode=" + taxCode + ", address=" + address + ", representativeName=" + representativeName + ", representativeDOB=" + representativeDOB + ", representativeIDCard=" + representativeIDCard + ", representativeAddress=" + representativeAddress + '}';
    }

}
