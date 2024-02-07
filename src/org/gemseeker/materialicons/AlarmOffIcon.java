package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AlarmOffIcon extends SVGIcon {

    public AlarmOffIcon() {
        super();
    }

    public AlarmOffIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 6c3.87 0 7 3.13 7 7c0 .84-.16 1.65-.43 2.4l1.52 1.52c.58-1.19.91-2.51.91-3.92a9 " +
                "9 0 0 0-9-9c-1.41 0-2.73.33-3.92.91L9.6 6.43C10.35 6.16 11.16 6 12 6m10-.28l-4.6-3.86l-1.29 " +
                "1.53l4.6 3.86zM2.92 2.29L1.65 3.57L2.98 4.9l-1.11.93l1.42 1.42l1.11-.94l.8.8A8.964 8.964 0 0" +
                " 0 3 13c0 4.97 4.02 9 9 9c2.25 0 4.31-.83 5.89-2.2l2.2 2.2l1.27-1.27L3.89 3.27zm13.55 16.1C1" +
                "5.26 19.39 13.7 20 12 20c-3.87 0-7-3.13-7-7c0-1.7.61-3.26 1.61-4.47zM8.02 3.28L6.6 1.86l-.86" +
                ".71l1.42 1.42z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "alarm-off-icon";
    }
}
