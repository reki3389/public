package com.yedam.generic;

public class Product<T, M> {
	private T Kind;
	private M model;

	@Override
	public String toString() {
		return "Product [Kind=" + Kind + ", model=" + model + "]";
	}

	public T getKind() {
		return Kind;
	}

	public void setKind(T kind) {
		Kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

}
