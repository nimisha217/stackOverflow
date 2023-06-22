package com.stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QnAPlatform platform = new QnAPlatform();

        // Test Case 1
        platform.userSignup("Sachin", "Developer");
        platform.subscribeTopics(platform.users.get("Sachin"), "java", "hadoop", "jdk");
        platform.addQuestion("What are new open source jdks?", Arrays.asList("java", "jdk"), platform.users.get("Sachin"));
        platform.addQuestion("Does Hadoop work on JDK 11?", Arrays.asList("hadoop", "jdk"), platform.users.get("Sachin"));
        platform.showFeed(platform.users.get("Sachin"), platform.users.get("Sachin").getQuestions());
        platform.showFeed(platform.users.get("Sachin"),platform.filterQuestionsByTopics(platform.users.get("Sachin").getQuestions(), "java"));
        platform.showFeed(platform.users.get("Sachin"),platform.filterQuestionsByTopics(platform.users.get("Sachin").getQuestions(), "jdk"));
        platform.showFeed(platform.users.get("Sachin"),platform.filterQuestionsByAnswers(platform.users.get("Sachin").getQuestions(), true));
        platform.userLogout(platform.users.get("Sachin"));

        // Test Case 2
        platform.userSignup("Kalyan", "Developer");
        platform.subscribeTopics(platform.users.get("Kalyan"), "apache", "hadoop");
        platform.showFeed(platform.users.get("Kalyan"), platform.users.get("Kalyan").getQuestions());
        platform.addQuestion("Does Apache Spark support streaming of data from HDFS?", Arrays.asList("apache", "hadoop"), platform.users.get("Kalyan"));
        platform.answerQuestion(platform.questions.get(1), "Yeah Hadoop 3 and above supports it.", platform.users.get("Kalyan"));
        platform.showFeed(platform.users.get("Kalyan"),platform.users.get("Kalyan").getQuestions());
        platform.userLogout(platform.users.get("Kalyan"));

        // Test Case 3
        platform.userSignup("Lokesh", "Developer");
        platform.subscribeTopics(platform.users.get("Lokesh"), "apache", "hadoop", "java");
        platform.showFeed(platform.users.get("Lokesh"),platform.users.get("Lokesh").getQuestions());
        platform.showQuestion(platform.questions.get(1));
        platform.acceptAnswer(platform.questions.get(1), platform.questions.get(1).getAnswers().get(0), platform.users.get("Lokesh"));
        platform.showProfile(platform.users.get("Lokesh"));
        platform.showFeed(platform.users.get("Lokesh"), platform.filterQuestionsByAnswers(platform.questions, true));
        platform.userLogout(platform.users.get("Lokesh"));

        // Test Case 4
        platform.userLogin(platform.users.get("Sachin"));
        platform.showFeed(platform.users.get("Sachin"), platform.users.get("Sachin").getQuestions());
        platform.showProfile(platform.users.get("Kalyan"));
        platform.showQuestion(platform.questions.get(1));
        platform.acceptAnswer(platform.questions.get(1), platform.questions.get(1).getAnswers().get(0), platform.users.get("Sachin"));
        platform.showProfile(platform.users.get("Kalyan"));
        platform.showFeed(platform.users.get("Sachin"),platform.filterQuestionsByAnswers(platform.questions, true));
        platform.userLogout(platform.users.get("Sachin"));
    }
}
