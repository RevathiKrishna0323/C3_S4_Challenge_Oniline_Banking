/*
 * Author Name: Revathi
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jdp;

public class SavingsAccount extends Bank {
    //created a no args constructor

    public SavingsAccount() {
    }
    // created a parameterised constructor


    public SavingsAccount(long accountNumber, String accountType, String accountName, String bankName, String branchName, String address, String IFSC_Code, String city, String accountOpenDate, String modeOfOperation, String bankCode, String bankCountry, String bankState, int bankCountryCode, double accountBalance, String accountStatus, Boolean isMobileBankingEnabled) {
        super(accountNumber, accountType, accountName, bankName, branchName, address, IFSC_Code, city, accountOpenDate, modeOfOperation, bankCode, bankCountry, bankState, bankCountryCode, accountBalance, accountStatus, isMobileBankingEnabled);
    }

    public double creditCash(double cash) {

        double credit;

        return credit = super.getAccountBalance() + cash;
    }

    public double debitCash(double cash) {

        double debit;
        return debit = super.getAccountBalance() - cash;
    }

    @Override
    public String toString() {
        return "SavingsAccount{}";
    }
}
