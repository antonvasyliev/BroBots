package org.brobots.user1;

import org.brobots.user1.details.*;

/**
 * Created by anton on 28.11.2016.
 */
abstract class AbstractComputer {

    OperationSystem operationSystem;

    private SystemBlock systemBlock;

    private Monitor monitor;

    AbstractComputer(SystemBlock systemBlock, Monitor monitor) {
        this.systemBlock = systemBlock;
        this.monitor = monitor;
    }

    AbstractComputer(AbstractCircuitBoard[] details, Monitor monitor) {
        this(
                new SystemBlock(
                        (MotherBoard) details[0],
                        (Processor) details[1],
                        (RAM) details[2],
                        (VideoCard) details[3]),
                monitor
        );

    }

    SystemBlock getSystemBlock() {
        return systemBlock;
    }

    OperationSystem getOperationSystem() {
        return operationSystem;
    }

}
