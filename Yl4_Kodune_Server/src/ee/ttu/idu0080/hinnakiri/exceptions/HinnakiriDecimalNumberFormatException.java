package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;
@WebFault(name = "HinnakiriDecimalNumberFormatFault")

public class HinnakiriDecimalNumberFormatException extends Exception {

 private HinnakiriDecimalNumberFormatFault faultInfo;
 
 public HinnakiriDecimalNumberFormatException() {
	 this("Number is in an incorrect format (only 2 decimal places allowed)");
 }
 public HinnakiriDecimalNumberFormatException(String message) {
	 super(message);
	
	 // Set fault message
	 faultInfo = new HinnakiriDecimalNumberFormatFault();
	 faultInfo.setMessage(message);
 }
 
 public HinnakiriDecimalNumberFormatException(String message,
 HinnakiriDecimalNumberFormatFault faultInfo) {
	 super(message);
	
	 this.faultInfo = faultInfo;
 }
 
 public HinnakiriDecimalNumberFormatFault getFaultInfo() {
	 return faultInfo;
 }

}
