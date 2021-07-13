package io.igx.proxy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Vinicius Carvalho
 */
@NoArgsConstructor
@Getter
@Setter
public class ConnectionStats {

    private AtomicInteger connectionCount = new AtomicInteger(0);
    private AtomicLong bytesSent = new AtomicLong(0L);
    private AtomicLong bytesReceived = new AtomicLong(0L);

    public ConnectionStats(long bytesSent, long bytesReceived) {
        this.bytesSent.set(bytesSent);
        this.bytesReceived.set(bytesReceived);
    }

    public long appendBytesSent(long delta) {
        return bytesSent.getAndAdd(delta);
    }

    public long appendBytesReceived(long delta) {
        return bytesReceived.getAndAdd(delta);
    }
}


