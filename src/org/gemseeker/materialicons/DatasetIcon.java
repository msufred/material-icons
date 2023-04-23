package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DatasetIcon extends SVGIcon {

    public DatasetIcon() {
        super();
    }

    public DatasetIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M290 766h140V626H290v140Zm240 0h140V626H530v140ZM290 526h140V386H290v140Zm240 " +
                "0h140V386H530v140ZM180 936q-24 0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 42 18t18 " +
                "42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dataset-icon";
    }
}
