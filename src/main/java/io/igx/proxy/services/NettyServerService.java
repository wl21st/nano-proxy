package io.igx.proxy.services;

import io.igx.proxy.domain.ConnectionStats;
import io.igx.proxy.domain.CreateProxyRequest;
import io.igx.proxy.domain.ProxyDefinition;
import io.igx.proxy.domain.TrafficShaping;

import java.util.Set;

/**
 * @author Vinicius Carvalho
 */
public interface NettyServerService {

    ProxyDefinition createServer(CreateProxyRequest createProxyRequest);

    void startServer(String id);

    void stopServer(String id);

    ProxyDefinition getProxyDefinition(String id);

    Set<ProxyDefinition> listServers();

    ConnectionStats getStats(String id);

    void configureTraffic(String id, TrafficShaping config);

}
