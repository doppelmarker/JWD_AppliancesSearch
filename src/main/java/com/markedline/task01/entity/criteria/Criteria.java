package com.markedline.task01.entity.criteria;

import com.markedline.task01.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteriaMap = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public Map<String, Object> getCriteriaMap() {
		return criteriaMap;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteriaMap.put(searchCriteria, value);
	}

	public boolean isGroupSearchNameOk() {
		return groupSearchName.equals(Oven.class.getSimpleName()) ||
				groupSearchName.equals(Laptop.class.getSimpleName()) ||
				groupSearchName.equals(Refrigerator.class.getSimpleName()) ||
				groupSearchName.equals(Speakers.class.getSimpleName()) ||
				groupSearchName.equals(TabletPC.class.getSimpleName()) ||
				groupSearchName.equals(VacuumCleaner.class.getSimpleName());
	}

	public List<String> getKeys() {
		return new ArrayList<>(criteriaMap.keySet());
	}
}
