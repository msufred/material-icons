package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DownloadForOfflineIcon extends SVGIcon {

    public DownloadForOfflineIcon() {
        super();
    }

    public DownloadForOfflineIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M280 776h400v-60H280v60Zm197-126 158-157-42-42-85 84V336h-60v199l-85-84-42 42 156 157Zm3 " +
                "326q-82 0-155-31.5t-127.5-86Q143 804 111.5 731T80 576q0-83 31.5-156t86-127Q252 239 325 207.5T480 " +
                "176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 82-31.5 155T763 858.5q-54 54.5-127 86T480 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "download-for-offline-icon";
    }
}
