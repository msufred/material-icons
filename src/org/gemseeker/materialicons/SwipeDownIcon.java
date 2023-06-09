package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeDownIcon extends SVGIcon {

    public SwipeDownIcon() {
        super(DEFAULT_SIZE * 1.125);
    }

    public SwipeDownIcon(double size) {
        super(size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M173 681 40 548l35-35 74 74q-5-28-8-56.5t-3-62.5q0-84 26-158t74-134l36 35q-41 54-63.5 " +
                "119.5T188 468q0 30 2.5 59.5T198 586l73-73 35 35-133 133Zm438 281L366 859l16-43q5-14 " +
                "17-22.5t27-11.5l114-23-171-386q-11-23-2-45.5t32-33.5q23-11 45.5-1.5T478 325l98 219 " +
                "33-15q10-5 18-6.5t18-.5l182 8q27 2 46.5 17.5T901 589l50 175q8 29-5.5 55T905 857L674 " +
                "960q-15 7-31.5 7.5T611 962Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-down-icon";
    }
}
