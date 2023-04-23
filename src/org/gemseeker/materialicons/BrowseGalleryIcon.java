package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class BrowseGalleryIcon extends SVGIcon {

    public BrowseGalleryIcon() {
        super(DEFAULT_SIZE * 1.2, DEFAULT_SIZE * 0.85);
    }

    public BrowseGalleryIcon(double size) {
        super(size * 1.2, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m472 730 42-42-124-123.897V386h-60v202l142 142Zm255 182v-68q79-37 126-109t47-159.5q0-87.5-47" +
                "-160T727 307v-68q104 42 168.5 133.034 64.5 91.033 64.5 203Q960 687 896 778.5 832 870 727 912Zm-367 " +
                "23q-75 0-140.5-28.5t-114-77q-48.5-48.5-77-114T0 575q0-75 28.5-140.5t77-114q48.5-48.5 114-77T360 " +
                "215q75 0 140.5 28.5t114 77q48.5 48.5 77 114T720 575q0 75-28.5 140.5t-77 114q-48.5 48.5-114 77T360 935Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "browse-gallery-icon";
    }
}
