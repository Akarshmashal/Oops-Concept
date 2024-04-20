package arraylist;

import java.util.*;

public class Customer 
{	
	int customer_id;
	String cname;
	long contact;

	public Customer(int customer_id, String cname, long contact) 
	{
		this.customer_id = customer_id;
		this.cname = cname;
		this.contact = contact;
	}
	@Override
	public String toString() 
	{
		return "customer_id=" + customer_id +
				", cname=" + cname + ", contact=" + contact +"";
	}
	
	public static void main(String[] args)
	{
		Customer c=new Customer(112, "Akarsh", 9742671446l);
		Customer c1=new Customer(113, "Pratham", 8742671446l);
		Customer c2=new Customer(114, "Shakti", 7742671446l);

		List<Customer>lst=new ArrayList();
		lst.add(c);
		lst.add(c1);
		lst.add(c2);

		System.out.println(lst);

		ListIterator<Customer> lsti=lst.listIterator();
		System.out.println("---------In Forward Direction-----------");
		while(lsti.hasNext())
		{
			System.out.println(lsti.next());
		}
		System.out.println("---------In Reverse Direction------------");
		while(lsti.hasPrevious())
		{
			System.out.println(lsti.previous());
		}
	}

}
