package hacker;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;


interface Bank{
	void assignLoans(int[] loans);
	void averageLoan();
	void maxLoan();
	void minLoan();
}

public class PersonalLoanDept implements Bank{
	int[] loanAmounts;
	int clients;
	
	
}
public class BusinessLoanDept implements Bank{
	
}






public class Solution {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		String[] count = sc.nextLine().split(" ");
		
		PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
		BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));
		
		count = sc.nextLine().split(" ");
		int[] loansClients = new int [count.length];
		for(int i=0; i<count.length;i++) {
			loansClients[i] = Integer.parseInt(count[i]);
		}
		
		p.assignLoans (LoansClients);
		count = sc.nextLine().split(" ");
		int[] loansBuisnesses = new int [count.length];
		for(int i=0; i<count.length; i++) {
			loansBuisnesses[i] = Integer.parseInt(count[i]);
		}
		
		b.assignLoans(loansBuisnesses);
		
		p.averageLoan();
		p.maxloan();
		p.minLoan();
		
		b.averageLoan();
		b.maxLoan();
		b.minLoan();
	}
}

 //input format for custom testing -the first line contains two space-separated integers, n, and m, the count of personal and buisness loan applicants respectively
  // the second line contains space-separated integers that represent the loans of clients.
// the third line contains space - seprated integrs that represent the loans of buisnesses

sample  input case 0 
4 4
2348 929 1284 5543
3117 5196 3352 7068

sample output case 0
Loans for clients processed
Loans for buisnesses processed
Average loan amount for clients is 2526.00
Maximum loan amount amongst clients is 5543
Minimum loan amount amongst clients is 929
Average loan amount for businesses is 4583.25
Maximum loan amongst businesses is 7068
Minum loan amongst businesses is 3117

sample test case 1
5 3
1500 3000 4500
1000 2000

sample test case 2 
4 4
1000 2000 0 3000
4000 0 5000 6000

sample test acse 3
5 3
1500 3000 4500
1000 2000










package hacker;

import java.util.*;

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}

public class PersonalLoanDept implements Bank {
    int[] loanAmounts;
    int clients;

    public PersonalLoanDept(int clients) {
        this.clients = clients;
        this.loanAmounts = new int[clients];
    }

    @Override
    public void assignLoans(int[] loans) {
        System.arraycopy(loans, 0, loanAmounts, 0, loans.length);
        System.out.println("Loans for clients processed");
    }

    @Override
    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0);
        System.out.printf("Average loan amount for clients is %.2f%n", average);
    }

    @Override
    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst clients is " + max);
    }

    @Override
    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst clients is " + min);
    }
}

public class BusinessLoanDept implements Bank {
    int[] loanAmounts;
    int businesses;

    public BusinessLoanDept(int businesses) {
        this.businesses = businesses;
        this.loanAmounts = new int[businesses];
    }

    @Override
    public void assignLoans(int[] loans) {
        System.arraycopy(loans, 0, loanAmounts, 0, loans.length);
        System.out.println("Loans for businesses processed");
    }

    @Override
    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0);
        System.out.printf("Average loan amount for businesses is %.2f%n", average);
    }

    @Override
    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst businesses is " + max);
    }

    @Override
    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst businesses is " + min);
    }
}

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] count = sc.nextLine().split(" ");

        PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
        BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

        count = sc.nextLine().split(" ");
        int[] loansClients = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansClients[i] = Integer.parseInt(count[i]);
        }

        p.assignLoans(loansClients);

        count = sc.nextLine().split(" ");
        int[] loansBusinesses = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansBusinesses[i] = Integer.parseInt(count[i]);
        }

        b.assignLoans(loansBusinesses);

        p.averageLoan();
        p.maxLoan();
        p.minLoan();

        b.averageLoan();
        b.maxLoan();
        b.minLoan();
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}

class PersonalLoanDept implements Bank {
    int[] loanAmounts;
    int clients;

    public PersonalLoanDept(int clients) {
        this.clients = clients;
        this.loanAmounts = new int[clients];
    }

    public void assignLoans(int[] loans) {
        System.arraycopy(loans, 0, loanAmounts, 0, loans.length);
        System.out.println("Loans for clients processed");
    }

    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0);
        System.out.printf("Average loan amount for clients is %.2f%n", average);
    }

    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst clients is " + max);
    }

    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst clients is " + min);
    }
}

class BusinessLoanDept implements Bank {
    int[] loanAmounts;
    int businesses;

    public BusinessLoanDept(int businesses) {
        this.businesses = businesses;
        this.loanAmounts = new int[businesses];
    }

    public void assignLoans(int[] loans) {
        System.arraycopy(loans, 0, loanAmounts, 0, loans.length);
        System.out.println("Loans for businesses processed");
    }

    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0);
        System.out.printf("Average loan amount for businesses is %.2f%n", average);
    }

    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst businesses is " + max);
    }

    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst businesses is " + min);
    }
}

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] count = sc.nextLine().split(" ");

        PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
        BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

        count = sc.nextLine().split(" ");

        int[] loansClients = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansClients[i] = Integer.parseInt(count[i]);
        }
        p.assignLoans(loansClients);

        count = sc.nextLine().split(" ");
        int[] loansBusinesses = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansBusinesses[i] = Integer.parseInt(count[i]);
        }
        b.assignLoans(loansBusinesses);

        p.averageLoan();
        p.maxLoan();
        p.minLoan();

        b.averageLoan();
        b.maxLoan();
        b.minLoan();
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}

