package com.just.agentweb.download;

import java.util.concurrent.ConcurrentHashMap;

public final class CancelDownloadInformer
{
  public ConcurrentHashMap OooO00o = null;
  
  private CancelDownloadInformer()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.OooO00o = localConcurrentHashMap;
  }
  
  public static CancelDownloadInformer getInformer()
  {
    return CancelDownloadInformer.InformerHolder.OooO00o();
  }
  
  public void OooO00o(String paramString, CancelDownloadRecipient paramCancelDownloadRecipient)
  {
    if ((paramString != null) && (paramCancelDownloadRecipient != null))
    {
      ConcurrentHashMap localConcurrentHashMap = this.OooO00o;
      localConcurrentHashMap.put(paramString, paramCancelDownloadRecipient);
    }
  }
  
  public void OooO0O0(String paramString)
  {
    ConcurrentHashMap localConcurrentHashMap = this.OooO00o;
    paramString = (CancelDownloadRecipient)localConcurrentHashMap.get(paramString);
    if (paramString != null) {
      paramString.OooO00o();
    }
  }
  
  public void OooO0OO(String paramString)
  {
    if (paramString != null)
    {
      ConcurrentHashMap localConcurrentHashMap = this.OooO00o;
      localConcurrentHashMap.remove(paramString);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.CancelDownloadInformer
 * JD-Core Version:    0.7.0.1
 */