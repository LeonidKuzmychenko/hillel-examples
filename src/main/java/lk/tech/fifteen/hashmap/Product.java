package lk.tech.fifteen.hashmap;

import java.util.Objects;

public class Product {

    private String name;

    //контракт equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    //колізія - коли на різні об'єкти повертається однаковий хеш код
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
