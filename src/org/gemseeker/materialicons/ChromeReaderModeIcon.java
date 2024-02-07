package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ChromeReaderModeIcon extends SVGIcon {

    public ChromeReaderModeIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public ChromeReaderModeIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13 12h7v1.5h-7zm0-2.5h7V11h-7zm0 5h7V16h-7zM21 4H3c-1.1 0-2 .9-2 2v13c0 1.1.9 2 2 " +
                "2h18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2m0 15h-9V6h9z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "chrome-reader-mode-icon";
    }
}
