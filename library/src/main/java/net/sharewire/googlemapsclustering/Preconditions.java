package net.sharewire.googlemapsclustering;

import android.support.annotation.Nullable;

final class Preconditions {

    static <T> T checkNotNull(@Nullable T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    private Preconditions() {
    }
}