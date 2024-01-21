package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class StepIcon extends SVGIcon {

    public StepIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.45);
    }

    public StepIcon(double size) {
        super(size, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M772 689q-47 0-79-32.5T661 577q0-47 32-79.5t79-32.5q46 0 78.5 32.5T883 577q0 47-32.5 79.5T772 " +
                "689Zm-410 78-42-43 114-116H76v-62h358L320 431l42-43 188 189-188 190Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "step-icon";
    }
}
