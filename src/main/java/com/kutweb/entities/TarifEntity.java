package com.kutweb.entities;

public class TarifEntity {
    private int idTarif;
    private String nameTarif;
    private Integer priceTarif;
    private String listOptions;

    public int getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    public String getNameTarif() {
        return nameTarif;
    }

    public void setNameTarif(String nameTarif) {
        this.nameTarif = nameTarif;
    }

    public Integer getPriceTarif() {
        return priceTarif;
    }

    public void setPriceTarif(Integer priceTarif) {
        this.priceTarif = priceTarif;
    }

    public String getListOptions() {
        return listOptions;
    }

    public void setListOptions(String listOptions) {
        this.listOptions = listOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TarifEntity that = (TarifEntity) o;

        if (idTarif != that.idTarif) return false;
        if (nameTarif != null ? !nameTarif.equals(that.nameTarif) : that.nameTarif != null) return false;
        if (priceTarif != null ? !priceTarif.equals(that.priceTarif) : that.priceTarif != null) return false;
        if (listOptions != null ? !listOptions.equals(that.listOptions) : that.listOptions != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTarif;
        result = 31 * result + (nameTarif != null ? nameTarif.hashCode() : 0);
        result = 31 * result + (priceTarif != null ? priceTarif.hashCode() : 0);
        result = 31 * result + (listOptions != null ? listOptions.hashCode() : 0);
        return result;
    }
}
