package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ViewComfyAltIcon extends SVGIcon {

    public ViewComfyAltIcon() {
        super();
    }

    public ViewComfyAltIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M80 496V176h320v320H80Zm0 480V656h320v320H80Zm480-480V176h320v320H560Zm0 480V656h320v320H560Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "view-comy-alt-icon";
    }
}
