package com.astro.smitebasic.utils;

public enum Language {
    ENGLISH("1"),
    GERMAN("2"),
    FRENCH("3"),
    CHINESE("5"),
    SPANISH("7"),
    LATAM("9"),
    Portuguese("10"),
    Russian("11"),
    Polish("12"),
    Turkish("13");

    private String language;

    Language(String identifier) {
        this.language = identifier;
    }

    public String getLanguage() { return language; }
}
