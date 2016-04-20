package com.github.izerui.weixin.mappings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.izerui.weixin.enumeration.MenuType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by serv on 16/4/19.
 */
public class Menu implements Serializable {

    @JsonProperty("type")
    private MenuType type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("key")
    private String key;
    @JsonProperty("url")
    private String url;
    @JsonProperty("media_id")
    private String mediaId;
    @JsonProperty("sub_button")
    private List<Menus> subButton;

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public List<Menus> getSubButton() {
        return subButton;
    }

    public void setSubButton(List<Menus> subButton) {
        this.subButton = subButton;
    }
}