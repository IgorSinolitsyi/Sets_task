package task_02;

import task_01.ProductsSet;

import java.util.Set;

public class ProductsSetExtendedVersion extends ProductsSet {

    public ProductsSetExtendedVersion(Set<String> setProducts) {
        super(setProducts);
    }

    public String deleteProduct() {

        super.productsSet.removeIf(str -> str.contains("Глютетимид"));
        return "\nУдалил из перечня элемент ´Глютетимид´, при условии его наличия в перечне!\n";
    }

}
