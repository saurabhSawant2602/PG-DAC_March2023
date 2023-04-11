package domain;

import java.util.Arrays;

public class SalesPerson {
    private String name;
    private int id;
    private double[] salesFigures;
    public SalesPerson() {
    	//
    }
    
    //name , id , last 12 months sales figures
	public SalesPerson( int id,String name, double[] salesFigures) {
	
		this.name = name;
		this.id = id;
		this.salesFigures = salesFigures;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double[] getSalesFigures() {
		return salesFigures;
	}

	public void setSalesFigures(double[] salesFigures) {
		this.salesFigures = salesFigures;
	}

	public double calculateTotalFigs() {
		double sum=0;
		for(int i=0;i<this.salesFigures.length;i++) {
			sum+=this.salesFigures[i];
		}
		
		
		return sum;
	}
	
	
	@Override
	public String toString() {
		return "SalesPerson [name=" + name + ", id=" + id + ", salesFigures=" + Arrays.toString(salesFigures) + "]";
	}
	
	
    
}
