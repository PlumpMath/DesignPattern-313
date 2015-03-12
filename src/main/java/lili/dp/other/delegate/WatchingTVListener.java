package lili.dp.other.delegate;

import java.util.Date;

/**
 * Created by lili on 15/2/20.
 */
public class WatchingTVListener {
    public WatchingTVListener(){
        System.out.println("我正在看电视 "+new Date());
    }
    public void stopWatchingTV(Date date){
        System.out.println("老师来了，快关闭电视 。 结束时间"+date);
    }
}
