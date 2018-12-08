package com.neemre.btcdcli4j.daemon;

import com.neemre.btcdcli4j.daemon.event.AlertListener;
import com.neemre.btcdcli4j.daemon.event.BlockListener;
import com.neemre.btcdcli4j.daemon.event.WalletListener;

import java.util.Properties;

public interface BtcdDaemon {

    void addAlertListener(AlertListener listener);

    int countAlertListeners();

    void removeAlertListener(AlertListener listener);

    void removeAlertListeners();

    void addBlockListener(BlockListener listener);

    int countBlockListeners();

    void removeBlockListener(BlockListener listener);

    void removeBlockListeners();

    void addWalletListener(WalletListener listener);

    int countWalletListeners();

    void removeWalletListener(WalletListener listener);

    void removeWalletListeners();

    boolean isMonitoring(Notifications notificationType);

    boolean isMonitoringAny();

    boolean isMonitoringAll();

    Properties getNodeConfig();

    void shutdown();
}