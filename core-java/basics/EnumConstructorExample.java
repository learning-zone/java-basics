enum TrafficSignal {
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

	private final String action;

	TrafficSignal(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}
}

public class EnumConstructorExample {
	public static void main(String[] args) {
		for (TrafficSignal signal : TrafficSignal.values()) {
			System.out.println("name: " + signal.name() + "  action: " + signal.getAction());
		}
	}
}
