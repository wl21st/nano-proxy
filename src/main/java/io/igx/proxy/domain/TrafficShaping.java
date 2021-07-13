package io.igx.proxy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vinicius Carvalho
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrafficShaping {

    public static final long DEFAULT_CHECK_INTERVAL = 1000l;
    public static final long DEFAULT_MAX_TIME = 1000l;
    
    private long writeLimit;
    private long readLimit;
    private long checkInterval;
    private long maxTime;

    public TrafficShaping(long writeLimit, long readLimit) {
        this(writeLimit, readLimit, DEFAULT_CHECK_INTERVAL, DEFAULT_MAX_TIME);
    }

}
