package io.igx.proxy.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Vinicius Carvalho
 */
@Getter
@Setter
public class ProxyDefinition {

    private final long startedTime;
    private final String id;

    private String alias;
    private Integer remotePort;
    private String remoteHost;
    private boolean debug;
    private Integer localPort;
    private boolean active = false;
    private ConnectionStats connectionStats;
    private Qos qos;

    public ProxyDefinition(CreateProxyRequest request) {

        this.id = UUID.randomUUID().toString();
        this.startedTime = System.currentTimeMillis();

        this.connectionStats = new ConnectionStats();
        this.qos = new Qos();
        this.remoteHost = request.getRemoteHost();
        this.remotePort = request.getRemotePort();
        this.localPort = request.getLocalPort();
        this.alias = request.getAlias();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProxyDefinition that = (ProxyDefinition) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
