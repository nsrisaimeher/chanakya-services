/**
 * 
 */
package com.my_chanakya.models;

import java.util.List;

/**
 * @author nssmeher
 *
 */
public class Organization {
	
	private String Org_name;
	private String website;
	private List<Problem> problems;
	public String getOrg_name() {
		return Org_name;
	}
	public void setOrg_name(String org_name) {
		Org_name = org_name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<Problem> getProblems() {
		return problems;
	}
	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}
	
	

}
