package com.qinggan.content;

import java.util.concurrent.CountDownLatch;

class UserConfigManager$XmlConfig$EditorImpl$1
  implements Runnable
{
  public UserConfigManager$XmlConfig$EditorImpl$1(UserConfigManager.XmlConfig.EditorImpl paramEditorImpl, UserConfigManager.XmlConfig.MemoryCommitResult paramMemoryCommitResult) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.o00Ooo00;
      localObject = ((UserConfigManager.XmlConfig.MemoryCommitResult)localObject).OooO0Oo;
      ((CountDownLatch)localObject).await();
      label14:
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label14;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.content.UserConfigManager.XmlConfig.EditorImpl.1
 * JD-Core Version:    0.7.0.1
 */