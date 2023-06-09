package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeUpIcon extends SVGIcon {

    public SwipeUpIcon() {
        super(DEFAULT_SIZE * 1.125);
    }

    public SwipeUpIcon(double size) {
        super(size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M238 649q-48-60-74-135t-26-158q0-28 2-57.5t9-60.5l-74 73-35-35 133-132 133 132-35 35-73-72q-6 " +
                "29-8 60t-2 57q0 72 23 138t63 119l-36 36Zm373 313L366 859l16-43q5-14 17-22.5t27-11.5l114-23-171-386q-11" +
                "-23-2-45.5t32-33.5q23-11 45.5-1.5T478 325l98 219 33-15q10-5 18-6.5t18-.5l182 8q27 2 46.5 17.5T901 " +
                "589l50 175q8 29-5.5 55T905 857L674 960q-15 7-31.5 7.5T611 962Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-up-icon";
    }
}
