package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OpenInBrowserIcon extends SVGIcon {

    public OpenInBrowserIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public OpenInBrowserIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 4H5a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h4v-2H5V8h14v10h-4v2h4c1.1 " +
                "0 2-.9 2-2V6a2 2 0 0 0-2-2m-7 6l-4 4h3v6h2v-6h3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-in-browser-icon";
    }
}
