package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AddToDriveIcon extends SVGIcon {

    public AddToDriveIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public AddToDriveIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M20 21v-3h3v-2h-3v-3h-2v3h-3v2h3v3zm-4.97.5H5.66c-.72 0-1.38-.38-1.73-1l-2." +
                "36-4.1c-.36-.62-.35-1.38.01-2L7.92 3.49c.36-.61 1.02-.99 1.73-.99h4.7c.71 0 1.37." +
                "38 1.73.99l4.48 7.71a6.176 6.176 0 0 0-2.4-.14L14.35 4.5h-4.7L3.31 15.41l2.35 4.0" +
                "9h7.89c.35.77.85 1.45 1.48 2M13.34 15c-.22.63-.34 1.3-.34 2H7.25l-.73-1.27l4.58-7" +
                ".98h1.8l2.53 4.42c-.56.42-1.05.93-1.44 1.51l-2-3.49L9.25 15z");
        return p1;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-to-drive-icon";
    }
}
