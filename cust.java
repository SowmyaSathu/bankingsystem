package LEP.uzair.bms.bank;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
class cust{
	String name,area;
	String accno;
	double phone,balance;
	public cust (String name,  String accno,  double balance, String area, double phone)
	{
		this.name=name;
		this.accno=accno;
		this.balance=balance;
		this.area=area;
		this.phone=phone;
	}
}
	
public class BankMain{
	public static void main(String args[]) {
		ArrayList <cust> list=new ArrayList<cust>();
		cust c1=new cust("avinash","1234",600000,"ecil",945959);
		cust c2=new cust("monika","9445",970670,"hbcolony",65865);
		cust c3=new cust("sonu","9090",100000,"sainikpuri",98499);
		cust c4=new cust("ramesh","4567",90333,"rampally",95844);
		cust c5=new cust("suresh","7684",90904,"neredmet",97866);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		for(cust b:list) {
			System.out.printf("name:%s \n", b.name);
			System.out.println(b.accno);
			System.out.println(b.balance);
			System.out.println(b.phone);
			System.out.printf("end of %s detailss",b.name);
			System.out.println("\n\n");
		}

		 Start objectStart = new Start();
		   objectStart.StartBank();
	}

 
private List<String> readFile(String filename) {
	  List<String> records = new ArrayList<String>();
	    try
	    {
	      BufferedReader reader = new BufferedReader(new FileReader(filename));
	      String line;
	      while ((line = reader.readLine()) != null)
	      {
	        records.add(line);
	      }
	      reader.close();
	      return records;
	    }
	    catch (Exception e)
	    {
	      System.err.format("Exception occurred trying to read '%s'.", filename);
	      e.printStackTrace();
	      return null;
	    }
	
}
 }
