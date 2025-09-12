package Enums;


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

