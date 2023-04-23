package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class OpenInNewOffIcon extends SVGIcon {

    public OpenInNewOffIcon() {
        super();
    }

    public OpenInNewOffIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m813 995-59-59H180q-24 0-42-18t-18-42V302l-59-59 43-43 752 752-43 43ZM180 876h514L459 640l-77 " +
                "77-42-43 76-76-236-236v514Zm86-600-60-60h253v60H266Zm279 278-43-42 236-236H519v-60h321v321h-60V319L545 " +
                "554Zm295 296-60-60V597h60v253Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-in-new-off-icon";
    }
}
