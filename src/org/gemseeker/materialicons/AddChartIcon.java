package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AddChartIcon extends SVGIcon {

    public AddChartIcon() {
        super(DEFAULT_SIZE * 0.95, DEFAULT_SIZE);
    }

    public AddChartIcon(double size) {
        super(size * 0.95, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M22 5v2h-3v3h-2V7h-3V5h3V2h2v3zm-3 14H5V5h6V3H5c-1.1 0-2 .9-2 2v14c0 " +
                "1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-6h-2zm-4-6v4h2v-4zm-4 4h2V9h-2zm-2 0v-6H7v6z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-chart-icon";
    }
}
