package at.technikum.controlstructures;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            double weight = 0, height = 0 , bmi;
            System.out.print("weight [kg]: ");
            weight = scanner.nextDouble();
            System.out.print("height [m]: ");
            height = scanner.nextDouble();
            System.out.printf("m=%.2fkg h=%.2fm -> BMI=%.2f (", weight, height, bmi = bmiCalc(height, weight));
            bmiMessage(bmiCategory(bmi));
            System.out.println(")");
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
    public static double bmiCalc(double height, double weight) {
        if (weight < 40 || height < 1.6)
            return -1;
        return weight * (height * height);
    }
    public static int bmiCategory(double bmi) {
        int categoryNum = -1;
        if (bmi == -1)
            return -1;
        if (bmi < 15) {
            categoryNum = 10;
        } else if (bmi >= 15 && bmi < 16) {
            categoryNum = 11;
        } else if (bmi >= 16 && bmi < 18.5) {
            categoryNum = 12;
        } else if (bmi >= 18.5 && bmi < 25) {
            categoryNum = 20;
        } else if (bmi >= 25 && bmi < 30) {
            categoryNum = 30;
        } else if (bmi >= 30 && bmi < 35) {
            categoryNum = 40;
        } else if (bmi >= 35 && bmi < 40) {
            categoryNum = 41;
        } else if (bmi >= 40) {
            categoryNum = 42;
        }
        return categoryNum;
    }
    public static void bmiMessage(int bmiCategory) {
        if (bmiCategory == -1) {
            System.out.print("invalid.");
            return;
        }
        if (bmiCategory == 10) {
            System.out.print("Very severely underweight");
        } else if (bmiCategory == 11) {
            System.out.print("Severely underweight");
        } else if (bmiCategory == 12) {
            System.out.print("Underweight");
        } else if (bmiCategory == 20) {
            System.out.print("Normal");
        } else if (bmiCategory == 30) {
            System.out.print("Overweight");
        } else if (bmiCategory == 40) {
            System.out.print("Moderately obese");
        } else if (bmiCategory == 41) {
            System.out.print("Severely obese");
        } else if (bmiCategory == 42) {
            System.out.print("Very Severely obese");
        }
    }
}
