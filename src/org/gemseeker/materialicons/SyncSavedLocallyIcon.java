package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SyncSavedLocallyIcon extends SVGIcon {

    public SyncSavedLocallyIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public SyncSavedLocallyIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m437 644 212-212-42-43-170 170-85-85-42 43 127 127ZM40 936v-60h880v60H40Zm100-120q-24 " +
                "0-42-18t-18-42V276q0-24 18-42t42-18h680q24 0 42 18t18 42v480q0 24-18 42t-42 18H140Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "sync-saved-locally-icon";
    }
}
