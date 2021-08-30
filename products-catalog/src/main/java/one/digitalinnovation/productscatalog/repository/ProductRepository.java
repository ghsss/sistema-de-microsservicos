package one.digitalinnovation.productscatalog.repository;

import one.digitalinnovation.productscatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
