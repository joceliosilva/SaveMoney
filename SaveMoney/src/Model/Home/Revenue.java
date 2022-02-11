/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;

import Model.Entity.*;
import Model.Enums.*;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Revenue {
    private Integer accountId;
    private Double value;
    private Month referenceMonth;
    private Date date;
    private String description;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Month getReferenceMonth() {
        return referenceMonth;
    }

    public void setReferenceMonth(Month referenceMonth) {
        this.referenceMonth = referenceMonth;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
