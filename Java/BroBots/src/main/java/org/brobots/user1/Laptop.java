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

    class Windows extends OperationSystem {

        private boolean
                clientIsActive,
                connectionIsEstablished;


        void startClient() {
            this.clientIsActive = true;
            System.out.println("Client has been started successfully");
        }

        void connectToServer(Desktop desktop) {
            Desktop.Linux linux = (Desktop.Linux) desktop.getOperationSystem();
            if (clientIsActive & linux.serverIsActive()) {
                connectionIsEstablished = linux.establishConnection();
            }
            else {
                System.out.println("Didn't manage to connect to server: client or server is not active");
                System.exit(0);
            }

        }

        void sendMessage(String message) {
            System.out.println((connectionIsEstablished) ? "\"" + message + "\"" + " has been sent successfully" : "Connection is not established");
        }

    }

}
