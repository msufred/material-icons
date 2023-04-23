package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeVerticalIcon extends SVGIcon {

    public SwipeVerticalIcon() {
        super(DEFAULT_SIZE * 1.125);
    }

    public SwipeVerticalIcon(double size) {
        super(size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M45 971v-50h97q-60-73-98.5-160.5T5 576q0-97 37-184.5T139 231H45v-50h190v190h-50V257q-60 " +
                "71-95 149T55 576q0 92 35 169.5T185 895V781h50v190H45Zm566-9L366 859l16-43q5-14 17-22.5t27-11.5l114" +
                "-23-171-386q-11-23-2-45.5t32-33.5q23-11 45.5-1.5T478 325l98 219 33-15q10-5 18-6.5t18-.5l182 8q27 2 " +
                "46.5 17.5T901 589l50 175q8 29-5.5 55T905 857L674 960q-15 7-31.5 7.5T611 962Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-vertical-icon";
    }
}
