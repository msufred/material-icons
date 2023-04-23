package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ExpandContentIcon extends SVGIcon {

    public ExpandContentIcon() {
        super();
    }

    public ExpandContentIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M200 856V616h60v180h180v60H200Zm500-320V356H520v-60h240v240h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "expand-content-icon";
    }
}
