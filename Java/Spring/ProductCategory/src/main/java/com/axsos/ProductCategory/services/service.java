package com.axsos.ProductCategory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.ProductCategory.models.Category;
import com.axsos.ProductCategory.models.Product;
import com.axsos.ProductCategory.repositories.CategoryRepository;
import com.axsos.ProductCategory.repositories.ProductRepository;


@Service
public class service {
	@Autowired
	 ProductRepository productRepository;
	@Autowired
	 CategoryRepository categoryRepository;
	
	public List<Product> allProducts(){
		return productRepository.findAll();
	}
	public Product createProduct(Product t) {
	return productRepository.save(t);}
	public Product findProduct(Long id) {
		Optional <Product>optionalTravel=productRepository.findById(id);
		if(optionalTravel.isPresent()) {
			return optionalTravel.get();}
			else {
				return null;
			}
		}
	public List<Category> allCategories(){
		return categoryRepository.findAll();
	}
	public Category createCategory(Category t) {
	return categoryRepository.save(t);}
	public Category findCategory(Long id) {
		Optional <Category>optionalTravel=categoryRepository.findById(id);
		if(optionalTravel.isPresent()) {
			return optionalTravel.get();}
			else {
				return null;
			}
		}
	public List<Category> AvelableC (Long id) {
		Optional <Product>optionalProduct=productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return categoryRepository.findByProductsNotContains(optionalProduct.get());}
			else {
				return null;
			}
			}
	public List<Product> AvelableP (Long id) {
		Optional <Category>optionalProduct=categoryRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return productRepository.findByCategoriesNotContains(optionalProduct.get());}
			else {
				return null;
			}
			}
	public void updateP(Long idP,Long idC) {
		Optional <Product>optionalProduct=productRepository.findById(idP);
		Optional <Category>optionalCategory=categoryRepository.findById(idC);
		if(optionalProduct.isPresent()) {
			optionalProduct.get().getCategories().add(optionalCategory.get());
			productRepository.save(optionalProduct.get());
		}
	}
	    
	} 

