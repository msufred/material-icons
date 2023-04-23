package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class StartIcon extends SVGIcon {

    public StartIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.85);
    }

    public StartIcon(double size) {
        super(size * 1.25, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M80 816V336h60v480H80Zm559 1-43-42 169-169H239v-60h526L597 377l42-42 241 241-241 241Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "start-icon";
    }
}
