package controllers;

import base.Income;
import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String name = model.getName();
        double overallEarning = model.income();
        double overallTax = model.tax();
        double earnings = model.netIncome();



        String output = "Наименование товара: " + name +"\n" +
                "Общий доход (грн.): " + Rounder.moneyFormat(overallEarning) + "\n" +
                "Сумма налога (грн.): " + Rounder.moneyFormat(overallTax) + "\n" +
                "Чистый доход (грн.): " + Rounder.moneyFormat(earnings) + "\n";

        view.getOutput(output);
    }
}
