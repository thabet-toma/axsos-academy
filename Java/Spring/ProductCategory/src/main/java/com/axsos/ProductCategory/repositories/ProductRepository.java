package com.axsos.ProductCategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProductCategory.models.Category;
import com.axsos.ProductCategory.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product,Long > {
	public List <Product> findAll();
	public List <Product> findByCategoriesNotContains(Category category);
}
