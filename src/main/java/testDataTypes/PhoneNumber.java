package testDataTypes;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {

	private String home;
	private String mob;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}