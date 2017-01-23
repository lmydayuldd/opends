package eu.opends.car;

import eu.opends.car.SteeringCar;

public class ReturnValue {
	float mul;
	
	Context context = new Context();
	
	if(isRaining){
		with(RainLayer){
			mul = 	context.getRate()
		}
	}

	if(isSnowing){
		with(SnowLayer){
			mul = 	context.getRate()
		}
	}

	if(isFog){
		with(FogLayer){
			mul = 	context.getRate()
		}
	}
	
	public float getMul{
		return mul;
	}
}

