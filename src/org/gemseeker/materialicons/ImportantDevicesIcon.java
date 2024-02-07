package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ImportantDevicesIcon extends SVGIcon {

    public ImportantDevicesIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public ImportantDevicesIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M23 11.01L18 11c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1h5c.55 0 1-.45 1-1v-9c0-." +
                "55-.45-.99-1-.99M23 20h-5v-7h5zM20 2H2C.89 2 0 2.89 0 4v12a2 2 0 0 0 2 2h7v2H7v2h8" +
                "v-2h-2v-2h2v-2H2V4h18v5h2V4a2 2 0 0 0-2-2m-8.03 7L11 6l-.97 3H7l2.47 1.76l-.94 2.9" +
                "1l2.47-1.8l2.47 1.8l-.94-2.91L15 9z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "important-devices-icon";
    }
}
