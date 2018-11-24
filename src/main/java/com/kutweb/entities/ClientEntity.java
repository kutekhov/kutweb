package com.kutweb.entities;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "client")
public class ClientEntity {
    @Id
    @Column(name ="id_client")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idClient;

    @Column(name = "name_clien")
    private String nameClien;

    @Column(name = "family_name_client")
    private String familyNameClient;

    @Column(name = "date_birth")
    private Date dateBirth;

    @Column (name = "passpor")
    private Integer passpor;

    @Column (name = "address")
    private String address;

    @Column (name = "number_contract")
    private Integer numberContract;

    @Column (name = "email_client")
    private String emailClient;

    @Column (name = "password_client")
    private String passwordClient;


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNameClien() {
        return nameClien;
    }

    public void setNameClien(String nameClien) {
        this.nameClien = nameClien;
    }

    public String getFamilyNameClient() {
        return familyNameClient;
    }

    public void setFamilyNameClient(String familyNameClient) {
        this.familyNameClient = familyNameClient;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getPasspor() {
        return passpor;
    }

    public void setPasspor(Integer passpor) {
        this.passpor = passpor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Integer numberContract) {
        this.numberContract = numberContract;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getPasswordClient() {
        return passwordClient;
    }

    public void setPasswordClient(String passwordClient) {
        this.passwordClient = passwordClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (idClient != that.idClient) return false;
        if (nameClien != null ? !nameClien.equals(that.nameClien) : that.nameClien != null) return false;
        if (familyNameClient != null ? !familyNameClient.equals(that.familyNameClient) : that.familyNameClient != null)
            return false;
        if (dateBirth != null ? !dateBirth.equals(that.dateBirth) : that.dateBirth != null) return false;
        if (passpor != null ? !passpor.equals(that.passpor) : that.passpor != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (numberContract != null ? !numberContract.equals(that.numberContract) : that.numberContract != null)
            return false;
        if (emailClient != null ? !emailClient.equals(that.emailClient) : that.emailClient != null) return false;
        if (passwordClient != null ? !passwordClient.equals(that.passwordClient) : that.passwordClient != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (nameClien != null ? nameClien.hashCode() : 0);
        result = 31 * result + (familyNameClient != null ? familyNameClient.hashCode() : 0);
        result = 31 * result + (dateBirth != null ? dateBirth.hashCode() : 0);
        result = 31 * result + (passpor != null ? passpor.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (numberContract != null ? numberContract.hashCode() : 0);
        result = 31 * result + (emailClient != null ? emailClient.hashCode() : 0);
        result = 31 * result + (passwordClient != null ? passwordClient.hashCode() : 0);
        return result;
    }
}
