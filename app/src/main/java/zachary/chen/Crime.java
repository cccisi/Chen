package zachary.chen;

import java.util.UUID;

/**
 * Created by cccis on 2018/2/6.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        //生成特定指示符
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
