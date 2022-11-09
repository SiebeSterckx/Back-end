package be.cosci.catalog.db;

import be.cosci.catalog.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
