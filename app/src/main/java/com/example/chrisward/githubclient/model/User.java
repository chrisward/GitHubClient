package com.example.chrisward.githubclient.model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    public String username;

    @SerializedName("id")
    public int id;

    @SerializedName("node_id")
    public String nodeId;

    @SerializedName("avatar_url")
    public String avatarUrl;

    @SerializedName("user_url")
    public String userPageUrl;

    @SerializedName("name")
    public String properName;

    @SerializedName("company")
    public String company;

    @SerializedName("blog")
    public String externalUrl;

    @SerializedName("location")
    public String location;

    @SerializedName("email")
    public String email;

    @SerializedName("bio")
    public String bio;

    @SerializedName("public_repos")
    public int totalPublicRepos;

    @SerializedName("followers")
    public String followers;

    @SerializedName("following")
    public String following;

    @SerializedName("total_private_repos")
    public int totalPrivateRepos;
}
