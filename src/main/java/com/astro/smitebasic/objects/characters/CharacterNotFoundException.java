package com.astro.smitebasic.objects.characters;

public class CharacterNotFoundException extends NoSuchFieldException{

    public CharacterNotFoundException() { super(); }

    public CharacterNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
