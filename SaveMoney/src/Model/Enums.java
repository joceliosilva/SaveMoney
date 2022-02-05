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
public class Enums {

    public enum CardType {
        CREDITO(0),
        DEBITO(1);
        
        Integer num;

        private CardType(Integer num) {
            this.num = num;
        }  

        public Integer getNum() {
            return num;
        }
    }
    
    public enum CardFlag {
        MASTERCARD(0),
        VISA(1),
        ELO(2),
        HIPERCARD(3),
        AMERICAN_EXPRESS(4),
        DINERS_CLUB(5);
        
        Integer num;

        private CardFlag(Integer num) {
            this.num = num;
        }  
        
        public Integer getNum() {
            return num;
        }
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
