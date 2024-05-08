//DHL.java (depedent class3)
package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("courier")
@Lazy(true)
public final class DHLjava implements ICourier {

	public DHLjava() {
		System.out.println("DHL:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		
		return "DHL courier is ready to deliver "+oid+" order number  products ";
				
	}

}
