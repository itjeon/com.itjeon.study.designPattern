package com.itjeon.study.designPattern.factory;

import java.util.ArrayList;
import java.util.List;

import com.itjeon.study.designPattern.factory.framework.Factory;
import com.itjeon.study.designPattern.factory.framework.Product;

public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<String>();
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public List<String> getOwners(){
		return owners;
	}

}
