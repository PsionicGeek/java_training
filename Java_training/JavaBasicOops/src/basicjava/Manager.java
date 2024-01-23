package basicjava;

public class Manager extends Employee {
	int pettyfee;
	int member;
	int incentive;
	public Manager(int id, int salary, String name, int deptid, int pettyfee, int member, int incentive) {
		super(id, salary, name, deptid);
		this.pettyfee = pettyfee;
		this.member = member;
		this.incentive = incentive;
	}
	public int getPettyfee() {
		return pettyfee;
	}
	public void setPettyfee(int pettyfee) {
		this.pettyfee = pettyfee;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	@Override
	public String toString() {
		return "Manager [pettyfee=" + pettyfee + ", member=" + member + ", incentive=" + incentive + super.toString();
	}
	@Override
	public int anualSalary() {
		System.out.println("Manager wala anual salary ");
		return this.getsalary()*12 + this.pettyfee+this.incentive;
	}
}
