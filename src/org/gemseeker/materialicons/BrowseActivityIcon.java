package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class BrowseActivityIcon extends SVGIcon {

    public BrowseActivityIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public BrowseActivityIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M40 936v-60h880v60H40Zm100-120q-24 0-42-18t-18-42V526h221l72 144q4 8 11.5 12t15.5 4q8 0 " +
                "15.5-4t11.5-12l131-229 34 69q4 8 11.5 12t15.5 4h261v230q0 24-18 42t-42 18H140Zm262-222-55-112q-4-" +
                "8-11.5-12t-15.5-4H80V276q0-24 18-42t42-18h680q24 0 42 18t18 42v190H638l-51-103q-4-8-11.5-11.5T560 " +
                "348q-8 0-15.5 3.5T533 363L402 594Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "browse-activity-icon";
    }
}
