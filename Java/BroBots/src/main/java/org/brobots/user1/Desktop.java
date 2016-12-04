package org.brobots.user1;

import org.brobots.user1.details.AbstractCircuitBoard;

/**
 * Created by anton on 28.11.2016.
 */
class Desktop extends AbstractComputer {

    public Desktop(SystemBlock systemBlock, Monitor monitor) {
        super(systemBlock, monitor);
    }

    Desktop(AbstractCircuitBoard[] details, Monitor monitor) {
        super(details, monitor);
        operationSystem = new Linux();
    }

    class Linux extends OperationSystem {

        private boolean serverIsActive;

        public void serverIsActive(boolean isActive) {
            this.serverIsActive = isActive;
            System.out.println("Server has been started successfully");
        }

        boolean establishConnection() {
            if (serverIsActive)
                return true;
            else {
                System.out.println("Server is inactive: please, start the server");
                return false;
            }

        }

    }

}
