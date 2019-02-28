package BankE;

public interface ClientsInterface {
	
	//reports
	int TotalNIS(int a);
	int totalAccounts();
	//actions
	int withdrawNIS(int b);
	int depositNIS(int c); 
	int addAccount();
	int removeAccount();
	ClientsType getType();
	ClientsType getStatus();
	
}
