package lab.oodp.moreclass.mobilephone;

public class MobilePhone{

 //TODO: delcare instance variables here
 private String model;
 private String brand;
 private double price;
    public MobilePhone(String brand, String model, double price) {
        //TODO: complete this constructor
    		this.brand = brand;
    		this.model = model;
    		this.price = price;
    }
//getter setter
    
    public String getBrand() {
    	
    	return brand;
    }
    
    public void setBrand(String brand) {
    	
    	this.brand = brand;
    }

    public String getModel() {
    	
    	return model;
    }
    
    public void setModel(String model) {
    	
    	this.model = model;
    }
    
    public double getPrice() {
    	
    	return price;
    }
    
    public void setPrice(double price) {
    	
    	this.price = price;
    }

    public boolean isCheaperThan(MobilePhone other) {
        //TODO: complete this method to compare price
    	
     if(this.getPrice() < other.getPrice()) 
      {
      return true;
      }
      return false;
     
    }

    @Override
    public String toString() {
     //TODO: complete this method to print out mobile phone info.
        return brand + " " + model + " which cost $" + price;
    }

    @Override
    public boolean equals(Object obj) {
       //TODO: complete this method to compare mobile phone object
    	 if (obj instanceof MobilePhone) {
         	MobilePhone classObj = (MobilePhone) obj;
         	return classObj.getBrand().equals(this.brand) && 
         			classObj.getModel().equals(this.model) && 
         			classObj.getPrice() == (this.price);
      }
      return false;

    }
}