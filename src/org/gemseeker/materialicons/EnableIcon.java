package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class EnableIcon extends SVGIcon {

    public EnableIcon() {
        super();
    }

    public EnableIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-83 0-156-31.5T197 859q-54-54-85.5-127T80 576q0-140 86.5-248.5T390 186v64q-111 " +
                "30-180.5 120.5T140 576q0 142 99 241t241 99q142 0 241-99t99-241q0-115-69.5-205.5T570 250v-64q137 " +
                "33 223.5 141.5T880 576q0 83-31.5 156T763 859q-54 54-127 85.5T480 976Zm0-254L280 522l42-42 128 " +
                "128V177h60v431l128-128 42 42-200 200Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "enable-icon";
    }
}
