package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DownloadingIcon extends SVGIcon {

    public DownloadingIcon() {
        super();
    }

    public DownloadingIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M436 974q-76-8-141-42t-112.5-88Q135 790 108 721T81 575q0-155 101.5-269T437 176v60q-128 19-212 " +
                "115t-84 224q0 128 83.5 224T436 914v60Zm44-198L280 576l43-43 127 127V376h60v284l127-127 43 43-200 " +
                "200Zm44 198v-60q46-6 88.5-23.5T691 844l44 44q-46 35-99.5 58T524 974Zm168-667q-38-27-80-45.5T524 " +
                "236v-60q58 7 111 29.5T735 263l-43 44Zm100 519-43-42q29-37 46-79.5t23-88.5h61q-7 58-29 111.5T792 " +
                "826Zm26-292q-6-46-23-89t-46-79l47-41q35 46 56 99t27 110h-61Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "downloading-icon";
    }
}
