//Flipkart.java (target class)
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	//HAS- property
	@Autowired
	@Qualifier("bDart")
  private ICourier courier;
  
  public Flipkart() {
	System.out.println("Flipkart:: 0-param constructor");
}
  
  
  
  //b.method
  public  String shopping(String  items[], double prices[] ) {
	  System.out.println("Flipkart.shopping()");
	  //calculate bill amount
	  double billAmt=0.0;
	  for(double p:prices) {
		  billAmt=billAmt+p;
	  }
	  //generate order id randomly
	   int oid=new Random().nextInt(100000);
	  // deliver the order using couier
	  	  String msg=courier.deliver(oid);
	  return Arrays.toString(items)+"are shopped having bill amount::"+billAmt+" --->"+msg;
  }
  
  
}
