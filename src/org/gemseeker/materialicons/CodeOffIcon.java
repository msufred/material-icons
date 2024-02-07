package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CodeOffIcon extends SVGIcon {

    public CodeOffIcon() {
        super();
    }

    public CodeOffIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m19.17 12l-4.58-4.59L16 6l6 6l-3.59 3.59L17 14.17zM1.39 4.22l4.19 4.19L2 12l6 " +
                "6l1.41-1.41L4.83 12L7 9.83l12.78 12.78l1.41-1.41L2.81 2.81z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "code-off-icon";
    }
}
