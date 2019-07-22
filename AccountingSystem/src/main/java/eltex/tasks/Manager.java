package eltex.tasks;

public class Manager extends User {

	private Sales [] sales = new Sales[3];

	{
		sales[0] = new Sales();
		sales[1] = new Sales();
		sales[2] = new Sales();
	}

	Manager () {};

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

		String [] arg = new String[3];

		for (int i = 0; i < 3; ++i) 
			arg[i] = this.sales[i].getTitle();
		
		String str = String.join("; ", arg);

		return str;
	}

	public String getPrice () {

		String [] arg = new String[3];

		for (int i = 0; i < 3; ++i) 
			arg[i] = this.sales[i].getPrice();
		
		String str = String.join("; ", arg);

		return str;
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

	public void setTitle (String arg, int i) {

		this.sales[i].setTitle(arg);
	}

	public void setPrice (String arg, int i) {

		this.sales[i].setPrice(arg);
	}

	public String toCSV() {

		String [] arg = new String[2];

		arg[0] = getTitle();
		arg[1] = getPrice();

		String str = String.join("; ", arg);

		return this.id.toString() + "; " + this.fio + "; " + this.phone + "; " + this.email + "; " + str + "; ";
	}

	public void fromCSV(String str) {

		String [] arg = str.split(";");
		setId (arg [0]);
		setFio (arg [1]);
		setPhone (arg [2]);
		setEmail (arg [3]);

		for (int i = 0, j = 4, k = 7; i < sales.length; ++i, ++j, ++k) {
			setTitle(arg[j],i);
			setPrice(arg[k],i);
		}
	}
}
