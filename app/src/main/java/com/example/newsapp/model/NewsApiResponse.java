package com.example.newsapp.model;


import java.util.List;

public class NewsApiResponse {
    String status;
    int totalResults;
    List<NewsHeadlines> list;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsHeadlines> getList() {
        return list;
    }

    public void setList(List<NewsHeadlines> list) {
        this.list = list;
    }
}
