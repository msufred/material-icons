package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GradeIcon extends SVGIcon {

    public GradeIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.95);
    }

    public GradeIcon(double size) {
        super(size, size * 0.95);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2L9.19 8.63L2 9.24l5.46 4.73L5.82 21z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "grade-icon";
    }
}
