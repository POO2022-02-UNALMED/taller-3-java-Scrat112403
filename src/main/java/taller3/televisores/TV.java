package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	public TV (Marca mar, boolean esta) {
		numTV ++;
		marca = mar;
		estado = esta;
	}
	public void setMarca(Marca mar) {
		marca = mar;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control con) {
		control = con;
	}
	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int pre) {
		precio = pre;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volu) {
		if(estado == true && volu>=1 && volu<=7) {
			volumen = volu;
		}
	}
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int can) {
		if (estado == true && can>=1 && can<=120) {
			canal = can;
		}
	}
	public int getCanal() {
		return canal;
	}
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public void volumenUp() {
		if (estado == true && volumen>=0 && volumen<7) {
		    volumen ++;
		}
	}
	public void volumenDown() {
		if (estado == true && volumen>0 && volumen<=7) {
		    volumen --;
		}
	}
	
	public void canalUp() {
		if (estado == true && canal>=1 && canal<120) {
			canal ++;
		}
	}
	public void canalDown() {
		if (estado == true && canal>1 && canal<=120) {
		    canal --;
		}
	}
	
}