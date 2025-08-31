package Enums;
/*
Define Currency  enum with values:
AMD (interest) , USD  (interest) , RUB (interest)

 */

enum Currency{
    AMD(11),
    USD(5),
    RUB(6);

    private int interest;

    private Currency(int interest){
        this.interest = interest;

    }

    public int getInterest() {
        return interest;
    }
}

