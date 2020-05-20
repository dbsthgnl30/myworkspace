package com.naver;

import java.io.Serializable;

public class RsvDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rsv_id;
	private String cus_id;
	private String mv_mvId;
	private String th_thId;
	private String day;
	private String Time;
	private String num;
	private String paymentMethod;
	private String total;
	
	public RsvDTO() {
		// TODO Auto-generated constructor stub
	}

	public RsvDTO(String rsv_id, String cus_id, String mv_mvId, String th_thId, String day, String time, String num,
			String paymentMethod, String total) {
		super();
		this.rsv_id = rsv_id;
		this.cus_id = cus_id;
		this.mv_mvId = mv_mvId;
		this.th_thId = th_thId;
		this.day = day;
		Time = time;
		this.num = num;
		this.paymentMethod = paymentMethod;
		this.total = total;
	}

	public String getRsv_id() {
		return rsv_id;
	}

	public void setRsv_id(String rsv_id) {
		this.rsv_id = rsv_id;
	}

	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	public String getMv_mvId() {
		return mv_mvId;
	}

	public void setMv_mvId(String mv_mvId) {
		this.mv_mvId = mv_mvId;
	}

	public String getTh_thId() {
		return th_thId;
	}

	public void setTh_thId(String th_thId) {
		this.th_thId = th_thId;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rsv_id == null) ? 0 : rsv_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RsvDTO other = (RsvDTO) obj;
		if (rsv_id == null) {
			if (other.rsv_id != null)
				return false;
		} else if (!rsv_id.equals(other.rsv_id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cus_id + "의 예매 내역:" + "*******";  // 김지민 회원님의 영화 예매내역입니다. 
		// 영화: 신세계, 영화관: 강남cgv,  날짜: 5/11, 시간: 9시, 인원 2명 입니다. 이런식으로 나오게. 
	}
	
}
