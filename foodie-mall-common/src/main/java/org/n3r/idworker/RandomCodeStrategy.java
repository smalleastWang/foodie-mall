package org.n3r.idworker;

import org.springframework.stereotype.Component;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
