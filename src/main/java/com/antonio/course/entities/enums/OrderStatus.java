package com.antonio.course.entities.enums;

public enum OrderStatus {
	
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	//Construtor
	private OrderStatus(int codigo) {
		this.codigo = codigo;
	}
	//Metodo
	public int getCodigo() {
		return codigo;
	}
	public static OrderStatus valueOf(int codigo) {
		for(OrderStatus value : OrderStatus.values()) {
			if (value.getCodigo() == codigo) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo de pedido invalido");
	}
}
