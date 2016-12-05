package org.brobots.user1;

import org.brobots.user1.details.*;

/**
 * Created by anton on 23.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        Desktop desktop = defineDesktopPC();
        Laptop.Windows windows = (Laptop.Windows) defineLaptopPC();

        windows.connectToServer(desktop);
        windows.sendMessage("blabla");
    }

    private static Desktop defineDesktopPC() {
        System.out.println("Assembling Desktop PC...");

        AbstractCircuitBoard[] abstractCircuitBoards = {new MotherBoard(), new Processor(), new RAM(), new VideoCard()};
        Monitor monitorForDesktop = new Monitor();
        Desktop desktop = new Desktop(abstractCircuitBoards, monitorForDesktop);

        SystemBlock desktopSystemBlock = desktop.getSystemBlock();
        desktopSystemBlock.plug(monitorForDesktop);

        desktopSystemBlock.turnSystemBlock(true);
        monitorForDesktop.turnMonitor(true);

        Desktop.Linux linux = (Desktop.Linux) desktop.getOperationSystem();
        linux.startServer();

        return desktop;
    }

    private static OperationSystem defineLaptopPC() {
        System.out.println("Assembling Laptop PC...");

        SystemBlock laptopSystemBlock = new SystemBlock(new MotherBoard(), new Processor(), new RAM(), new VideoCard());
        Monitor laptopMonitor = new Monitor();
        Laptop laptop = new Laptop(laptopSystemBlock, laptopMonitor);
        laptopSystemBlock.plug(laptopMonitor);

        laptopSystemBlock.turnSystemBlock(true);
        laptopMonitor.turnMonitor(true);

        Laptop.Windows windows = (Laptop.Windows) laptop.getOperationSystem();
        windows.startClient();

        return windows;
    }

}
