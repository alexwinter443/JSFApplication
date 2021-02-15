/*
 * Alex vergara
 * Professor Jackson
 * Date: 2/14/2021
 * JSF Application
 * THIS IS MY OWN WORK
 * 
 */
package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.sun.tools.javac.util.List;


@ManagedBean
public class Orders {

	ArrayList <Order> orders = new ArrayList<Order>();

	// instantiate orders
	public Orders() {
		orders.add(new Order("00000000", "This is product 1", (float)1121.00,1));
		orders.add(new Order("00000001", "This is product 2", (float)312.00,14));
		orders.add(new Order("00000002", "This is product 3", (float)161212.00,1100));
		orders.add(new Order("00000003", "This is product 4", (float)2011.00,1838));
		orders.add(new Order("00000004", "This is product 5", (float)1000.00,1382));
		orders.add(new Order("00000005", "This is product 6", (float)15000.00,1382));
		orders.add(new Order("00000006", "This is product 7", (float)14000000.00,1222));
		orders.add(new Order("00000007", "This is product 8", (float)181711.00,12323));
		orders.add(new Order("00000008", "This is product 9", (float)16762.00,1121));
		orders.add(new Order("00000009", "This is product 10", (float)10002.00,1121));
	}
	
	//getters and setters
	public ArrayList<Order> getOrders(){
		return orders;
	}
	
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	
}
