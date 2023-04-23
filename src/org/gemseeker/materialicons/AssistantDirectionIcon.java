package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AssistantDirectionIcon extends SVGIcon {

    public AssistantDirectionIcon() {
        super();
    }

    public AssistantDirectionIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M482 1015q-91 0-171-35t-140-95q-60-60-95-140T41 574q0-90 35-170t95-140q60-60 140-94.5T482 " +
                "135q90 0 170 34.5T792 264q60 60 94.5 140T921 574q0 91-34.5 171T792 885q-60 60-140 95t-170 " +
                "35Zm-30-153q11 11 26.5 11t26.5-11l266-260q11-12 11-28t-11-27L505 287q-11-11-26.5-11T452 " +
                "287L192 547q-11 11-11 27.5t11 27.5l260 260ZM322 686V535q0-11 11-22t22-11h209l-59-59 43-42 " +
                "129 129-134 136-43-42 62-62H382v124h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "assistant-direction-icon";
    }
}
