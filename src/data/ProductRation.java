package data;

import java.io.Serializable;

public class ProductRation implements Serializable {
	private static final long serialVersionUID = -8209370788758317246L;
	private Product _p;
	private float _grams;
	
	public ProductRation(Product p, float grams) {
		_p = new Product(p);
		_grams = grams;
	}
	
	public ProductRation(ProductRation pr){
		_p = new Product(pr.getProduct());
		_grams = pr.getGrams();
	}
	
	public Product getProduct(){
		return _p;
	}
	
	public float getGrams(){
		return _grams;
	}
	
	@Override
	public String toString() {
		return _p.getName() + " (" + _grams + "g)";
	}
}
