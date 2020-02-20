package io.javabrains.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {

    private String userId;
    private List<Rating> ratings;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    /**
     * This method sets rating for certain movies by ID
     * @param userId
     */
    public void initData(String userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating("0", 3),
                new Rating("1", 5),
                new Rating("2", 6),
                new Rating("3", 10),
                new Rating("4", 2),
                new Rating("5", 3),
                new Rating("6", 7),
                new Rating("7", 8),
                new Rating("8", 7),
                new Rating("9", 7),
                new Rating("10", 5)
        ));
    }
}
