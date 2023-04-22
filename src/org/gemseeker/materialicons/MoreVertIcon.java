package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MoreVertIcon extends SVGIcon {

    public MoreVertIcon() {
        super(DEFAULT_SIZE * 0.125, DEFAULT_SIZE);
    }

    public MoreVertIcon(double size) {
        super(size * 0.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M479.858 896Q460 896 446 881.858q-14-14.141-14-34Q432 828 446.142 814q14.141-14 34-14Q500 800 " +
                "514 814.142q14 14.141 14 34Q528 868 513.858 882q-14.141 14-34 14Zm0-272Q460 624 446 " +
                "609.858q-14-14.141-14-34Q432 556 446.142 542q14.141-14 34-14Q500 528 514 542.142q14 " +
                "14.141 14 34Q528 596 513.858 610q-14.141 14-34 14Zm0-272Q460 352 446 337.858q-14-14.141-14-34Q432 " +
                "284 446.142 270q14.141-14 34-14Q500 256 514 270.142q14 14.141 14 34Q528 324 513.858 338q-14.141 14-34 14Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "more-vert-icon";
    }
}
