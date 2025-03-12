package com.gmail.pokepuff37.bls.commands;

import com.mojang.brigadier.Command;
import net.minecraft.server.command.ServerCommandSource;

public class EventTest {
    Command<ServerCommandSource> EventTest= context -> {
        ServerCommandSource source = context.getSource();
        return 0;
    };
}