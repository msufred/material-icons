package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class MotorcycleIcon extends SVGIcon {

    public MotorcycleIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.65);
    }

    public MotorcycleIcon(double size) {
        super(size, size * 0.65);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17.5 10c-.03 0-.05.01-.08.01L13.41 6H9v2h3.59l2 2h-8.1C4.01 " +
                "10 2 12.02 2 14.5a4.494 4.494 0 0 0 8.92.77L13.04 14c-.02.17-.04.33-." +
                "04.5c0 2.49 2.01 4.5 4.5 4.5s4.5-2.01 4.5-4.5s-2.01-4.5-4.5-4.5m-8.66" +
                " 5.26A2.488 2.488 0 0 1 6.47 17a2.5 2.5 0 0 1 0-5c1.12 0 2.05.74 2.37" +
                " 1.75H6v1.5zM17.47 17a2.5 2.5 0 0 1 0-5a2.5 2.5 0 0 1 0 5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "motorcycle-icon";
    }
}
