package com.virtusa.zomato.model;

public class RestaurantMenuDetail {
	
	private int restaurantMenuId;
	private MenuDetail menuDetail;
	private RestaurantDetail restaurantDetail;
	public RestaurantMenuDetail(int restaurantMenuId, MenuDetail menuDetail, RestaurantDetail restaurantDetail) {
		super();
		this.restaurantMenuId = restaurantMenuId;
		this.menuDetail = menuDetail;
		this.restaurantDetail = restaurantDetail;
	}
	public RestaurantMenuDetail() {
		// TODO Auto-generated constructor stub
	}
	public int getRestaurantMenuId() {
		return restaurantMenuId;
	}
	public void setRestaurantMenuId(int restaurantMenuId) {
		this.restaurantMenuId = restaurantMenuId;
	}
	public MenuDetail getMenuDetail() {
		return menuDetail;
	}
	public void setMenuDetail(MenuDetail menuDetail) {
		this.menuDetail = menuDetail;
	}
	public RestaurantDetail getRestaurantDetail() {
		return restaurantDetail;
	}
	public void setRestaurantDetail(RestaurantDetail restaurantDetail) {
		this.restaurantDetail = restaurantDetail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuDetail == null) ? 0 : menuDetail.hashCode());
		result = prime * result + ((restaurantDetail == null) ? 0 : restaurantDetail.hashCode());
		result = prime * result + restaurantMenuId;
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
		RestaurantMenuDetail other = (RestaurantMenuDetail) obj;
		if (menuDetail == null) {
			if (other.menuDetail != null)
				return false;
		} else if (!menuDetail.equals(other.menuDetail))
			return false;
		if (restaurantDetail == null) {
			if (other.restaurantDetail != null)
				return false;
		} else if (!restaurantDetail.equals(other.restaurantDetail))
			return false;
		if (restaurantMenuId != other.restaurantMenuId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RestaurantMenuDetail [restaurantMenuId=" + restaurantMenuId + ", menuDetail=" + menuDetail
				+ ", restaurantDetail=" + restaurantDetail + "]";
	}
	
	
	
	

}
