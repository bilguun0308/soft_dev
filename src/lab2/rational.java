package lab2;

public class rational {
	private int hurt,noogd;
	public rational(int x,int y) {
		hurt = x;
		noogd = y;
	}
	public int getHurt() {
		return hurt;
	}
	public int getNoogd() {
		return noogd;
	}
	public void huwaah(rational b) {
		hurt= hurt*b.getNoogd();
		noogd = noogd*b.getHurt();
		huraah();
	}

	public void huraah() {
		int i = 0;
		int m = 1;
		for(i = 2; i <= Integer.min(hurt, noogd); i++){
			if(hurt%i ==0 && noogd%i==0){
				m = i;
			}
		}
		hurt = hurt/m;
		noogd = noogd/m;
	}

	public void nemeh(rational a) {
		hurt = hurt*a.getNoogd() + a.getHurt()*noogd;
		noogd = noogd*a.getNoogd();
		huraah();
	}

	public void urjih(rational a) {
		hurt = hurt*a.getHurt();
		noogd = noogd*a.getNoogd();
		huraah();
	}
}
