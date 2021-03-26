package fr.asterox.TripPricer.proxy;

import java.util.List;
import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.asterox.TripPricer.dto.UserPreferences;
import fr.asterox.TripPricer.dto.UserReward;
import tripPricer.Provider;

@FeignClient(name = "UserManagement", url = "localhost:9001")
public interface UserManagementProxy {

	@RequestMapping("/getUserId")
	public UUID getUserId(@RequestParam String userName);

	@RequestMapping("/getUserPreferences")
	public UserPreferences getUserPreferences(@RequestParam String userName);

	@RequestMapping("/getUserRewards")
	public List<UserReward> getUserRewards(@RequestParam String userName);

	@RequestMapping("/setTripDeals")
	public void setTripDeals(@RequestParam String userName, @RequestBody List<Provider> providers);
}