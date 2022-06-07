package com.szu.domain;

public class Game {

    private Long id;

    private String name;

    private String type;

    private String url;

    private String ordered;

    private String company;


    public Game() {
    }

    public Game(Long id, String name, String type, String url, String ordered, String company) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.url = url;
        this.ordered = ordered;
        this.company = company;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取
     * @return ordered
     */
    public String getOrdered() {
        return ordered;
    }

    /**
     * 设置
     * @param ordered
     */
    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }

    /**
     * 获取
     * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    public String toString() {
        return "Game{id = " + id + ", name = " + name + ", type = " + type + ", url = " + url + ", ordered = " + ordered + ", company = " + company + "}";
    }
}
