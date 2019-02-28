package BankE;

public class RegularClient extends Bank implements ClientsInterface {

	public RegularClient(int money) {
		super(money);
		this.money = money;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int TotalNIS(int a) {
		// TODO Auto-generated method stub
		a = money;
		return getMoney();
	}

	@Override
	public int totalAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdrawNIS(int b) {
		// TODO Auto-generated method stub
		if(b>5020) {
			throw new IllegalArgumentException("error:Invalid value " + "ClientType regular cannot withdraw more than 5020");
		}else
			return money - b;
	}

	@Override
	public int depositNIS(int c) {
		// TODO Auto-generated method stub
		return money + c;
	}

	@Override
	public int addAccount() {
		return money;
		// TODO Auto-generated method stub
	}

	@Override
	public int removeAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ClientsType getType() {
		// TODO Auto-generated method stub
		return ClientsType.Regular;
	}

	@Override
	public ClientsType getStatus() {
		// TODO Auto-generated method stub
		if(TotalNIS(money)>(-7000) & TotalNIS(money)<0) {
			return ClientsType.warned;
		} else if(TotalNIS(money)>0) {
			return ClientsType.allowed;
		} else if (TotalNIS(money)<(-7000)) {
			return ClientsType.blocked;
		}
		return null;
	}

	
}
