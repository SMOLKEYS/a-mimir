package amimir;

import arc.*;
import arc.util.*;
import arc.util.async.Threads;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import amimir.throwable.AmimirThrowable;

import static mindustry.Vars.*;

public class Amimir extends Mod{

    public Amimir(){

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {
                if(dataDirectory.child("amimir").exists() == false){
                    dataDirectory.child("amimir").child("amimir.txt").writeString("amimir no bueno");
                    ui.showOkText("amimir", "amimir", () -> Threads.throwAppException(new AmimirThrowable("amimir")));
                };
            });
        });
    }
}
