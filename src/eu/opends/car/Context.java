package eu.opends.car;

public class Context {
	public float getRate(){
		return 1.0f;
	}
}

Layer RainLayer{
	public float Context.getRate(){
		return proceed() + 0.3
	}
}

Layer SnowLayer{
	public float Context.getRate(){
		return proceed() + 0.5
	}
}

Layer FogLayer{
	public float Context.getRate(){
		return proceed() + 0.1
	}
}