package com.virtusa.zomato.model;

public class OrderDetail {
	
	private int orderId;
	private int orderQuantity;
	private String orderStatus;
	private RestaurantDetail restaurantDetail;
	private OfferDetail offerDetail;
	private MenuDetail menuDetail;
	private CustomerDetail customerDetail;
	public OrderDetail(int orderId, int orderQuantity, String orderStatus, RestaurantDetail restaurantDetail,
			OfferDetail offerDetail, MenuDetail menuDetail, CustomerDetail customerDetail) {
		super();
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
		this.orderStatus = orderStatus;
		this.restaurantDetail = restaurantDetail;
		this.offerDetail = offerDetail;
		this.menuDetail = menuDetail;
		this.customerDetail = customerDetail;
	}
	
	
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}


	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public RestaurantDetail getRestaurantDetail() {
		return restaurantDetail;
	}
	public void setRestaurantDetail(RestaurantDetail restaurantDetail) {
		this.restaurantDetail = restaurantDetail;
	}
	public OfferDetail getOfferDetail() {
		return offerDetail;
	}
	public void setOfferDetail(OfferDetail offerDetail) {
		this.offerDetail = offerDetail;
	}
	public CustomerDetail getCustomerDetail() {
		return customerDetail;
	}
	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}
	
	
	public MenuDetail getMenuDetail() {
		return menuDetail;
	}


	public void setMenuDetail(MenuDetail menuDetail) {
		this.menuDetail = menuDetail;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerDetail == null) ? 0 : customerDetail.hashCode());
		result = prime * result + ((menuDetail == null) ? 0 : menuDetail.hashCode());
		result = prime * result + ((offerDetail == null) ? 0 : offerDetail.hashCode());
		result = prime * result + orderId;
		result = prime * result + orderQuantity;
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((restaurantDetail == null) ? 0 : restaurantDetail.hashCode());
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
		OrderDetail other = (OrderDetail) obj;
		if (customerDetail == null) {
			if (other.customerDetail != null)
				return false;
		} else if (!customerDetail.equals(other.customerDetail))
			return false;
		if (menuDetail == null) {
			if (other.menuDetail != null)
				return false;
		} else if (!menuDetail.equals(other.menuDetail))
			return false;
		if (offerDetail == null) {
			if (other.offerDetail != null)
				return false;
		} else if (!offerDetail.equals(other.offerDetail))
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderQuantity != other.orderQuantity)
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (restaurantDetail == null) {
			if (other.restaurantDetail != null)
				return false;
		} else if (!restaurantDetail.equals(other.restaurantDetail))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "OrderDetail [orderId=" + orderId + ", orderQuantity=" + orderQuantity + ", orderStatus=" + orderStatus
				+ ", restaurantDetail=" + restaurantDetail + ", offerDetail=" + offerDetail + ", menuDetail="
				+ menuDetail + ", customerDetail=" + customerDetail + "]";
	}


	
	

}
