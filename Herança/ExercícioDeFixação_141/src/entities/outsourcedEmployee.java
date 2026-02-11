package entities;

public class outsourcedEmployee extends Employee{
	private Double charge;

	
	public outsourcedEmployee() {
		super();
	}
	
	public outsourcedEmployee(String name, Integer hour, double valuePerHour, Double charge) {
		super(name, hour, valuePerHour);
		this.charge = charge;
	}
	
	public Double getCharge() {
		return charge;
	}


	public void setCharge(Double charge) {
		this.charge = charge;
	}


	@Override
	public Double payment() {
		return super.payment() + (charge * 1.10);
	}

}
