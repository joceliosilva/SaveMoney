/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;

import Model.Entity.*;
import Model.Enum.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Revenue {
    private Account accountId;
    private BigDecimal value;
    private Month referenceMonth;
    private Date date;
    private String description;

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
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
