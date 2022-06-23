package tsol.lab2.prob1;

import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class Developer {
	private String developerId;
	private List<Feature> assignedFeatures = new ArrayList<>();

	public Developer(String id) {
		developerId = id;
	}

	/**
	 * Returns number of estimated days to complete work on this feature
	 */
	public double timeRemaining(Feature feature, LocalDate startingFrom) {
		//this is a default calculation used for this problem
		int id = Integer.parseInt(feature.getFeatureId());
		return id % 11;
	}

	public String getDeveloperId() {
		return developerId;
	}

	public List<Feature> getAssignedFeatures() {
		return assignedFeatures;
	}

	public void addFeature(Feature f) {
		this.assignedFeatures.add(f);
	}
}
