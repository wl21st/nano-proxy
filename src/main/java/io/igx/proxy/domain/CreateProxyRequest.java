package io.igx.proxy.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vinicius Carvalho
 */
@Getter
@Setter
public class CreateProxyRequest {

    private String alias;
    private Integer remotePort;
    private String remoteHost;
    private boolean debug;
    private Integer localPort;

}
