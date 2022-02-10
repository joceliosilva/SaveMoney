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

        public void setNum(Integer num) {
            this.num = num;
        }

        public CardType findCardType(Integer num) {
            CardType type;

            switch (num) {
                case 0:
                    type = CardType.CREDITO;
                    return type;
                case 1:
                    type = CardType.DEBITO;
                    return type;
                default:
                    type = CardType.CREDITO;
            }

            return type;
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

        public void setNum(Integer num) {
            this.num = num;
        }

        public CardFlag findCardFlag(Integer num) {
            CardFlag flag;

            switch (num) {
                case 0:
                    flag = CardFlag.MASTERCARD;
                    return flag;
                case 1:
                    flag = CardFlag.VISA;
                    return flag;
                case 2:
                    flag = CardFlag.ELO;
                    return flag;
                case 3:
                    flag = CardFlag.HIPERCARD;
                    return flag;
                case 4:
                    flag = CardFlag.AMERICAN_EXPRESS;
                    return flag;
                case 5:
                    flag = CardFlag.DINERS_CLUB;
                    return flag;               
                default:
                    flag = CardFlag.MASTERCARD;
            }

            return flag;
        }
    }

    public enum Month {
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

    public enum FormOfPayment {
        DINHEIRO(0),
        CREDITO(1),
        DEBITO(2);
        

        Integer num;

        private FormOfPayment(Integer num) {
            this.num = num;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }
    }

    public enum ExpenseStatus {
        PAY(0),
        NOT_PAID(1),
        CANCELED(2);

        Integer num;

        private ExpenseStatus(Integer num) {
            this.num = num;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }
    }
}
