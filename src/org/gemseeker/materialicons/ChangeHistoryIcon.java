package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ChangeHistoryIcon extends SVGIcon {

    public ChangeHistoryIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public ChangeHistoryIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 7.77L18.39 18H5.61zM12 4L2 20h20z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "change-history-icon";
    }
}
