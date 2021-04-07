package fr.asterox.TripPricer.dto;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

public class UserRewardDTO {

	public final VisitedLocation visitedLocation;
	public final Attraction attraction;
	private int rewardPoints;

	public UserRewardDTO(VisitedLocation visitedLocation, Attraction attraction, int rewardPoints) {
		this.visitedLocation = visitedLocation;
		this.attraction = attraction;
		this.rewardPoints = rewardPoints;
	}

	public UserRewardDTO(VisitedLocation visitedLocation, Attraction attraction) {
		this.visitedLocation = visitedLocation;
		this.attraction = attraction;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

}