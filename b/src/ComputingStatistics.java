import java.util.ArrayList;

public class ComputingStatistics {
    /**
     * The ArrayList containing all of the loan data.
     */
    private ArrayList<Loan> data;

    /**
     * Creates a new ComputingStatistics object with an empty ArrayList
     */
    public ComputingStatistics() {
        data = new ArrayList<Loan>();
    }

    /**
     * Creates a new ComputingStatistics object with the data passed in
     */
    public ComputingStatistics(ArrayList<Loan> d) {
        data = d;
    }

    /**
     * Calclates the total amount funded from all of the loans in the file.
     * @return the total loan amount.
     */
    public double totalAmount() {
        double amount = 0.0;
        for(int i = 0; i < data.size(); i++) {
            amount = amount + data.get(i).getLoanAmount();
        }
        return amount;
    }

    public double avgLoan(){
        return totalAmount() / data.size();
    }
    public double largestLoan(){
        double max = data.get(0).getLoanAmount();

        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getLoanAmount() > max){
                max = data.get(i).getLoanAmount();
            }
        }
        return max;
    }
    public double smallestLoan(){
        double min = data.get(0).getLoanAmount();

        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getLoanAmount() < min){
                min = data.get(i).getLoanAmount();
            }
        }
        return min;
    }
    public String largestLoanCountry(){
        double max = data.get(0).getLoanAmount();
        String country = "";

        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getLoanAmount() > max){
                max = data.get(i).getLoanAmount();
                country = data.get(i).getCountry();
            }
        }
        return country;
    }
    public String smallestLoanCountry(){
        double min = data.get(0).getLoanAmount();
        String country = "";

        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getLoanAmount() < min){
                min = data.get(i).getLoanAmount();
                country = data.get(i).getCountry();
            }
        }
        return country;
    }
    public double avgDaysToFund(){
        double amount = 0;
        for(int i = 0; i < data.size(); i++) {
            amount = amount + data.get(i).getDaysToFund();
        }
        return amount / data.size();
    }
    public double largestLoanKenya(){
        double max = 0;
        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getCountry().equals("Kenya")){
                if(data.get(i).getLoanAmount() > max){
                    max = data.get(i).getLoanAmount();
                }
            }
        }
        return max;
    }
    public double avgLoanPhilippines(){
        double amount = 0;
        int count = 0;
        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getCountry().equals("Philippines")){
                amount += data.get(i).getLoanAmount();
                count++;
            }
        }
        return amount / count;
    }
    public String longestToFundCountry(){
        int days = data.get(0).getDaysToFund();
        String country = data.get(0).getCountry();

        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getDaysToFund() > days){
                days = data.get(i).getDaysToFund();
                country = data.get(i).getCountry();
            }
        }
        return country;
    }
    public String mostLoansFunded(){
        int kenya = 0;
        int savador = 0;

        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getCountry().equals("Kenya")){
                kenya++;
            } else if(data.get(i).getCountry().equals("El Salvador")){
                savador++;
            }
        }

        if(kenya > savador){
            return "Kenya";
        } else {
            return "El Salvador";
        }
    }
    public double variance(){
        double amount = 0;
        double avg = avgLoan();
        for(int i = 0; i < data.size(); i++){
            amount += (data.get(i).getLoanAmount() - avg) * (data.get(i).getLoanAmount() - avg);
        }
        return amount / data.size();
    }
    public double standardDeviation(){
        return Math.sqrt(variance());
    }
    public boolean empiricalRule(){
        double amount = 0;
        double min = avgLoan() - standardDeviation();
        double max = avgLoan() + standardDeviation();
        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getLoanAmount() < max && data.get(i).getLoanAmount() > min){
                amount++;
            }
        }
        return (amount / data.size() * 100) > 67 && (amount / data.size() * 100) < 69;
    }


}