package com.xuexiang.xui.widget.imageview.preview.ui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import m54207b69;

class VideoPlayerActivity$1
  implements MediaPlayer.OnErrorListener
{
  public VideoPlayerActivity$1(VideoPlayerActivity paramVideoPlayerActivity) {}
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMediaPlayer;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    return m54207b69.F54207b69_01(4256, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity.1
 * JD-Core Version:    0.7.0.1
 */