package com.lx.test.entity.system;

public class Role {

	private String roleId ;
	private String roleName ;
	private Right right ;
	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * @return the right
	 */
	public Right getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(Right right) {
		this.right = right;
	}
	
	
}
