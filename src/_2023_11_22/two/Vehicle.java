package _2023_11_22.two;

abstract class Vehicle {
    //3.1. Абстрактный класс Vehicle:
    //
    //Поля: String model, int capacity, double fare, String route.
    //Абстрактные методы для основных операций транспортного средства.

    protected String model;
    protected int capacity;
    protected double fare;
    protected String route;

    abstract void fareAcceptance();
    abstract void onRoute();

}
