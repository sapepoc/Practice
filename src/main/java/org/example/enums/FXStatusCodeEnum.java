package org.example.enums;

public enum FXStatusCodeEnum {

	MARSHALLING_SUCESS(2000, "Marshelling Sucess"),
	MARSHALLIG_ERROR(2004, "Marshallling  Error"), 
	ALERT_NOT_FOUND(3004, "Not Found"), 
	ALERT_SENT(3000, "Alert Sent Sucessfully");

	private final int value;

	private final String infoMessge;

	FXStatusCodeEnum(int value, String infoMessge) {
		this.value = value;
		this.infoMessge = infoMessge;
	}

	@Override
	public String toString() {
		return Integer.toString(this.value);
	}

	public enum Series {

	RULES(1),MARSHALLING(2), ALERT(3), EVENTS(4), PROXYSERVICE(5);

		private final int value;

		Series(int value) {
			this.value = value;
		}

		public int value() {
			return this.value;
		}

		public static Series valueOf(int status) {
			int seriesCode = status / 100;
			for (Series series : values()) {
				if (series.value == seriesCode) {
					return series;
				}
			}
			throw new IllegalArgumentException("No matching constant for [" + status + "]");
		}

	}

}
