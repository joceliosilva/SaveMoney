/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;
import Model.Entity.Account;
import Model.Enum.CardType;
import Model.Enum.CardFlag;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Card {
    private int Number;
    private CardType Type;
    private CardFlag Flag;
    private Account Account;
    private double Limit;
    private Date ClosingDate;

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

    public Account getAccount() {
        return Account;
    }

    public void setAccount(Account Account) {
        this.Account = Account;
    }

    public double getLimit() {
        return Limit;
    }

    public void setLimit(double Limit) {
        this.Limit = Limit;
    }

    public Date getClosingDate() {
        return ClosingDate;
    }

    public void setClosingDate(Date ClosingDate) {
        this.ClosingDate = ClosingDate;
    }
}
