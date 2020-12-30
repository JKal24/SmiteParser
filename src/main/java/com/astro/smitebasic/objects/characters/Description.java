package com.astro.smitebasic.objects.characters;

public class Description {

    private String description;
    private String value;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Description{" +
                "description='" + description + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
