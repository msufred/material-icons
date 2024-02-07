package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CommitIcon extends SVGIcon {

    public CommitIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.55);
    }

    public CommitIcon(double size) {
        super(size, size * 0.55);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M16.9 11a5 5 0 0 0-9.8 0H2v2h5.1a5 5 0 0 0 9.8 0H22v-2zM12 15c-1.66 0-3-1.34-3-3s1.34-3 3-3s3 1.34 3 3s-1.34 3-3 3");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "commit-icon";
    }
}
