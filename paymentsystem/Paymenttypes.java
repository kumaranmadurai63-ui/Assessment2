package paymentsystem;
class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through Card");
    }
}

class CashPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}