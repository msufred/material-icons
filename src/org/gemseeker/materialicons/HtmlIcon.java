package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HtmlIcon extends SVGIcon {

    public HtmlIcon() {
        super(DEFAULT_SIZE * 1.65, DEFAULT_SIZE * 0.45);
    }

    public HtmlIcon(double size) {
        super(size * 1.65, size * 0.45);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3.5 9H5v6H3.5v-2.5h-2V15H0V9h1.5v2h2zm14 0H13c-.55 0-1 .45-1 1v5h1.5v-4." +
                "5h1V14H16v-3.51h1V15h1.5v-5c0-.55-.45-1-1-1M11 9H6v1.5h1.75V15h1.5v-4.5H11zm13 6v-1.5h-2.5V9H20v6z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "html-icon";
    }
}
