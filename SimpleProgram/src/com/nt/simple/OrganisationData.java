package com.nt.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class OrganisationData {

	private Long eId;
	private String eName;
	private Integer eSal;
	private String deptName;

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Integer geteSal() {
		return eSal;
	}

	public void seteSal(Integer eSal) {
		this.eSal = eSal;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public OrganisationData(Long eId, String eName, Integer eSal, String deptName) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		this.deptName = deptName;
	}

	public static void main(String[] args) {

		List<OrganisationData> listOrgData = new ArrayList<>();
		listOrgData.add(new OrganisationData(2l, "Amit", 5000, "HR"));
		listOrgData.add(new OrganisationData(51l, "Akash", 4000, "IT"));
		listOrgData.add(new OrganisationData(56l, "Vijay", 3000, "HR"));
		listOrgData.add(new OrganisationData(78l, "Hitesh", 7000, "IT"));
		listOrgData.add(new OrganisationData(89l, "Manish", 2000, "MKT"));
		listOrgData.add(new OrganisationData(26l, "Jitesh", 15000, "MKT"));
		listOrgData.add(new OrganisationData(25l, "Sumit", 10000, "HR"));
		listOrgData.add(new OrganisationData(28l, "Anish", 8000, "IT"));
		listOrgData.add(new OrganisationData(12l, "Anil", 4500, "HR"));
		listOrgData.add(new OrganisationData(12l, "Anil", 4500, "DevOps"));
		listOrgData.add(new OrganisationData(12l, "Anil", 4501, "DevOps"));

/*		Map<String,Double> map=listOrgData.stream()
				.collect(Collectors.groupingBy(OrganisationData::getDeptName,Collectors.summingDouble(OrganisationData::geteSal)));
		
		map.entrySet().forEach(System.out::println);
		*/
		  listOrgData.stream().filter((e1)->e1.geteSal()>7000).map(e->e.getDeptName()).collect(Collectors.toList()).forEach((e1)->System.out.println(e1));
		   
			/*
			 * List<String> list1=Arrays.asList("Ankit","abhi");
			 * list1.stream().filter(name->name.startsWith("Ankit")).collect(Collectors.
			 * toList()).forEach(System.out::println);
			 */
		
		

	}

}
