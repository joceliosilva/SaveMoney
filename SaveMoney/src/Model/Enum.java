/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Renan
 */
public class Enum {

    public enum CardType {
        CREDIT,
        DEBT
    }
    
    public enum CardFlag {
        MASTERCARD,
        VISA,
        ELO,
        HIPERCARD,
        AMERICAN_EXPRESS,
        DINERS_CLUB
    }
    
    public enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    
    public enum FormOfPayment{
        CREDIT_CARD,
        DEBT_CARD,
        MONEY
    }
    
    public enum ExpenseStatus{
        PAY,
        NOT_PAID,
        CANCELED
    }
}
