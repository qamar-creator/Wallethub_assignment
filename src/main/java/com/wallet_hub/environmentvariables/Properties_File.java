package com.wallet_hub.environmentvariables;


import java.io.FileInputStream;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Properties_File {
	
	 static String required_element;
	  
	public static String readproperties(int which_element) throws IOException
	{
		
		
		Properties prop=new Properties();
		
		InputStream input= new FileInputStream(Globals.path+"\\src\\main\\java\\com\\wallet_hub\\environmentvariables\\config.properties");
	     
		prop.load(input);
		String url=prop.getProperty("url");
	    String username=prop.getProperty("username") ;
	    String password=prop.getProperty("password") ;
	    switch(which_element)
	    {
	    case 1:
	    	
		 required_element=url;
		 break;
	    case 2:
	    	required_element=username;
	    	break;
	    case 3:
	    	required_element=password;
	    	break;
	    }
	    
	    
	    return required_element;
	}
	
	public static String wallet_readprperties( int which_element) throws IOException
	{
		
         Properties prop=new Properties();
		InputStream input= new FileInputStream(Globals.path+"\\src\\main\\java\\com\\wallet_hub\\environmentvariables\\config.properties");
	    prop.load(input);
		String wallet_url=prop.getProperty("wallet_url");
	    String wallet_user_email=prop.getProperty("wallet_user_email") ;
	    String wallet_user_password=prop.getProperty("wallet_user_password") ;
	    String wallet_test_url=prop.getProperty("Wallet_test_url");
	    switch(which_element)
	    {
	    case 1:
	    	
		 required_element=wallet_url;
		 break;
	    case 2:
	    	required_element=wallet_user_email;
	    	break;
	    case 3:
	    	required_element= wallet_user_password;
	    	break;
	    	
	    case 4:
	    	required_element= wallet_test_url;
	    	break;
	    	
	    }
	    
	    
	    return required_element;
	}
		
		
	}

 
