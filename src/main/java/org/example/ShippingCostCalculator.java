package org.example;

import java.util.Scanner;

public class ShippingCostCalculator {
    public static double calculateShippingCost(double w, double d) {
        // Kiểm tra điều kiện hợp lệ của đầu vào
        if (w < 0 || w > 80 || d < 0 || d > 60) {
            System.out.println("Input không hợp lệ!");
            return -1;
        }

        double baseCost;

        // Xác định phí cơ bản
        if (w <= 5) {
            baseCost = 10000 + 1000 * d;
        } else if (w <= 40) {
            baseCost = 20000 + 1500 * d;
        } else {
            baseCost = 25000 + 2000 * d;
        }

        // Áp dụng phụ phí nếu khoảng cách > 30 km
        if (d > 30) {
            baseCost *= 1.1;
        }

        return baseCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập trọng lượng (kg): ");
        double w = scanner.nextDouble();

        System.out.print("Nhập khoảng cách (km): ");
        double d = scanner.nextDouble();

        double cost = calculateShippingCost(w, d);
        if (cost != -1) {
            System.out.printf("Chi phí giao hàng: %.2f VND\n", cost);
        }

        scanner.close();
    }
}
