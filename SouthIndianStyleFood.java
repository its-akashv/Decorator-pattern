
public class SouthIndianStyleFood extends FoodDecorator
{
	
	
	
    public SouthIndianStyleFood(Food newFood) 
    {
		super(newFood);
		
	}


	public String prepareFood()
	{
		return super.prepareFood() +" With  Sambar and Idli "; 
		
	}
	
	
	public double foodPrice()
	{
		return super.foodPrice()+65.0;
		
	}

}
