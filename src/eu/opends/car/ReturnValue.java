package eu.opends.car;

import eu.opends.car.SteeringCar;

public class ReturnValue {
	float mul;
	layer="SunnyLayer";
	
	public ReturnValue(boolean isRain, boolean isSnow){
		Context context = new Context();
		
		if(isRain){
			layer = "RainLayer";
		}else if(isSnow){
			layer = "SnowLayer";
		}else{
			layer = "SunnyLayer";
		}
		
		with(layer){
			mul = context.setRate();
		}
	}
	
	public float getValue(){
		return mul;
	}
	
}

