/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;

import Model.Enums.*;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Card {
    
    private Integer id;
    private Integer accountId;
    private Integer number;
    private CardType type;
    private CardFlag flag;
    private Double limit;
    private Double annualValue;
    private Date closingDate;

    public Card() {
    }

    public Card(Integer accountId, Integer number, CardType type, CardFlag flag, Double limit, Double annualValue, Date closingDate) {
        this.accountId = accountId;
        this.number = number;
        this.type = type;
        this.flag = flag;
        this.limit = limit;
        this.annualValue = annualValue;
        this.closingDate = closingDate;
    }
    
    public Card(Integer id, Integer accountId, Integer number, CardType type, CardFlag flag, Double limit, Double annualValue, Date closingDate) {
        this.id = id;
        this.accountId = accountId;
        this.number = number;
        this.type = type;
        this.flag = flag;
        this.limit = limit;
        this.annualValue = annualValue;
        this.closingDate = closingDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
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
