package com.ffi.financialcompany.endpoint;

public class RequestJson {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RequestJson [data=" + data + "]";
	}
}
