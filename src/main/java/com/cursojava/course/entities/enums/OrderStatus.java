package com.cursojava.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}//transforma o codigo em um string orderstatus 
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
