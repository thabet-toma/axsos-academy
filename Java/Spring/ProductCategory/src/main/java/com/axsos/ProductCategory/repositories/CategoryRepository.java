
package com.axsos.ProductCategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProductCategory.models.Category;
import com.axsos.ProductCategory.models.Product;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	public List <Category> findAll();
    public List<Category> findByProductsNotContains(Product product);
}
