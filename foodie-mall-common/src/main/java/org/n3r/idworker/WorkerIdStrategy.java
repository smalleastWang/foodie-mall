package org.n3r.idworker;

import org.springframework.stereotype.Component;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
