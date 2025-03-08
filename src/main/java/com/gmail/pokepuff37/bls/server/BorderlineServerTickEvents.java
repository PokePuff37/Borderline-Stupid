package com.gmail.pokepuff37.bls.server;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class BorderlineServerTickEvents {
    long timerTicks = 0L;
    int timerSeconds = 0;
    int timerMinutes = 0;
    boolean isRunning = false;

    public void timerCount() {
        ServerTickEvents.START_SERVER_TICK.register(minecraftServer -> {
            if (isRunning) {
                timerTicks += 1;
                System.out.print(timerTicks);
            }
        });
    }
}