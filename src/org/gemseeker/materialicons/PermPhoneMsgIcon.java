package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermPhoneMsgIcon extends SVGIcon {

    public PermPhoneMsgIcon() {
        super();
    }

    public PermPhoneMsgIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 15.5c-1.25 0-2.45-.2-3.57-.57a1.02 1.02 0 0 0-1.02.24l-2.2 " +
                "2.2a15.074 15.074 0 0 1-6.59-6.58l2.2-2.21c.28-.27.36-.66.25-1.01A11.36" +
                " 11.36 0 0 1 8.5 4c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1c0 9.39 7.61 17 17" +
                " 17c.55 0 1-.45 1-1v-3.5c0-.55-.45-1-1-1M12 3v10l3-3h6V3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-phone-msg-icon";
    }
}