class PersonalLoanDept implements Bank {
    int[] loanAmounts;
    int clients;

    public PersonalLoanDept(int clients) {
        this.clients = clients;
        this.loanAmounts = new int[clients];
    }

    public void assignLoans(int[] loans) {
        System.arraycopy(loans, 0, loanAmounts, 0, loans.length);
        System.out.println("Loans for clients processed");
    }

    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0);
        System.out.printf("Average loan amount for clients is %.2f%/n", average);
    }

    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst clients is " + max);
    }

    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst clients is " + min);
    }
}

class BusinessLoanDept implements Bank {
    int[] loanAmounts;
    int businesses;

    public BusinessLoanDept(int businesses) {
        this.businesses = businesses;
        this.loanAmounts = new int[businesses];
    }

    public void assignLoans(int[] loans) {
        System.arraycopy(loans, 0, loanAmounts, 0, loans.length);
        System.out.println("Loans for businesses processed");
    }

    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0);
        System.out.printf("Average loan amount for businesses is %.2f%n", average);
    }

    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst businesses is " + max);
    }

    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst businesses is " + min);
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] count = sc.nextLine().split(" ");

        PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
        BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

        count = sc.nextLine().split(" ");

        int[] loansClients = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansClients[i] = Integer.parseInt(count[i]);
        }
        p.assignLoans(loansClients);

        count = sc.nextLine().split(" ");
        int[] loansBusinesses = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansBusinesses[i] = Integer.parseInt(count[i]);
        }
        b.assignLoans(loansBusinesses);

        p.averageLoan();
        p.maxLoan();
        p.minLoan();

        b.averageLoan();
        b.maxLoan();
        b.minLoan();
    }
    
}

package hacker;

import java.util.*;

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}

public class PersonalLoanDept implements Bank {
    int[] loanAmounts;
    int clients;

    public PersonalLoanDept(int clients) {
        this.clients = clients;
    }

    @Override
    public void assignLoans(int[] loans) {
        this.loanAmounts = loans;
        System.out.println("Loans for clients processed");
    }

    @Override
    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0.0);
        System.out.printf("Average loan amount for clients is %.2f%n", average);
    }

    @Override
    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst clients is " + max);
    }

    @Override
    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst clients is " + min);
    }
}

public class BusinessLoanDept implements Bank {
    int[] loanAmounts;
    int clients;

    public BusinessLoanDept(int clients) {
        this.clients = clients;
    }

    @Override
    public void assignLoans(int[] loans) {
        this.loanAmounts = loans;
        System.out.println("Loans for businesses processed");
    }

    @Override
    public void averageLoan() {
        double average = Arrays.stream(loanAmounts).average().orElse(0.0);
        System.out.printf("Average loan amount for businesses is %.2f%n", average);
    }

    @Override
    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst businesses is " + max);
    }

    @Override
    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst businesses is " + min);
    }
}

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] count = sc.nextLine().split(" ");

        PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
        BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

        count = sc.nextLine().split(" ");
        int[] loansClients = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansClients[i] = Integer.parseInt(count[i]);
        }

        p.assignLoans(loansClients);

        count = sc.nextLine().split(" ");
        int[] loansBusinesses = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansBusinesses[i] = Integer.parseInt(count[i]);
        }

        b.assignLoans(loansBusinesses);

        p.averageLoan();
        p.maxLoan();
        p.minLoan();

        b.averageLoan();
        b.maxLoan();
        b.minLoan();
    }
}

class Result {

    public static long countBalancedSubarrays(List<Integer> componentValue) {
        long count = 0;
        int n = componentValue.size();
        
        // Create a prefix sum array
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + componentValue.get(i - 1);
        }
        
        // Use a hashmap to store the frequency of prefix sums
        Map<Integer, Integer> prefixSumFrequency = new HashMap<>();
        
        for (int sum : prefixSum) {
            if (prefixSumFrequency.containsKey(sum)) {
                count += prefixSum




                		class Result {

                    public static long countBalancedSubarrays(List<Integer> componentValue) {
                        long count = 0;
                        int n = componentValue.size();
                        
                        // Create a prefix sum array
                        int[] prefixSum = new int[n + 1];
                        prefixSum[0] = 0;
                        
                        for (int i = 1; i <= n; i++) {
                            prefixSum[i] = prefixSum[i - 1] + componentValue.get(i - 1);
                        }
                        
                        // Use a hashmap to store the frequency of prefix sums
                        Map<Integer, Integer> prefixSumFrequency = new HashMap<>();
                        
                        for (int sum : prefixSum) {
                            if (prefixSumFrequency.containsKey(sum)) {
                                count += prefixSumFrequency.get(sum);
                            }
                            prefixSumFrequency.put(sum, prefixSumFrequency.getOrDefault(sum, 0) + 1);
                        }
                        
                        return count;
                    }
                }





















	
