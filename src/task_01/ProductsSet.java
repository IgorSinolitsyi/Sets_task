package task_01;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductsSet {
    protected Set<String> productsSet;

    public ProductsSet(Set<String> setProducts) {
        this.productsSet = setProducts;
    }

    public String addProduct() {

        productsSet.add("Левоморамид");
        return "\nДобавлно к перечню еще одно наименование товара!\n";
    }

    public String showProductSet() {

        AtomicInteger i = new AtomicInteger(0);

        if (productsSet.isEmpty()) return "\nПеречень пуст!";
        for (String product : productsSet) {
            System.out.println(i.incrementAndGet() + ". " + product);
        }
        return "\nВыведен нумерованый перечень!\n";
    }
}
