package com.virtusa.zomato.model;

public class DeliveryDetail {

	private int deliveryId;
	private float rating;
	private DeliveryBoy deliveryBoy;
	private OrderDetail orderDetail;
	public DeliveryDetail(int deliveryId, float rating, DeliveryBoy deliveryBoy, OrderDetail orderDetail) {
		super();
		this.deliveryId = deliveryId;
		this.rating = rating;
		this.deliveryBoy = deliveryBoy;
		this.orderDetail = orderDetail;
	}
	public int getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public DeliveryBoy getDeliveryBoy() {
		return deliveryBoy;
	}
	public void setDeliveryBoy(DeliveryBoy deliveryBoy) {
		this.deliveryBoy = deliveryBoy;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryBoy == null) ? 0 : deliveryBoy.hashCode());
		result = prime * result + deliveryId;
		result = prime * result + ((orderDetail == null) ? 0 : orderDetail.hashCode());
		result = prime * result + Float.floatToIntBits(rating);
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
		DeliveryDetail other = (DeliveryDetail) obj;
		if (deliveryBoy == null) {
			if (other.deliveryBoy != null)
				return false;
		} else if (!deliveryBoy.equals(other.deliveryBoy))
			return false;
		if (deliveryId != other.deliveryId)
			return false;
		if (orderDetail == null) {
			if (other.orderDetail != null)
				return false;
		} else if (!orderDetail.equals(other.orderDetail))
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DeliveryDetail [deliveryId=" + deliveryId + ", rating=" + rating + ", deliveryBoy=" + deliveryBoy
				+ ", orderDetail=" + orderDetail + "]";
	}
	
	
}
