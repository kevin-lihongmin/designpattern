package com.kevin.designpattern.source.builder;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class BuilderPatternZookeeper {

    public static void main(String[] args) {
        RetryPolicy retryPolicy  = new ExponentialBackoffRetry(1000,3);

        CuratorFramework client = CuratorFrameworkFactory.builder()
                .connectString("hadoop1:2181,hadoop2:2181,hadoop3:2181")
                .sessionTimeoutMs(3000)
                .connectionTimeoutMs(5000)
                .retryPolicy(retryPolicy)
                .build();
        client.start();
    }
}
