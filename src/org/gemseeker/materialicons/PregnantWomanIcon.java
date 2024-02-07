package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PregnantWomanIcon extends SVGIcon {

    public PregnantWomanIcon() {
        super(DEFAULT_SIZE * 0.4, DEFAULT_SIZE);
    }

    public PregnantWomanIcon(double size) {
        super(size * 0.4, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9 4c0-1.11.89-2 2-2s2 .89 2 2s-.89 2-2 2s-2-.89-2-2m7 9a3.285 " +
                "3.285 0 0 0-2-3c0-1.66-1.34-3-3-3s-3 1.34-3 3v7h2v5h3v-5h3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pregnant-woman-icon";
    }
}
