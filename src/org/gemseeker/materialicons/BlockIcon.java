package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class BlockIcon extends SVGIcon {

    public BlockIcon() {
        super();
    }

    public BlockIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-83 0-156-31.5T197 859q-54-54-85.5-127T80 576q0-83 31.5-156T197 293q54-54 " +
                "127-85.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 83-31.5 156T763 859q-54 54-127 " +
                "85.5T480 976Zm0-60q142.375 0 241.188-98.812Q820 718.375 820 576q0-60.662-21-116.831Q778 403 740 " +
                "357L261 836q45 39 101.493 59.5Q418.987 916 480 916ZM221 795l478-478q-46-39-102.169-60T480 " +
                "236q-142.375 0-241.188 98.812Q140 433.625 140 576q0 61.013 22 117.506Q184 750 221 795Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "block-icon";
    }
}
