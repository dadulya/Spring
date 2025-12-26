package org.skypro.skyshop.model.product;

import java.util.UUID;

public class FixPriceProduct extends Product {

    private static final int FIX_PRICE = 100;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    // Переопределяем метод getId() для того, чтобы вернуть id из родительского класса
    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + FIX_PRICE;
    }
}