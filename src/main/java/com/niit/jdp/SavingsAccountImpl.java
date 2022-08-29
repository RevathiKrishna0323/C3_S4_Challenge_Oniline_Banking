/*
 * Author Name: Revathi
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jdp;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(983472, "Savings", "Yasree", "SBI", "Guntur", "Brodipet, MainRoad", "SBI657", "Guntur",  "22-27-2022", "joint account", "3566", "India", "AP", 91, 89588, "Active", true);
        System.out.println(savingsAccount.getAccountNumber());
        System.out.println(savingsAccount.getModeOfOperation());
        System.out.println(savingsAccount.getAccountName());
        System.out.println(savingsAccount.getAccountBalance());
        System.out.println(savingsAccount.getAccountStatus());
        System.out.println(savingsAccount.getAccountType());
        System.out.println(savingsAccount.getModeOfOperation());
        System.out.println(savingsAccount.getAccountName());
        System.out.println(savingsAccount.getMobileBankingEnabled());
        System.out.println(savingsAccount.getAddress());
        System.out.println(savingsAccount.getBankCode());
        System.out.println(savingsAccount.getIFSC_Code());
        System.out.println(savingsAccount.getBranchName());
        System.out.println(savingsAccount.getAccountOpenDate());
        System.out.println(savingsAccount.getBranchName());
    }
}