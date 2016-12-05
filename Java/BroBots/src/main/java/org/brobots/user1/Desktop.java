package org.brobots.user1;

import org.brobots.user1.details.AbstractCircuitBoard;

/**
 * Created by anton on 28.11.2016.
 */
class Desktop extends AbstractComputer {

    Desktop(AbstractCircuitBoard[] details, Monitor monitor) {
        super(details, monitor);
        operationSystem = new Linux();
    }

    class Linux extends OperationSystem {

        private boolean serverIsActive;

        void startServer() {
            this.serverIsActive = true;
            System.out.println("Server has been started successfully");
        }

        boolean serverIsActive() {
            return serverIsActive;
        }

        boolean establishConnection() {
            System.out.println("Connection is established successfully");
            return true;
        }

    }

}
