public class Loan {
    private int ID;
    private double loanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;

    public Loan(int ID, double loanAmount, String country, int daysToFund,
                int numLenders) {
        this.ID = ID;
        this.loanAmount = loanAmount;
        this.country = country;
        this.daysToFund = daysToFund;
        this.numLenders = numLenders;
    }

    public int getID(){
        return ID;
    }
    public double getLoanAmount(){
        return loanAmount;
    }

    public String getCountry(){
        return country;
    }

    public int getDaysToFund(){
        return daysToFund;
    }

    public int getNumLenders(){
        return numLenders;
    }

    public String toString(){
        return ID +"\n"+ loanAmount +"\n"+ country +"\n"+ daysToFund +"\n"+ numLenders;
    }

    public void setID(int Id) {
        ID = Id;
    }
    public void setLoanAmount(double loan) {
        loanAmount = loan;
    }
    public void setCountry(String count) {
        country = count;
    }
    public void setDaysToFund(int days) {
        daysToFund = days;
    }
    public void setNumLenders(int num) {
        numLenders = num;
    }






}
