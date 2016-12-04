package org.brobots.user1;

import org.brobots.user1.details.*;

/**
 * Created by anton on 23.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        // create desktop PC
        AbstractCircuitBoard[] abstractCircuitBoards = {new MotherBoard(), new Processor(), new RAM(), new VideoCard()};
        Monitor monitorForDesktop = new Monitor();
        Desktop desktop = new Desktop(abstractCircuitBoards, monitorForDesktop);

        SystemBlock desktopSystemBlock = desktop.getSystemBlock();
        desktopSystemBlock.plug(monitorForDesktop);

        desktopSystemBlock.turnSystemBlock(true);
        monitorForDesktop.turnMonitor(true);

        Desktop.Linux linux = (Desktop.Linux) desktop.getOperationSystem();
        linux.serverIsActive(true);

        SystemBlock laptopSystemBlock = new SystemBlock(new MotherBoard(), new Processor(), new RAM(), new VideoCard());
        Monitor laptopMonitor = new Monitor();
        Laptop laptop = new Laptop(laptopSystemBlock, laptopMonitor);

        laptopSystemBlock.turnSystemBlock(true);
        laptopMonitor.turnMonitor(true);

        Laptop.Windows windows = (Laptop.Windows) laptop.getOperationSystem();
        windows.clientIsActive(true);
        windows.connectToServer(desktop);
        windows.sendMessage("blabla");
    }

}
