package javapracticeday5;

public class OCASorusu {

	public static void main(String[] args) {
		 String str = "M ";//M 
	        str = str.concat("E ");//M E 
	        String add = "S ";//S 
	        str = str.concat(add);//M E S 
	        str.replace("S","T");          //Atama olmadigi icin str yi degistirmiyor, veya syso nun icine yazmaliydik
	        str = str.concat(add);//M E S S
	        System.out.println(str);
	/*
	        Netice nasil olur?
	        */

	  /*      String names = " Aydin Erkan Ersin";
	        names+=names.replace(" Erkan"," ");
	        System.out.println(names);
	    */
	       String name = "Cevdet";
	       name+= " Ahmet";
	       
	        System.out.println(name);
	        
	        int num = 23;
	        num=num+12;
	        num+=5;
	        System.out.println(++num);   //öncesine ++ korsak eklenmis olur ama num++ olursa bir sonraki nam i cagirinca artmis olur.
	        
	        
	        
	        int num2 = 32;
	        
	        num2= 12;
	        
	        System.out.println(++num2);
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
