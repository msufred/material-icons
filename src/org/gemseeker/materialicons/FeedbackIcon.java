package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FeedbackIcon extends SVGIcon {

    public FeedbackIcon() {
        super();
    }

    public FeedbackIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2m-7 12h-2v-2h2zm0-4h-2V6h2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "feedback-icon";
    }
}
