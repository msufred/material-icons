package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SyncAltIcon extends SVGIcon {

    public SyncAltIcon() {
        super();
    }

    public SyncAltIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M271 936 80 745l192-192 42 42-120 120h649v60H194l119 119-42 42Zm418-337-42-42 " +
                "119-119H117v-60h649L646 258l42-42 192 192-191 191Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "sync-alt-icon";
    }
}
