package com.demo;

public class Activity {

    String userId;
    String timestamp;
    String activityType;
    String ip;
    String uri;

    public Activity(){
    }

    @Override
    public String toString() {
        return "Activity [userId=" + userId + ", timestamp=" + timestamp + ", activityType=" + activityType + ", ip="
                + ip + ", uri=" + uri + "]";
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getActivityType() {
        return activityType;
    }
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }

    
}
