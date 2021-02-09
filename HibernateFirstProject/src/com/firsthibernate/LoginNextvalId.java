package com.firsthibernate;
// Generated 02 Sep 2020 10:42:48 AM by Hibernate Tools 5.3.0.Beta2

/**
 * LoginNextvalId generated by hbm2java
 */
public class LoginNextvalId implements java.io.Serializable {

	private String managerLastnr;
	private String userLastnr;

	public LoginNextvalId() {
	}

	public LoginNextvalId(String managerLastnr, String userLastnr) {
		this.managerLastnr = managerLastnr;
		this.userLastnr = userLastnr;
	}

	public String getManagerLastnr() {
		return this.managerLastnr;
	}

	public void setManagerLastnr(String managerLastnr) {
		this.managerLastnr = managerLastnr;
	}

	public String getUserLastnr() {
		return this.userLastnr;
	}

	public void setUserLastnr(String userLastnr) {
		this.userLastnr = userLastnr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LoginNextvalId))
			return false;
		LoginNextvalId castOther = (LoginNextvalId) other;

		return ((this.getManagerLastnr() == castOther.getManagerLastnr())
				|| (this.getManagerLastnr() != null && castOther.getManagerLastnr() != null
						&& this.getManagerLastnr().equals(castOther.getManagerLastnr())))
				&& ((this.getUserLastnr() == castOther.getUserLastnr())
						|| (this.getUserLastnr() != null && castOther.getUserLastnr() != null
								&& this.getUserLastnr().equals(castOther.getUserLastnr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getManagerLastnr() == null ? 0 : this.getManagerLastnr().hashCode());
		result = 37 * result + (getUserLastnr() == null ? 0 : this.getUserLastnr().hashCode());
		return result;
	}

}
