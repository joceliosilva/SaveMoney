/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;

import Model.Entity.*;
import Model.Enums.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Card {

    private Account accountId;
    private Integer number;
    private CardType type;
    private CardFlag flag;
    private Double limit;
    private Double annualValue;
    private Date closingDate;

    public Card() {
    }

    public Card(Account accountId, Integer number, CardType type, CardFlag flag, Double limit, Double annualValue, Date closingDate) {
        this.accountId = accountId;
        this.number = number;
        this.type = type;
        this.flag = flag;
        this.limit = limit;
        this.annualValue = annualValue;
        this.closingDate = closingDate;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public CardFlag getFlag() {
        return flag;
    }

    public void setFlag(CardFlag flag) {
        this.flag = flag;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Double getAnnualValue() {
        return annualValue;
    }

    public void setAnnualValue(Double annualValue) {
        this.annualValue = annualValue;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }
}
