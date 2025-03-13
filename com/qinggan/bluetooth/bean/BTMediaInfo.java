package com.qinggan.bluetooth.bean;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import m54207b69;

public class BTMediaInfo
{
  public long OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  public String OooO0Oo;
  public byte[] OooO0o;
  public MediaMetadata OooO0o0;
  
  public BTMediaInfo()
  {
    byte[] arrayOfByte = new byte[8];
    this.OooO0o = arrayOfByte;
  }
  
  public final String OooO00o(MediaMetadata paramMediaMetadata)
  {
    if (paramMediaMetadata == null) {
      return m54207b69.F54207b69_11("u=7349535421755E605C657A635569676B596D2E");
    }
    paramMediaMetadata = new java/lang/StringBuilder;
    paramMediaMetadata.<init>();
    Object localObject = m54207b69.F54207b69_11("TM00292B2730052E403432364438437B133E33352B53398D");
    paramMediaMetadata.append((String)localObject);
    localObject = this.OooO0o0;
    String str = m54207b69.F54207b69_11("dA20302736322D2B76342D2F332C7C3A33453137334935851C202B2B281C353C27222F314138382E");
    localObject = ((MediaMetadata)localObject).getString(str);
    paramMediaMetadata.append((String)localObject);
    localObject = m54207b69.F54207b69_11("iW7B781541282C413D36273E43457A");
    paramMediaMetadata.append((String)localObject);
    localObject = this.OooO0o0;
    str = m54207b69.F54207b69_11("Gg060A05180C130950120B0D191256181123171519271B5F3A464D5146425B564D44494B");
    boolean bool = ((MediaMetadata)localObject).containsKey(str);
    paramMediaMetadata.append(bool);
    paramMediaMetadata.append(" }");
    return paramMediaMetadata.toString();
  }
  
  public Bitmap getDisplayIcon()
  {
    MediaMetadata localMediaMetadata = this.OooO0o0;
    if (localMediaMetadata != null)
    {
      String str = m54207b69.F54207b69_11("Gg060A05180C130950120B0D191256181123171519271B5F3A464D5146425B564D44494B");
      return localMediaMetadata.getBitmap(str);
    }
    return null;
  }
  
  public String getDisplayIconUrl()
  {
    MediaMetadata localMediaMetadata = this.OooO0o0;
    if (localMediaMetadata != null)
    {
      String str = m54207b69.F54207b69_11("dA20302736322D2B76342D2F332C7C3A33453137334935851C202B2B281C353C27222F314138382E");
      return localMediaMetadata.getString(str);
    }
    return null;
  }
  
  public MediaMetadata getMetadata()
  {
    return this.OooO0o0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("JV14031D3636443D2640394338820F4D314A447D84");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0Oo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("OF616B680A3837353C3A846B");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0OO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("~V717B781A3E392942737A");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0O0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("h_787481163E363E323F6B");
    localStringBuilder.append((String)localObject);
    long l = this.OooO00o;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("3{5B07595E1017151A631F281A262C281E2A57");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0o0;
    localObject = OooO00o((MediaMetadata)localObject);
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.bean.BTMediaInfo
 * JD-Core Version:    0.7.0.1
 */