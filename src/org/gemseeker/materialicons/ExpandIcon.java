package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ExpandIcon extends SVGIcon {

    public ExpandIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.25);
    }

    public ExpandIcon(double size) {
        super(size, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M162 976v-60h636v60H162Zm320-90L330 734l43-43 79 79V382l-79 79-43-43 152-152 152 152-43 " +
                "43-79-79v388l79-79 43 43-152 152ZM162 236v-60h636v60H162Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "expand-icon";
    }
}
