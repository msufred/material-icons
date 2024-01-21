package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class StackOffIcon extends SVGIcon {

    public StackOffIcon() {
        super();
    }

    public StackOffIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M880 890 406 416h414q24.75 0 42.375 17.625T880 476v414ZM580 356V236H226l-60-60h414q24.75 0 " +
                "42.375 17.625T640 236v120h-60Zm257 663-43-43H380q-25.5 0-42.75-17.25T320 916V502L140 " +
                "322v354h120v60H140q-25.5 0-42.75-17.25T80 676V262l-43-43 43-43 800 800-43 43Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "stack-off-icon";
    }
}
