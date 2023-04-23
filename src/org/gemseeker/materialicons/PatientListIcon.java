package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PatientListIcon extends SVGIcon {

    public PatientListIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public PatientListIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M640 653q-51 0-84.5-33.5T522 535q0-51 33.5-84.5T640 417q51 0 84.5 33.5T758 535q0 51-33.5 " +
                "84.5T640 653ZM400 896v-66q0-19 9-36t24-24q45-32 98.5-47.5T640 707q55 0 108 17t99 46q14 10 23.5 " +
                "25.5T880 830v66H400ZM120 646v-60h306v60H120Zm0-330v-60h473v60H120Zm349 165H120v-60h380q-11 13-18.5 " +
                "28T469 481Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "patient-list-icon";
    }
}
