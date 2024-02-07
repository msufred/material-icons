package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AssessmentIcon extends SVGIcon {

    public AssessmentIcon() {
        super();
    }

    public AssessmentIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2M9 " +
                "17H7v-7h2zm4 0h-2V7h2zm4 0h-2v-4h2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "assessment-icon";
    }
}
