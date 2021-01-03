package com.astro.smitebasic.utils;

public enum Language {
    ENGLISH(1),
    GERMAN(2),
    FRENCH(3),
    CHINESE(5),
    SPANISH(7),
    LATAM(9),
    Portuguese(10),
    Russian(11),
    Polish(12),
    Turkish(13);

    private Integer language;

    Language(Integer identifier) {
        this.language = identifier;
    }

    public String getLanguageID() { return language.toString(); }
}
