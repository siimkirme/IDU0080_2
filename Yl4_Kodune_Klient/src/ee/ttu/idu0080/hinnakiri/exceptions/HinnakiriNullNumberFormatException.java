package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;
@WebFault(name = "HinnakiriNullNumberFault")

public class HinnakiriNullNumberFormatException extends Exception{

	private HinnakiriNullNumberFormatFault faultInfo;
	
	public HinnakiriNullNumberFormatException() {
		 this("Number is in an incorrect format (0 not allowed)");
	}
	
	 public HinnakiriNullNumberFormatException(String message) {
		 super(message);
		
		 // Set fault message
		 faultInfo = new HinnakiriNullNumberFormatFault();
		 faultInfo.setMessage(message);
	 }
	 
	 public HinnakiriNullNumberFormatException(String message,
	 HinnakiriNullNumberFormatFault faultInfo) {
		 super(message);
		
		 this.faultInfo = faultInfo;
	 }
	 
	 public HinnakiriNullNumberFormatFault getFaultInfo() {
		 return faultInfo;
	 }
}
