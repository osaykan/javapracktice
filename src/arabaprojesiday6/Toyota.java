package arabaprojesiday6;

public class Toyota extends Car {
	
	
	
	 protected String make = "Toyota";
	    protected String model = "Corolla";
	    protected int year = 2009;
	
	    
	    public Toyota(){
	    	
	    }
	    public   Toyota(String model,int year){
	    	 
	    	 this.model=model;
	    	 this.year=year;
	    	 
	     }
	
	/*
    Bir class olusturunuz adi Toyota olsun
    icerisinde 3 instance variable olsun 
    protected String make = "Toyota";
    protected String model = "Corolla";
    protected int year = 2009;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz 
    */

	public static void main(String[] args) {
	
		Toyota newToyota = new Toyota();
		  System.out.println("Arabanin markasi: "+newToyota.make);
	         System.out.println("Arabanin modeli: "+newToyota.model);
	         System.out.println("Arabanin yili: "+newToyota.year);
	         
		
		
		Toyota newToyota2 = new Toyota("Avensis",2013);
		  
        System.out.println("Arabanin markasi: "+newToyota2.arabaMarkasi());
        System.out.println("Arabanin modeli: "+newToyota2.arabaModeli());
        System.out.println("Arabanin yili: "+newToyota2.arabaYili());
        
        
		
		

	}
	public String arabaMarkasi(){
		return make;
	}
	  public  String arabaModeli( ){
			return model;
			
			}
		     public  int arabaYili(){
			return year;
			
		}

}
