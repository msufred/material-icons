package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RemoveDoneIcon extends SVGIcon {

    public RemoveDoneIcon() {
        super(DEFAULT_SIZE * 1.25);
    }

    public RemoveDoneIcon(double size) {
        super(size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M856 968 581 692 467 806 243 582l43-43 181 181 71-71-430-429 43-43 748 748-43 43ZM297 806 73 " +
                "582l43-43 181 181 43 43-43 43Zm369-199-43-43 228-228 43 43-228 228Zm-85-85-43-43 143-143 43 43-143 143Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "remove-done-icon";
    }
}
