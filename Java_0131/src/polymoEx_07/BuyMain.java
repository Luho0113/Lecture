package polymoEx_07;


public class BuyMain {

	public static void main(String[] args) {
		// ����
		
		BuyBusiness BB = new BuyBusiness();
		BB.sales(new Computer(0, 0));
		BB.sales(new Printer(0, 0));
		// BB.sales(new Product());
		

	}

}
