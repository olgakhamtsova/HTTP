package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resp {
    private final String id;
    private final String user;
    private final String text;
    private final String type;
    private final int upvotes;

    public Resp(@JsonProperty("id") String id, @JsonProperty("user") String user, @JsonProperty("text") String text, @JsonProperty("type") String type, @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.user = user;
        this.text = text;
        this.type = type;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Resp" + "\n id=" + id + "\n user=" + user + "\n text=" + text + "\n type=" + type + "\n upvote=" + upvotes;
    }

}
