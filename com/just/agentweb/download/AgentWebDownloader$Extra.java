package com.just.agentweb.download;

import com.cunba.lantu.otan.R.drawable;
import java.io.Serializable;
import java.util.Map;

public abstract class AgentWebDownloader$Extra
  implements Serializable
{
  public boolean o00OoOoo = false;
  public int o00Ooo0;
  public boolean o00Ooo00;
  public boolean o00Ooo0O;
  public boolean o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  public String o00OooOo;
  public Map o00OoooO;
  public boolean o00Ooooo;
  public int o00o000;
  public long o00o0000;
  public int o00o000O;
  public long o0O00o0;
  
  public AgentWebDownloader$Extra()
  {
    boolean bool = true;
    this.o00Ooo00 = bool;
    int i = R.drawable.ic_file_download_black_24dp;
    this.o00Ooo0 = i;
    this.o00Ooo0O = bool;
    this.o00Ooo0o = bool;
    this.o00Ooooo = false;
    this.o00o0000 = 9223372036854775807L;
    this.o00o000 = 10000;
    this.o00o000O = 600000;
  }
  
  public Extra OooO(int paramInt)
  {
    this.o00Ooo0 = paramInt;
    return this;
  }
  
  public Extra OooO00o(boolean paramBoolean)
  {
    this.o00Ooooo = paramBoolean;
    return this;
  }
  
  public Extra OooO0O0(int paramInt)
  {
    this.o00o000O = paramInt;
    return this;
  }
  
  public Extra OooO0OO(int paramInt)
  {
    this.o00o000 = paramInt;
    return this;
  }
  
  public Extra OooO0Oo(long paramLong)
  {
    this.o00o0000 = paramLong;
    return this;
  }
  
  public Extra OooO0o(boolean paramBoolean)
  {
    this.o00Ooo00 = paramBoolean;
    return this;
  }
  
  public Extra OooO0oo(boolean paramBoolean)
  {
    this.o00OoOoo = paramBoolean;
    return this;
  }
  
  public Extra OooOO0(boolean paramBoolean)
  {
    this.o00Ooo0o = paramBoolean;
    return this;
  }
  
  public Extra OooOO0O(boolean paramBoolean)
  {
    this.o00Ooo0O = paramBoolean;
    return this;
  }
  
  public int getBlockMaxTime()
  {
    return this.o00o000O;
  }
  
  public int getConnectTimeOut()
  {
    return this.o00o000;
  }
  
  public String getContentDisposition()
  {
    return this.o00OooOO;
  }
  
  public long getContentLength()
  {
    return this.o0O00o0;
  }
  
  public long getDownloadTimeOut()
  {
    return this.o00o0000;
  }
  
  public Map getHeaders()
  {
    return this.o00OoooO;
  }
  
  public int getIcon()
  {
    return this.o00Ooo0;
  }
  
  public String getMimetype()
  {
    return this.o00OooOo;
  }
  
  public String getUrl()
  {
    return this.o00OooO0;
  }
  
  public String getUserAgent()
  {
    return this.o00OooO;
  }
  
  public boolean isAutoOpen()
  {
    return this.o00Ooooo;
  }
  
  public boolean isEnableIndicator()
  {
    return this.o00Ooo00;
  }
  
  public boolean isForceDownload()
  {
    return this.o00OoOoo;
  }
  
  public boolean isOpenBreakPointDownload()
  {
    return this.o00Ooo0o;
  }
  
  public boolean isParallelDownload()
  {
    return this.o00Ooo0O;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.AgentWebDownloader.Extra
 * JD-Core Version:    0.7.0.1
 */