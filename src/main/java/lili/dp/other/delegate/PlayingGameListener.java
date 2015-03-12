package lili.dp.other.delegate;

import java.util.Date;

/**
 * Created by lili on 15/2/20.
 */
public class PlayingGameListener {

    public PlayingGameListener(){
        System.out.println("我正在玩游戏 开始时间"+new Date());
    }
    public void stopPlayingGame(Date date){
        System.out.println("老师来了，快回到座位上，结束时间"+date);
    }
}
