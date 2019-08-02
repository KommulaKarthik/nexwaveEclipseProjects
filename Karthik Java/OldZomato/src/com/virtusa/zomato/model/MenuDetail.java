package com.virtusa.zomato.model;

public class MenuDetail {
	
	private int menuId;
	private String menuName;
	private float menuPrice;
	public MenuDetail(int menuId, String menuName, float menuPrice) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	public MenuDetail() {
		// TODO Auto-generated constructor stub
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public float getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(float menuPrice) {
		this.menuPrice = menuPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + menuId;
		result = prime * result + ((menuName == null) ? 0 : menuName.hashCode());
		result = prime * result + Float.floatToIntBits(menuPrice);
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
		MenuDetail other = (MenuDetail) obj;
		if (menuId != other.menuId)
			return false;
		if (menuName == null) {
			if (other.menuName != null)
				return false;
		} else if (!menuName.equals(other.menuName))
			return false;
		if (Float.floatToIntBits(menuPrice) != Float.floatToIntBits(other.menuPrice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MenuDetail [menuId=" + menuId + ", menuName=" + menuName + ", menuPrice=" + menuPrice + "]";
	}
	
	

}
