/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;

import Model.Entity.Account;
import Model.Enum.Month;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Revenue {
    private int Id;
    private Account AccountId;
    private BigDecimal Value;
    private Month ReferenceMonth;
    private Date Date;
    private String Description;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Account getAccountId() {
        return AccountId;
    }

    public void setAccountId(Account AccountId) {
        this.AccountId = AccountId;
    }

    public BigDecimal getValue() {
        return Value;
    }

    public void setValue(BigDecimal Value) {
        this.Value = Value;
    }

    public Month getReferenceMonth() {
        return ReferenceMonth;
    }

    public void setReferenceMonth(Month ReferenceMonth) {
        this.ReferenceMonth = ReferenceMonth;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
