public class MP {

    private final int lotPrice;
    private final int PCF = 2000;
    private final float divided_by = 100;
    private int interest;
    private int months;

    public MP(int lotPrice){

        this.lotPrice = lotPrice;
    }

    public MP(int lotPrice, int interest, int months){
        this.interest = interest;
        this.months = months;
        this.lotPrice = lotPrice;
    }

    //GETS
    public int getLotPrice() {

        return lotPrice;
    }
    public float getVatPercentage(){
        float vatPercent = 12;
        return vatPercent /divided_by;
    }
    public int getVat() {

        return (int) (lotPrice * getVatPercentage());
    }
    public int getTotalPrice() {
        return lotPrice + getVat();
    }
    public int getPCF() {

        return PCF;
    }
    public int getSellingPrice() {
        return PCF + getTotalPrice();
    }
    public float getDownPercentage(){
        float downPercent = 10;
        return downPercent /divided_by;
    }
    public int getDownPayment() {
        return (int) ((PCF + (lotPrice + getVat()))*getDownPercentage());
    }
    public int getInterest(){
        return interest;
    }
    public float getInterestPercent(){
        return getInterest()/divided_by;
    }
    public int getYearInterest(){
        return (int)((getSellingPrice()-getDownPayment())*getInterestPercent());
    }
    public int getContractPrice(){
        return getSellingPrice() + getYearInterest();
    }
    public int getMonths(){
        return  months;
    }
    public int getMonthlyPayment(){
        return getContractPrice()/months;
    }
    public int getLess(){
        return (int) (getSellingPrice()-(getSellingPrice()*getInterestPercent()));
    }

}

