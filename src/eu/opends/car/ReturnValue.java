//package eu.opends.car;
//
//import eu.opends.car.SteeringCar;

public class ReturnValue {
	float mul;
	String lay;
	float test = 1.0f;

	public ReturnValue(){
		float test = 1.0f;
		Context context = new Context();
		if(isRain){
			lay = "RainLayer";
		}else if(isSnow){
			lay = "SnowLayer";
		}else{
			lay = "SunnyLayer";
		}
		with(lay){
			mul = context.setRate();
		}
	}
	public float getValue(){
		return mul;
	}
}

//ReturnValue value = new ReturnValue(isRain, isSnow);
//value.getValue();

//public class ReturnValue {
//	float mul;
//	String layer="SunnyLayer";
//	public ReturnValue(boolean isRain, boolean isSnow){
//		Context context = new Context();
//		if(isRain){
//			layer = "RainLayer";
//		}else if(isSnow){
//			layer = "SnowLayer";
//		}else{
//			layer = "SunnyLayer";
//		}
//		with(layer){
//			mul = context.setRate();
//		}
//	}
//	public float getValue(){
//		return mul;
//	}
//}

