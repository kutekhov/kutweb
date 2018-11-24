package com.kutweb.entities;

public class OptionsEntity {
    private int idOptions;
    private String nameOptions;
    private Integer priceOptions;
    private Integer costConnection;

    public int getIdOptions() {
        return idOptions;
    }

    public void setIdOptions(int idOptions) {
        this.idOptions = idOptions;
    }

    public String getNameOptions() {
        return nameOptions;
    }

    public void setNameOptions(String nameOptions) {
        this.nameOptions = nameOptions;
    }

    public Integer getPriceOptions() {
        return priceOptions;
    }

    public void setPriceOptions(Integer priceOptions) {
        this.priceOptions = priceOptions;
    }

    public Integer getCostConnection() {
        return costConnection;
    }

    public void setCostConnection(Integer costConnection) {
        this.costConnection = costConnection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OptionsEntity that = (OptionsEntity) o;

        if (idOptions != that.idOptions) return false;
        if (nameOptions != null ? !nameOptions.equals(that.nameOptions) : that.nameOptions != null) return false;
        if (priceOptions != null ? !priceOptions.equals(that.priceOptions) : that.priceOptions != null) return false;
        if (costConnection != null ? !costConnection.equals(that.costConnection) : that.costConnection != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOptions;
        result = 31 * result + (nameOptions != null ? nameOptions.hashCode() : 0);
        result = 31 * result + (priceOptions != null ? priceOptions.hashCode() : 0);
        result = 31 * result + (costConnection != null ? costConnection.hashCode() : 0);
        return result;
    }
}
