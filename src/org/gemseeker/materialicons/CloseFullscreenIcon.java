package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CloseFullscreenIcon extends SVGIcon {

    public CloseFullscreenIcon() {
        super();
    }

    public CloseFullscreenIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m122 976-42-42 298-298H180v-60h300v300h-60V678L122 976Zm358-400V276h60v198l298-298 42 42-298 298h198v60H480Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "close-fullscreen-icon";
    }
}
