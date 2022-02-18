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
        JANEIRO(0),
        FEVEREIRO(1),
        MARÇO(2),
        ABRIL(3),
        MAIO(4),
        JUNHO(5),
        JULHO(6),
        AGOSTO(7),
        SETEMBRO(8),
        OUTOBRO(9),
        NOVEMBRO(10),
        DEZEMBRO(11);

        Integer num;

        private Month(Integer num) {
            this.num = num;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public Month findMonth(Integer num) {
            Month month;

            switch (num) {
                case 0:
                    month = Month.JANEIRO;
                    return month;
                case 1:
                    month = Month.FEVEREIRO;
                    return month;
                case 2:
                    month = Month.MARÇO;
                    return month;
                case 3:
                    month = Month.ABRIL;
                    return month;
                case 4:
                    month = Month.MAIO;
                    return month;
                case 5:
                    month = Month.JUNHO;
                    return month;
                case 6:
                    month = Month.JULHO;
                    return month;
                case 7:
                    month = Month.AGOSTO;
                    return month;
                case 8:
                    month = Month.SETEMBRO;
                    return month;
                case 9:
                    month = Month.OUTOBRO;
                    return month;
                case 10:
                    month = Month.NOVEMBRO;
                    return month;
                case 11:
                    month = Month.DEZEMBRO;
                    return month;
                default:
                    month = Month.JANEIRO;
                    return month;
            }
        }
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

        public FormOfPayment findFormOfPayment(Integer num) {
            FormOfPayment pay;

            switch (num) {
                case 0:
                    pay = FormOfPayment.DINHEIRO;
                    return pay;
                case 1:
                    pay = FormOfPayment.CREDITO;
                    return pay;
                case 2:
                    pay = FormOfPayment.CREDITO;
                    return pay;
                default:
                    pay = FormOfPayment.DINHEIRO;
                    return pay;
            }
        }

        public enum ExpenseStatus {
            PAGO(0),
            NÃO_PAGO(1),
            CANCELEDO(2);

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

            public ExpenseStatus findStatus(Integer num) {
                ExpenseStatus status;

                switch (num) {
                    case 0:
                        status = ExpenseStatus.PAGO;
                        return status;
                    case 1:
                        status = ExpenseStatus.NÃO_PAGO;
                        return status;
                    case 2:
                        status = ExpenseStatus.CANCELEDO;
                        return status;
                    default:
                        status = ExpenseStatus.NÃO_PAGO;
                        return status;
                }
            }
        }
    }
}
