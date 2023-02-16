package data_source;

import java.util.Set;

public class SetDataSource {
    private Set<String> productsSet;
    public SetDataSource(Set<String> productsSet) {
        this.productsSet = productsSet;
    }

    public Set<String> createSet() {

        productsSet.add("р-Аминопропиофенон");
        productsSet.add("Альфентанил");
        productsSet.add("Глютетимид");
        productsSet.add("Декстроморамид");
        productsSet.add("Кодоксим");

        return productsSet;
    }
}
