package MyFirstProject;

public class Complexe {

	private double real;
	private double img;

	Complexe() {
		this.real = 0;
		this.img = 0;
	}

	Complexe(double Real) {
		this.real = Real;
		this.img = 0;
	}

	Complexe(double Real, double Img) {
		this.real = Real;
		this.img = Img;
	}

	Complexe multiply(double scalar) {
		Complexe num = new Complexe();
		num.real = this.real * scalar;
		num.img = this.img * scalar;
		return num;
	}
	
	public String toString() {
		return this.real + " + i"+this.img;
	}
	
	

}
