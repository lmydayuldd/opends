package eu.opends.car;

public class Context {
	public float setRate(){
		return 1.0f;
	}
}

Layer RainLayer{
	public float Context.setRate(){
		return proceed() + 0.3f
	}
}

Layer SnowLayer{
	public float Context.setRate(){
		return proceed() +0.5f
	}
}

Layer FogLayer{
	public float Context.setRate(){
		return proceed() + 0.1f
	}
}

Layer SunnyLayer{
	public float Context.setRate(){
		return proceed();
}