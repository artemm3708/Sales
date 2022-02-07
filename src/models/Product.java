package models;

import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговоу ставку объявите в виде константы
    // здесь ...
    public final int TAX_RATE = 5;


    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Переопределите методы реализуемых интерфейсов.

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    @Override
    public int income() {
        return (int) (this.quantity * this.price);
    }

    // Расчёт суммы налога с продаж.
    // здесь ...
    @Override
    public int tax() {
        return (income() / 100) * TAX_RATE;
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    @Override
    public int netIncome() {
        return income() - tax();
    }
}
