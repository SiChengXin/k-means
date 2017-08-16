package GUI;

public class Manual_Controller {
	
	
	public void connect(String meg){
		 System.out.println(meg);
	}
	public void Forward_Pressed(){
		 System.out.println("Received Forward Command");
	}
	public void	Left_Pressed(){
		 System.out.println("Received Left Command");
	}
	public void	Right_Pressed(){
		 System.out.println("Received Right Command");
	}
	public void	Back_Pressed(){
		 System.out.println("Received Back Command");
	}
	public void	Stop_Pressed(){
		System.out.println("Received Stop Command");
	}
}
