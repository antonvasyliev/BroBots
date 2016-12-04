package org.brobots.user1;

import org.brobots.user1.details.AbstractCircuitBoard;

/**
 * Created by anton on 28.11.2016.
 */
public class Laptop extends AbstractComputer {

    Laptop(SystemBlock systemBlock, Monitor monitor) {
        super(systemBlock, monitor);
        operationSystem = new Windows();
    }

    public Laptop(AbstractCircuitBoard[] details, Monitor monitor) {
        super(details, monitor);
    }

    class Windows extends OperationSystem {

        private boolean
                clientIsActive,
                connectionIsEstablished;


        public void clientIsActive(boolean isActive) {
            this.clientIsActive = isActive;
        }

        public void connectToServer(Desktop desktop) {
            if (clientIsActive) {
                Desktop.Linux linux = (Desktop.Linux) desktop.getOperationSystem();
                connectionIsEstablished = linux.establishConnection();
                System.out.println("Connection is established successfully");
            }
            else {
                System.out.println("Didn't manage to connect to server: client is not active");
            }

        }

        public void sendMessage(String message) {
            System.out.println((connectionIsEstablished) ? "\"" + message + "\"" + " is sent successfully" : "Connection is not established");
        }

    }

}
