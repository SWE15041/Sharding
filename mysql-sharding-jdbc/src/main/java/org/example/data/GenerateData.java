package org.example.data;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yanni
 */
public class GenerateData {
    public static void main(String[] args) {
        Faker faker = new Faker();

        String csvFile = "order_100_0000.csv";
        String csvHeader = "userId,userName,orderId\n";  // CSV 文件的头部

        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append(csvHeader);

            for (int i = 0; i < 100_0000; i++) {
                int userId = faker.number().numberBetween(1, 10000);
                String orderId = faker.number().digits(10);
                String userName = faker.name().firstName();

                String csvRow = userId + "," + userName + "," + orderId + "\n";
                writer.append(csvRow);
            }

            System.out.println("数据已成功生成并输出到 " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
