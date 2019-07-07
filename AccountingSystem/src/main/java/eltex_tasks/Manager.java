package eltex_tasks;

public class Manager extends User {

	protected Sales [] sales = new Sales[3];

	{
		sales[0] = new telephone();
		sales[1] = new headphone();
		sales[2] = new keyboard();
	}

	Manager () {};

	public void speak () {

		System.out.print("Hello! Im a Manager! ");

	}

	public Integer getId () {

		return this.id;
	}

	public String getFio () {

		return this.fio;
	}

	public String getPhone () {

		return this.phone;
	}

	public String getEmail () {

		return this.email;
	}

	public String getTitle () {

		return this.sales[this.id].getTitle();
	}

	public int getPrice () {

		return this.sales[this.id].getPrice();
	}

	public void setId (String arg) {

		this.id = Integer.valueOf(arg);
	}
	

	public void setFio (String arg) {

		this.fio = arg;
	}

	public void setPhone (String arg) {

		this.phone = arg;
	}

	public void setEmail (String arg) {

		this.email = arg;
	}


	public String toCSV() {

		return this.id.toString() + " ; " + this.fio + " ; " + this.phone + " ; " + this.email + " ; " + this.sales[this.id].getTitle() + " ; "
		+  this.sales[this.id].getPrice();
	}

	public void fromCSV(String str) {

		String [] arg = str.split(";");
		setId (arg [0]);
		setFio (arg [1]);
		setPhone (arg [2]);
		setEmail (arg [3]);
	}
}
