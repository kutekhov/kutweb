package com.kutweb.entities;

public class ContractEntity {
    private int idContract;
    private Integer nomberContract;
    private String tarif;
    private String selectedListOptions;

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public Integer getNomberContract() {
        return nomberContract;
    }

    public void setNomberContract(Integer nomberContract) {
        this.nomberContract = nomberContract;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getSelectedListOptions() {
        return selectedListOptions;
    }

    public void setSelectedListOptions(String selectedListOptions) {
        this.selectedListOptions = selectedListOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractEntity that = (ContractEntity) o;

        if (idContract != that.idContract) return false;
        if (nomberContract != null ? !nomberContract.equals(that.nomberContract) : that.nomberContract != null)
            return false;
        if (tarif != null ? !tarif.equals(that.tarif) : that.tarif != null) return false;
        if (selectedListOptions != null ? !selectedListOptions.equals(that.selectedListOptions) : that.selectedListOptions != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idContract;
        result = 31 * result + (nomberContract != null ? nomberContract.hashCode() : 0);
        result = 31 * result + (tarif != null ? tarif.hashCode() : 0);
        result = 31 * result + (selectedListOptions != null ? selectedListOptions.hashCode() : 0);
        return result;
    }
}
