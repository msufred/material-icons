package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MoreDownIcon extends SVGIcon {

    public MoreDownIcon() {
        super();
    }

    public MoreDownIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M200 856V416h60v380h380v60H200Zm200-200V216h60v380h380v60H400Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "more-down-icon";
    }
}
