package org.brobots.user1;

import org.brobots.user1.details.MotherBoard;
import org.brobots.user1.details.Processor;
import org.brobots.user1.details.RAM;
import org.brobots.user1.details.VideoCard;

/**
 * Created by anton on 28.11.2016.
 */
class SystemBlock {

    private MotherBoard motherBoard;
    private Processor processor;
    private RAM ram;
    private VideoCard videoCard;

    SystemBlock(MotherBoard motherBoard, Processor processor, RAM ram, VideoCard videoCard) {
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    void plug(Monitor monitor) {
        monitor.isPlugged(true);
    }

    void turnSystemBlock(boolean isActive) {
        motherBoard.energize(isActive);
        processor.energize(isActive);
        ram.energize(isActive);
        videoCard.energize(isActive);

        if (motherBoard.isEnergized() & processor.isEnergized() & ram.isEnergized() & videoCard.isEnergized())
            System.out.println("Computer is turned on");
        else
            System.out.println("Computer is turned off");
    }

}
