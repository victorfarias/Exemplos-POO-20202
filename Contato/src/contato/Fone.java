package contato;

public class Fone {
	private String label, number;
	
	public Fone(String label, String number) {
		this.label = label;
		this.number = number;
	}
		
	public String getLabel() {
		return this.label;
	}
	public String getNumber() {
		return this.number;
	}

	public static boolean validate(String number) {
		String validacao = "1234567890().";
		for(int i=0; i<number.length(); i++) {
			if(validacao.indexOf(number.charAt(i)) == -1) {				
				return false;
			}
		}		
		return true;
	}	
	
}
