package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GifBoxIcon extends SVGIcon {

    public GifBoxIcon() {
        super();
    }

    public GifBoxIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2M9.5 " +
                "13v-1h1v1c0 .55-.45 1-1 1h-1c-.55 0-1-.45-1-1v-2c0-.55.45-1 1-1h1c.55 0 1 .45 1 1h-2v2zm" +
                "3 1h-1v-4h1zm4-3h-2v.5H16v1h-1.5V14h-1v-4h3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "gif-box-icon";
    }
}
