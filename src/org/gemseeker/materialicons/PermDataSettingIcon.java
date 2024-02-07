package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermDataSettingIcon extends SVGIcon {

    public PermDataSettingIcon() {
        super();
    }

    public PermDataSettingIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M18.99 11.5c.34 0 .67.03 1 .07L20 0L0 20h11.56c-.04-.33-.07-.66" +
                "-.07-1c0-4.14 3.36-7.5 7.5-7.5m3.71 7.99c.02-.16.04-.32.04-.49c0-.17-.0" +
                "1-.33-.04-.49l1.06-.83a.26.26 0 0 0 .06-.32l-1-1.73c-.06-.11-.19-.15-.3" +
                "1-.11l-1.24.5c-.26-.2-.54-.37-.85-.49l-.19-1.32c-.01-.12-.12-.21-.24-.2" +
                "1h-2c-.12 0-.23.09-.25.21l-.19 1.32c-.3.13-.59.29-.85.49l-1.24-.5c-.11-" +
                ".04-.24 0-.31.11l-1 1.73c-.06.11-.04.24.06.32l1.06.83a3.908 3.908 0 0 0" +
                " 0 .98l-1.06.83a.26.26 0 0 0-.06.32l1 1.73c.06.11.19.15.31.11l1.24-.5c." +
                "26.2.54.37.85.49l.19 1.32c.02.12.12.21.25.21h2c.12 0 .23-.09.25-.21l.19" +
                "-1.32c.3-.13.59-.29.84-.49l1.25.5c.11.04.24 0 .31-.11l1-1.73a.26.26 0 0" +
                " 0-.06-.32zm-3.71 1.01c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5s1.5.67 1." +
                "5 1.5s-.67 1.5-1.5 1.5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-date-setting-icon";
    }
}
