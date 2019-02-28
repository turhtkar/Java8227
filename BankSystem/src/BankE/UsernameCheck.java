package BankE;

public class UsernameCheck {

	    String username;

	    @Override
		public  String toString() {
			return "Welcome " + username;
		}

		public UsernameCheck(String username) {
			super();
			this.username = username;

	    }

	    public Boolean isValid() {
	        return this.username.matches("[A-Za-z\\u0590-\\u05FF]*");
	    }
	}

