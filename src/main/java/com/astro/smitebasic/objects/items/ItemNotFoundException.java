package com.astro.smitebasic.objects.items;

public class ItemNotFoundException extends NoSuchFieldException {
    public ItemNotFoundException() {
    }

    public ItemNotFoundException(String s) {
        super(s);
    }
}
