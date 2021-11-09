/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;
import Model.Entity.Account;
import Model.Enum.CardType;
import Model.Enum.CardFlag;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Card {
    private int Id;    
    private Account AccountId;
    private int Number;
    private CardType Type;
    private CardFlag Flag;
    private BigDecimal Limit;
    private BigDecimal AnnualValue;
    private Date ClosingDate;

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

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public CardType getType() {
        return Type;
    }

    public void setType(CardType Type) {
        this.Type = Type;
    }

    public CardFlag getFlag() {
        return Flag;
    }

    public void setFlag(CardFlag Flag) {
        this.Flag = Flag;
    }

    public BigDecimal getLimit() {
        return Limit;
    }

    public void setLimit(BigDecimal Limit) {
        this.Limit = Limit;
    }

    public BigDecimal getAnnualValue() {
        return AnnualValue;
    }

    public void setAnnualValue(BigDecimal AnnualValue) {
        this.AnnualValue = AnnualValue;
    }

    public Date getClosingDate() {
        return ClosingDate;
    }

    public void setClosingDate(Date ClosingDate) {
        this.ClosingDate = ClosingDate;
    }
}
