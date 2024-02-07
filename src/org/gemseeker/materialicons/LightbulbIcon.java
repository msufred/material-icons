package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LightbulbIcon extends SVGIcon {

    public LightbulbIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 1.15);
    }

    public LightbulbIcon(double size) {
        super(size * 0.85, size * 1.15);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9 21c0 .5.4 1 1 1h4c.6 0 1-.5 1-1v-1H9zm3-19C8.1 2 5 5.1 5 9c0 2.4 1.2 4.5 3 " +
                "5.7V17c0 .5.4 1 1 1h6c.6 0 1-.5 1-1v-2.3c1.8-1.3 3-3.4 3-5.7c0-3.9-3.1-7-7-7");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "lightbulb-icon";
    }
}
