
public class MaharastraStyleFood extends FoodDecorator{

	
	
	public MaharastraStyleFood(Food newFood) 
	{
		super(newFood);
		
	}
	
	
	
	public String prepareFood()
	{
		return super.prepareFood() +" With Dal Chawal Roti Sabji and Sweets  "; 
		
	}
	
	
	public double foodPrice()
	{
		return super.foodPrice()+150.0;
		
	}


}
