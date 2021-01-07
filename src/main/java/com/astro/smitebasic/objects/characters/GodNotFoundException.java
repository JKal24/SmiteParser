package com.astro.smitebasic.objects.characters;

public class GodNotFoundException extends NoSuchFieldException {

    public GodNotFoundException() { super(); }

    public GodNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
