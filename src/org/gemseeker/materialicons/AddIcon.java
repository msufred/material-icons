package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AddIcon extends SVGIcon {

    public AddIcon() {
        super();
    }

    public AddIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M450 856V606H200v-60h250V296h60v250h250v60H510v250h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-icon";
    }
}
