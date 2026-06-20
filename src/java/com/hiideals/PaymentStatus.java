package com.hiideals;

public class PaymentStatus {
	String status;
	String error_desc;
	String data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError_desc() {
		return error_desc;
	}

	public void setError_desc(String error_desc) {
		this.error_desc = error_desc;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PaymentStatus [status=" + status + ", error_desc=" + error_desc
				+ ", data=" + data + "]";
	}

}
