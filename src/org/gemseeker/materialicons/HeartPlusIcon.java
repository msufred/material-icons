package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class HeartPlusIcon extends SVGIcon {

    public HeartPlusIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public HeartPlusIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M730 776V646H600v-60h130V456h60v130h130v60H790v130h-60ZM440 936 313 822q-72-65-123." +
                "5-116t-85-96q-33.5-45-49-87T40 435q0-94 63-156.5T260 216q52 0 99 21.5t81 61.5q34-40 81-61.5t" +
                "99-21.5q85 0 142.5 51.5T834 388q-18-7-36-10.5t-35-3.5q-101 0-172 70.5T520 616q0 52 21 98.5t59 " +
                "79.5q-19 17-49.5 43.5T498 884l-58 52Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "heart-plus-icon";
    }
}
