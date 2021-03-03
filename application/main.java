package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.people;
import entities.personpf;
import entities.personpj;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List <people> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n_payers = sc.nextInt();

        for (int i=0; i<n_payers; i++){
            System.out.println("Tax payers #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double annualIncome = sc.nextDouble();
            if (ic == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                list.add(new personpf(name, annualIncome, healthExpenses));
                }
            else{
                System.out.print("Number of employees: ");
                int numberEmployee = sc.nextInt();
                list.add(new personpj(name, annualIncome, numberEmployee));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID");
        double sum = 0.0;

        for(people pl : list){
            sum += pl.tax();
            System.out.println(pl.getName() + " $ " + String.format("%.2f",pl.tax()));
        }
        System.out.println("TOTAL TAXES: $ " + sum);
        sc.close();
    }
}
