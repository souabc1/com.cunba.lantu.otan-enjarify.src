package com.qinggan.content;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

class UserConfigManager$XmlConfig$MemoryCommitResult
{
  public boolean OooO00o;
  public Map OooO0O0;
  public volatile boolean OooO0OO;
  public final CountDownLatch OooO0Oo;
  
  private UserConfigManager$XmlConfig$MemoryCommitResult()
  {
    CountDownLatch localCountDownLatch = new java/util/concurrent/CountDownLatch;
    localCountDownLatch.<init>(1);
    this.OooO0Oo = localCountDownLatch;
    this.OooO0OO = false;
  }
  
  public void setDiskWriteResult(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
    this.OooO0Oo.countDown();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.content.UserConfigManager.XmlConfig.MemoryCommitResult
 * JD-Core Version:    0.7.0.1
 */