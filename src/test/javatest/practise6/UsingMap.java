/**
 *??8?????????????
 */

//???HashMap???TreeMap????¡Â?
import java.util.*;
class Mortgage{

	private double annualInterestRate;//??????
	private int numberOfYears;//????????
	private double loanAmount;//????????

	public Mortgage(){
		this(6.0,10,10000);
	}
	public Mortgage(double interestRate,int years,double loan){
		this.annualInterestRate = interestRate;
		this.numberOfYears = years;
		this.loanAmount = loan;
	}

	public double getAnnualInterestRate(){//?????????
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double interestRate){//??????????
		this.annualInterestRate = interestRate;
	}

	public int getNumberOfYears(){
		return numberOfYears;
	}
	public void setNumberOfYears(int years){
		this.numberOfYears = years;
	}

	public double getLoanAmount(){
		return loanAmount;
	}
	public void setLoanAmount(double loan){
		this.loanAmount = loan;
	}

	//??????????
	public double monthlyPayment(){
		double monthlyInterestRate = annualInterestRate/1200;
		return loanAmount * monthlyInterestRate/ (1 -
			(Math.pow(1/(1 + monthlyInterestRate),numberOfYears * 12)));
	}
	//??????????
	public double totalPayment(){
		return monthlyPayment() * 12 * numberOfYears;
	}
}

public class UsingMap {
  public static void main(String args[]) {
	  //?????????
	  HashMap hashMap = new  HashMap();
	  hashMap.put("????",new Mortgage(6.5,10,20000));
	  hashMap.put("????",new Mortgage(6.5,10,30000));
	  hashMap.put("???",new Mortgage(6.5,15,30000));
	  hashMap.put("?????",new Mortgage(6.5,15,10000));

	  //???????????????
	  System.out.println("??????????????" +
		  ((Mortgage)(hashMap.get("????"))).getLoanAmount());
	  //??????????????
	  TreeMap treeMap = new  TreeMap(hashMap);

	  Set entrySet = treeMap.entrySet();
	  Iterator iterator = entrySet.iterator();

	  System.out.println("\n??????????????????"); 
	  while(iterator.hasNext()){
		  System.out.println(iterator.next());
	  }
  }
}
