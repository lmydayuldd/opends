package eu.opends.car;

import eu.opends.car.SteeringCar;

public class ReturnValue {
	float mul;
	String layer;
	
	public ReturnValue{
		Context context = new Context();
		
		if(isRaining){
			layer = "RainLayer";
		}else if(isSnowing){
			layer = "SnowLayer";
		}else if(isFog){
			layer = "FogLayer"
		}else{
			layer = "SunnyLayer";
		}
		
		with(layer){
			mul = context.setRate();
		}
		return this.mul;
	}
}

