package com.just.agentweb.download;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

class DefaultDownloadImpl$ExecuteTasksMap
  extends ReentrantReadWriteLock
{
  public static volatile ExecuteTasksMap o00Ooo00;
  public LinkedList o00OoOoo = null;
  
  private DefaultDownloadImpl$ExecuteTasksMap()
  {
    super(false);
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    this.o00OoOoo = localLinkedList;
  }
  
  public static ExecuteTasksMap getInstance()
  {
    ??? = o00Ooo00;
    if (??? == null) {
      synchronized (ExecuteTasksMap.class)
      {
        ExecuteTasksMap localExecuteTasksMap2 = o00Ooo00;
        if (localExecuteTasksMap2 == null)
        {
          localExecuteTasksMap2 = new com/just/agentweb/download/DefaultDownloadImpl$ExecuteTasksMap;
          localExecuteTasksMap2.<init>();
          o00Ooo00 = localExecuteTasksMap2;
        }
      }
    }
    return o00Ooo00;
  }
  
  public void OooO00o(String paramString1, String paramString2)
  {
    Object localObject = writeLock();
    ((ReentrantReadWriteLock.WriteLock)localObject).lock();
    try
    {
      localObject = this.o00OoOoo;
      ((LinkedList)localObject).add(paramString1);
      paramString1 = this.o00OoOoo;
      paramString1.add(paramString2);
      return;
    }
    finally
    {
      writeLock().unlock();
    }
  }
  
  public boolean OooO0O0(String paramString)
  {
    Object localObject = readLock();
    ((ReentrantReadWriteLock.ReadLock)localObject).lock();
    try
    {
      localObject = this.o00OoOoo;
      boolean bool = ((LinkedList)localObject).contains(paramString);
      return bool;
    }
    finally
    {
      readLock().unlock();
    }
  }
  
  public void OooO0OO(String paramString)
  {
    Object localObject = writeLock();
    ((ReentrantReadWriteLock.WriteLock)localObject).lock();
    try
    {
      localObject = this.o00OoOoo;
      int i = ((LinkedList)localObject).indexOf(paramString);
      int j = -1;
      if (i == j) {
        return;
      }
      localObject = this.o00OoOoo;
      ((LinkedList)localObject).remove(i);
      localObject = this.o00OoOoo;
      i += -1;
      ((LinkedList)localObject).remove(i);
      return;
    }
    finally
    {
      writeLock().unlock();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.DefaultDownloadImpl.ExecuteTasksMap
 * JD-Core Version:    0.7.0.1
 */