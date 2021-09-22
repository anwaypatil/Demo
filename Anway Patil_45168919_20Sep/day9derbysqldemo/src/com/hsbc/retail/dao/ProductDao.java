package com.hsbc.retail.dao;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.retail.models.Product;

public interface ProductDao {
	
	boolean addProduct(List<Product> products) throws SQLException;
	List<Product> getAllProducts(int type) throws SQLException;

}
