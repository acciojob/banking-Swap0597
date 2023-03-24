package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        try{
            if(balance > minBalance){
                this.name = name;
                this.balance = balance;
                this.minBalance = minBalance;
            }
        }
        catch (Exception e){
            System.out.println("Insufficient Balance");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        String ansStr = "";
        try{
            if(digits * 9 > sum){
                while(digits != 0){
                    if(sum > 9){
                        ansStr += 9;
                        sum -= 9;
                    }
                    else if(sum > 8){
                        ansStr += 8;
                        sum -= 8;
                    }
                    else if(sum > 7){
                        ansStr += 7;
                        sum -= 7;
                    }
                    else if(sum > 6){
                        ansStr += 6;
                        sum -= 6;
                    }
                    else if(sum > 5){
                        ansStr += 5;
                        sum -= 5;
                    }
                    else if(sum > 4){
                        ansStr += 4;
                        sum -= 4;
                    }
                    else if(sum > 3){
                        ansStr += 3;
                        sum -= 3;
                    }
                    else if(sum > 2){
                        ansStr += 2;
                        sum -= 2;
                    }
                    else if(sum > 1){
                        ansStr += 1;
                        sum -= 1;
                    }
                    else if(sum == 0){
                        ansStr += 0;
                        sum -= 0;
                    }
                    digits--;
                }
                return ansStr;
            }
        }catch(Exception e){
            System.out.println("Account Number can not be generated");
        }

        return null;
    }

    public void deposit(double amount) {
        //add amount to balance
        balance = balance + amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if(balance > amount){
            balance = balance - amount;

            try{
                if(balance > minBalance){

                }
            }catch (Exception e){
                System.out.println("Insufficient Balance");
            }
        }
    }

}