package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DataThresholdingIcon extends SVGIcon {

    public DataThresholdingIcon() {
        super();
    }

    public DataThresholdingIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2m-8.33 " +
                "5.17l2 2l3.67-3.67l1.41 1.41L12.67 13l-2-2l-3 3l-1.41-1.41zM5 16h1.72L5 17.72zm.84 3l3-3h1" +
                ".83l-3 3zm3.96 0l3-3h1.62l-3 3zm3.73 0l3-3h1.62l-3 3zM19 19h-1.73L19 17.27z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "data-thresholding-icon";
    }
}
