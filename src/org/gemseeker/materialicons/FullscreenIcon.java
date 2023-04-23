package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FullscreenIcon extends SVGIcon {

    public FullscreenIcon() {
        super(DEFAULT_SIZE * 0.9);
    }

    public FullscreenIcon(double size) {
        super(size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M200 856V663h60v133h133v60H200Zm0-367V296h193v60H260v133h-60Zm367 " +
                "367v-60h133V663h60v193H567Zm133-367V356H567v-60h193v193h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "fullscreen-icon";
    }
}
