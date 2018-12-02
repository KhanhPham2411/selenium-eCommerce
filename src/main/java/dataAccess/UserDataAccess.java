package dataAccess;

import java.util.concurrent.ThreadLocalRandom;

import models.User;

public class UserDataAccess {
	public User getUser() {
		User user = new User();
		
        int randomNum = ThreadLocalRandom.current().nextInt(1, 1000);
		user.email = "test"+ randomNum + "@example.com";
		user.firstName = "Khanh";
		user.lastName = "Pham";
		user.password = "duckhanh";
		user.confirmPassword = "duckhanh";
		
		return user;
	}
}
