package com.demo;

import java.util.Date;

import jakarta.enterprise.context.ApplicationScoped;

public class ActivityGenerator {

    public static Activity generateActivity(){
        Activity activity = new Activity();

        activity.setUserId(randomItem(userIds));
        activity.setTimestamp(new Date().toString());
        activity.setActivityType(randomItem(activityTypes));
        activity.setIp(randomItem(ipAddresses));
        activity.setUri(randomItem(uris));

        return activity;
    }

    private static String randomItem(String[] listOfStrings) {
        return listOfStrings[(int) (Math.random() * listOfStrings.length)];
    }
    
    static final String[] userIds = {"charlotte", "olivia", "mia", "amelia", "ava", "chloe", "emily", "zoe", "grace", "sophia", "sophie", "isabella", "isla", "ruby", "ivy", "ella", "evie", "sienna", "matilda", "scarlett", "harper", "evelyn", "lily", "emma", "georgia", "eva", "lucy", "hannah", "zara", "isabelle", "willow", "abigail", "audrey", "aria", "sofia", "annabelle", "layla", "violet", "mila", "imogen", "sarah", "stella", "piper", "savannah", "elizabeth", "alice", "ellie", "jessica", "maddison", "ariana", "victoria", "mackenzie", "jasmine", "maya", "claire", "eleanor", "madison", "alexis", "phoebe", "indiana", "chelsea", "alyssa", "summer", "eden", "anna", "lara", "hazel", "addison", "madeleine", "penelope", "elsie", "isabel", "poppy", "frankie", "molly", "aisha", "bella", "emilia", "aurora", "lilly", "rose", "ayla", "eloise", "harriet", "leah", "lola", "alexandra", "daisy", "olive", "eliza", "aaliyah", "holly", "lillian", "maryam", "eve", "charlie", "gabriella", "paige", "billie", "madeline", "oliver", "george", "harry", "jack", "jacob", "noah", "charlie", "muhammad", "thomas", "oscar", "william", "james", "henry", "leo", "alfie", "joshua", "freddie", "archie", "ethan", "isaac", "alexander", "joseph", "edward", "samuel", "max", "daniel", "arthur", "lucas", "mohammed", "logan", "theo", "harrison", "benjamin", "mason", "sebastian", "finley", "adam", "dylan", "zachary", "riley", "teddy", "theodore", "david", "toby", "jake", "louie", "elijah", "reuben", "arlo", "hugo", "luca", "jaxon", "matthew", "harvey", "reggie", "michael", "harley", "jude", "albert", "tommy", "luke", "stanley", "jenson", "frankie", "jayden", "gabriel", "elliot", "mohammad", "ronnie", "charles", "louis", "elliott", "frederick", "nathan", "lewis", "blake", "rory", "ollie", "ryan", "tyler", "jackson", "dexter", "alex", "austin", "kai", "albie", "caleb", "carter", "bobby", "ezra", "ellis", "leon", "roman", "ibrahim", "aaron", "liam", "jesse", "jasper", "felix", "jamie"};

    static final String[] activityTypes = {"search", "view", "save", "update", "delete", "checkout","button-click", "link-click", "form-submission", "menu-interaction", "scroll", "hover", "video-play", "video-pause", "video-stop", "download", "product-view", "add-to-cart", "purchase", "wishlist-add", "search", "filter", "login", "logout", "sign-up", "profile-update", "404-error", "form-error"};

    static final String[] ipAddresses = {"192.168.1.1", "10.0.0.1", "172.16.0.1", "192.168.100.1", "10.10.10.1", "172.16.1.1", "192.168.1.2", "10.0.0.2", "172.16.0.2", "192.168.100.2", "10.10.10.2", "172.16.1.2", "192.168.1.3", "10.0.0.3", "172.16.0.3", "192.168.100.3", "10.10.10.3", "172.16.1.3", "192.168.1.4", "10.0.0.4"};

     static final String[] uris = {"/index.html", "/about", "/contact", "/products/123", "/blog/article", "/login", "/signup", "/user/profile", "/cart", "/checkout", "/faq", "/terms", "/privacy", "/support", "/api/v1/resource", "/download/file.txt", "/images/logo.png", "/css/styles.css", "/js/app.js", "/docs/manual.pdf", "/services", "/portfolio", "/team", "/careers", "/testimonials", "/news", "/events", "/gallery", "/pricing", "/features", "/dashboard", "/settings", "/notifications", "/messages", "/reports", "/analytics", "/search", "/subscribe", "/unsubscribe", "/sitemap", "/robots.txt", "/404", "/500", "/maintenance", "/coming-soon", "/thank-you", "/press", "/partners", "/advertise", "/resources", "/community", "/forum", "/help", "/docs", "/tutorials", "/guides", "/examples", "/feedback", "/beta", "/release-notes", "/changelog", "/api/v2/resource", "/widget", "/plugin", "/extension", "/theme", "/templates", "/assets", "/media", "/videos", "/audio", "/podcasts"};

}
