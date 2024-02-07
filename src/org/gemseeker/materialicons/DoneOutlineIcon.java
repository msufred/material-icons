package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DoneOutlineIcon extends SVGIcon {

    public DoneOutlineIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public DoneOutlineIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m19.77 5.03l1.4 1.4L8.43 19.17l-5.6-5.6l1.4-1.4l4.2 4.2zm0-2.83L8.43 13.54l-4.2-4.2L0 13.57L8.43 22L24 6.43z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "done-outline-icon";
    }
}
