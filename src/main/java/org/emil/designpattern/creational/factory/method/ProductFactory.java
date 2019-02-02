package org.emil.designpattern.creational.factory.method;

/**
 * Singleton Factory method implementation
 */
public class ProductFactory{

    private static ProductFactory productFactory;

    private ProductFactory(){

    }

    /**
     * Get the instace of the product factory
     * @return ProductFactory
     */
    public static synchronized ProductFactory getInstance(){

        if(productFactory == null)
            productFactory = new ProductFactory();

        return productFactory;
    }

    /**
     * Factory method that creted product instances
     * @param type
     * @return Product
     */
    public synchronized Product createNewProduct(String type){

        if(type.equalsIgnoreCase("Perishable")){

            return new Perishable();

        }else if(type.equalsIgnoreCase("non-perishable")){

            return new NonPerishable();
        }else{
            return null;
        }

    }

}